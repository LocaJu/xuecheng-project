package com.xuecheng.content.mapper;

import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;
import org.apache.ibatis.annotations.ResultMap;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TeachplanMapper extends Mapper<Teachplan> {
    /**
     * @description 查询某课程的课程计划，组成树型结构
     * @param courseId
     * @return com.xuecheng.content.model.dto.TeachplanDto
     * @author Mr.M
     * @date 2022/9/9 11:10
     */

    public List<TeachplanDto> selectTreeNodes(long courseId);


}