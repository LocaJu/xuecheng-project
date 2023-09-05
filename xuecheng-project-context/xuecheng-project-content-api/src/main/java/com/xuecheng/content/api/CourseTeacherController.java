package com.xuecheng.content.api;

import com.xuecheng.content.model.po.CourseTeacher;
import com.xuecheng.content.service.CourseTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author 77286
 * @version 1.0
 * @description: TODO
 * @date 2023/9/4 21:38
 */
@Api(value = "师资管理编辑接口",tags = "师资管理编辑接口")
@RestController
public class CourseTeacherController {

    @Autowired
    private CourseTeacherService courseTeacherService;
    /**
     * @description: 获取课程对应的师资列表
     * @author: 77286
     * @date: 2023/9/4 21:52
     * @param: Long courseBaseId
     * @return: java.util.List<com.xuecheng.content.model.po.CourseTeacher>
     * @version 1.0
     **/
    @ApiOperation("获取课程对应的师资列表")
    @GetMapping("/courseTeacher/list/{courseBaseId}")
    public List<CourseTeacher> getCourseTeacherList(@PathVariable Long courseBaseId){
        return courseTeacherService.getCourseTeacherList(courseBaseId);
    }
    /**
     * @description: 添加课程对应的师资
     * @author: 77286
     * @date: 2023/9/4 22:07
     * @param: CourseTeacher courseTeacher
     * @return: void
     * @version 1.0
     **/
    @ApiOperation("添加课程对应的师资")
    @PostMapping("/courseTeacher")
    public void saveCourseTeacher(@RequestBody CourseTeacher courseTeacher){
        courseTeacherService.saveCourseTeacher(courseTeacher);
    }

    @ApiOperation("删除课程对应的师资")
    @DeleteMapping ("/courseTeacher/course/{courseBaseId}/{courseTeacherId}")
    public void deleteCourseTeacher(@PathVariable Long courseBaseId, @PathVariable Long courseTeacherId){
        courseTeacherService.deleteCourseTeacher(courseBaseId,courseTeacherId);
    }

}
