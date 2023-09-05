package com.xuecheng.content.service.impl;

import com.xuecheng.base.until.StringUtils;
import com.xuecheng.content.mapper.CourseTeacherMapper;
import com.xuecheng.content.model.po.CourseTeacher;
import com.xuecheng.content.service.CourseTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @author 77286
 * @version 1.0
 * @description: TODO
 * @date 2023/9/4 21:36
 */
@Service
public class CourseTeacherServiceImpl implements CourseTeacherService {

    @Autowired
    private CourseTeacherMapper courseTeacherMapper;
    @Override
    public List<CourseTeacher> getCourseTeacherList(Long courseBaseId) {

        List<CourseTeacher> CourseTeacherList = courseTeacherMapper.selectByExample(Example.builder(CourseTeacher.class).where(Sqls.custom()
                        .andEqualTo("courseId", courseBaseId))
                .build());

        return CourseTeacherList;
    }

    @Override
    public void saveCourseTeacher(CourseTeacher courseTeacher) {
        Long id = courseTeacher.getId();
        if (StringUtils.isNull(id)){
            courseTeacherMapper.insert(courseTeacher);
        }else {
            courseTeacherMapper.updateByPrimaryKeySelective(courseTeacher);
        }
    }

    @Override
    public void deleteCourseTeacher(Long courseBaseId, Long courseTeacherId) {
        courseTeacherMapper.deleteByExample(Example.builder(CourseTeacher.class).where(Sqls.custom()
                .andEqualTo("id",courseTeacherId)
                .andEqualTo("courseId",courseBaseId)).build());
    }
}
