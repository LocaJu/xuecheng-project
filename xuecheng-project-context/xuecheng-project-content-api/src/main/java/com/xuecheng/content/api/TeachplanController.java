package com.xuecheng.content.api;

import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.service.TeachplanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
* @description: 课程计划编辑接口
* @author 77286
* @date 2023/9/3 21:29
* @version 1.0
*/
@Api(value = "课程计划编辑接口",tags = "课程计划编辑接口")
@RestController
public class TeachplanController {

    @Autowired
    private TeachplanService teachplanService;

    /**
     * @description: 查询课程计划树形结构
     * @author: 77286
     * @date: 2023/9/4 19:44
     * @param: Long courseId
     * @return: java.util.List<com.xuecheng.content.model.dto.TeachplanDto>
     * @version 1.0
     **/
    @ApiOperation("查询课程计划树形结构")
    @ApiImplicitParam(value = "courseId",name = "课程Id",required = true,dataType = "Long",paramType = "path")
    @GetMapping("/teachplan/{courseId}/tree-nodes")
    public List<TeachplanDto> getTreeNodes(@PathVariable Long courseId){
        return teachplanService.findTeachplanTree(courseId);
    }

    /**
     * @description: 课程计划创建或修改
     * @author: 77286
     * @date: 2023/9/4 19:44
     * @param: SaveTeachplanDto saveTeachplanDto
     * @return: void
     * @version 1.0
     **/
    @ApiOperation("课程计划创建或修改")
    @PostMapping("/teachplan")
    public void saveTeachplan(@RequestBody SaveTeachplanDto saveTeachplanDto){
        teachplanService.saveTeachplan(saveTeachplanDto);
    }

    /*
     * @description: 删除课程计划
     * @author: 77286 
     * @date: 2023/9/4 21:39
     * @param: Long teachPlanId
     * @return: void
     * @version 1.0
     **/
    @ApiOperation("删除课程计划")
    @DeleteMapping("/teachplan/{teachPlanId}")
    public void deleteTeachplan(@PathVariable Long teachPlanId){
        teachplanService.deleteTeachplan(teachPlanId);
    }


}
