package com.xuecheng.content.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateTime;
import com.xuecheng.base.exception.XueChengPlusException;
import com.xuecheng.base.until.StringUtils;
import com.xuecheng.content.mapper.TeachplanMapper;

import com.xuecheng.content.mapper.TeachplanMediaMapper;
import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;
import com.xuecheng.content.service.TeachplanService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.Date;
import java.util.List;

/**


/**
 * @description 课程计划service接口实现类
 * @author Mr.M
 * @date 2022/9/9 11:14
 * @version 1.0
 */
@Service
public class TeachplanServiceImpl implements TeachplanService {

    @Autowired
    private TeachplanMapper teachplanMapper;

    @Autowired
    private TeachplanMediaMapper teachplanMediaMapper;
    @Override
    public List<TeachplanDto> findTeachplanTree(long courseId) {
        return teachplanMapper.selectTreeNodes(courseId);
    }

    @Transactional
    @Override
    public void saveTeachplan(SaveTeachplanDto teachplanDto) {

        //课程计划id
        Long id = teachplanDto.getId();
        //修改课程计划
        if(id!=null){
            Teachplan teachplan = teachplanMapper.selectByPrimaryKey(id);
            BeanUtils.copyProperties(teachplanDto,teachplan);
            teachplan.setChangeDate(DateTime.now());
            teachplanMapper.updateByPrimaryKey(teachplan);
        }else{
            //取出同父同级别的课程计划数量
            int count = getTeachplanCount(teachplanDto.getCourseId(), teachplanDto.getParentid());
            Teachplan teachplanNew = new Teachplan();
            //设置排序号
            teachplanNew.setOrderby(count+1);
            //BeanUtils.copyProperties(teachplanDto,teachplanNew);
            BeanUtil.copyProperties(teachplanDto,teachplanNew);
            teachplanNew.setCreateDate(DateTime.now());
            teachplanMapper.insertSelective(teachplanNew);

        }

    }
    /**
     * @description 获取最新的排序号
     * @param courseId  课程id
     * @param parentId  父课程计划id
     * @return int 最新排序号
     * @author Mr.M
     * @date 2022/9/9 13:43
     */
    private int getTeachplanCount(long courseId,long parentId){

        int count = teachplanMapper.selectCountByExample(Example.builder(Teachplan.class)
                .where(Sqls.custom()
                        .andEqualTo("courseId", courseId)
                        .andEqualTo("parentid", parentId))
                .build());

        return count;
    }


    @Transactional
    @Override
    public void deleteTeachplan(Long teachPlanId) {
        //根据id获取需要删除课程计划
        Teachplan teachplan = teachplanMapper.selectByPrimaryKey(teachPlanId);
        if (BeanUtil.isEmpty(teachplan)){
            XueChengPlusException.cast("课程不存在");
            return;
        }

        Integer grade = teachplan.getGrade();

        if (grade==1){ //顶级目录
            XueChengPlusException.cast("不允许删除顶级目录");
            return;
        }else {     //次级目录
            teachplanMediaMapper.deleteByExample(Example.builder(TeachplanMedia.class)
                    .where(Sqls.custom()
                    .andEqualTo("courseId",teachplan.getCourseId()))
                    .build());
        }
        teachplanMapper.deleteByPrimaryKey(teachplan);
    }
}
