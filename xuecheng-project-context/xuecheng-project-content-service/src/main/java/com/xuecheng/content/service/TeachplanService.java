package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;

import java.util.List;

public interface TeachplanService {
    /**
     * @description 查询课程计划树型结构
     * @param courseId  课程id
     * @return List<TeachplanDto>
     * @author Mr.M
     * @date 2022/9/9 11:13
     */
    public List<TeachplanDto> findTeachplanTree(long courseId);

    /**
     * @description: 保存课程计划
     * @author: 77286
     * @date: 2023/9/4 17:19
     * @param: SaveTeachplanDto saveTeachplanDto
     * @return: void
     * @version 1.0
     **/
    public void saveTeachplan(SaveTeachplanDto saveTeachplanDto);

    /**
     * @description: 删除课程计划
     * @author: 77286 
     * @date: 2023/9/4 21:39
     * @param: Long teachPlanId
     * @return: void
     * @version 1.0
     **/
    void deleteTeachplan(Long teachPlanId);
}


