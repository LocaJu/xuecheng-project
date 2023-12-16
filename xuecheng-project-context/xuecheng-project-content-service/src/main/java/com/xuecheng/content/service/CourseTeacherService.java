package com.xuecheng.content.service;

import com.xuecheng.content.model.po.CourseTeacher;

import java.util.List;

public interface CourseTeacherService {
    List<CourseTeacher> getCourseTeacherList(Long courseBaseId);

    void saveCourseTeacher(CourseTeacher courseTeacher);

    void deleteCourseTeacher(Long courseBaseId, Long courseTeacherId);
}
