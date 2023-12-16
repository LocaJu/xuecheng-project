package com.xuecheng.content.mapper;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.model.po.CourseCategory;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CourseCategoryMapper extends Mapper<CourseCategory> {
    public List<CourseCategoryTreeDto> selectTreeNodes(String id);

    CourseCategory selectById(String st);
}