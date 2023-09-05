package com.xuecheng.context;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.base.model.WebResult;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class CourseBaseMapperTests {
    @Resource
    CourseBaseMapper courseBaseMapper;


    @Test
    void testCourseBaseMapper() {
        // 分页
//        Integer pageNum = orderAnalysisRule.getPage() == null ? 1 : orderAnalysisRule.getPage();
//        Integer pageSize = orderAnalysisRule.getPageSize() == null ? 10 : orderAnalysisRule.getPageSize();
//        PageHelper.startPage(1, 10);


        CourseBase courseBase = courseBaseMapper.selectByPrimaryKey(18);
//        PageInfo<CourseBase>()
//        System.out.println(courseBase);

//        //测试查询接口
//        LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper<>();
//        //查询条件
//        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
//        queryCourseParamsDto.setCourseName("java");
//        queryCourseParamsDto.setAuditStatus("202004");
//        queryCourseParamsDto.setPublishStatus("203001");
//
//        //拼接查询条件
//        //根据课程名称模糊查询  name like '%名称%'
//        queryWrapper.like(StringUtils.isNotEmpty(queryCourseParamsDto.getCourseName()),CourseBase::getName,queryCourseParamsDto.getCourseName());
//        //根据课程审核状态
//        queryWrapper.eq(StringUtils.isNotEmpty(queryCourseParamsDto.getAuditStatus()),CourseBase::getAuditStatus,queryCourseParamsDto.getAuditStatus());
//
//
//
//        //分页参数
//        PageParams pageParams = new PageParams();
//        pageParams.setPageNo(1L);//页码
//        pageParams.setPageSize(3L);//每页记录数
//        Page<CourseBase> page = new Page<>(pageParams.getPageNo(), pageParams.getPageSize());
//
//        //分页查询E page 分页参数, @Param("ew") Wrapper<T> queryWrapper 查询条件
//        Page<CourseBase> pageResult = courseBaseMapper.selectPage(page, queryWrapper);
//
//        //数据
//        List<CourseBase> items = pageResult.getRecords();
//        //总记录数
//        long total = pageResult.getTotal();
//
//        //准备返回数据 List<T> items, long counts, long page, long pageSize
//        PageResult<CourseBase> courseBasePageResult = new PageResult<>(items, total, pageParams.getPageNo(), pageParams.getPageSize());
//        System.out.println(courseBasePageResult);



    }

    @Autowired
    private CourseBaseInfoService courseBaseInfoService;

    @Test
    void testCourseBaseMapperq() {

        //查询条件
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
        queryCourseParamsDto.setCourseName("测试");
        queryCourseParamsDto.setAuditStatus("202005");


        //分页参数
        PageParams pageParams = new PageParams();
        pageParams.setPageNo(1);//页码
        pageParams.setPageSize(3);//每页记录数
        WebResult webResult = courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);
        System.out.println(webResult);

    }
    }


