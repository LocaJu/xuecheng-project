package com.xuecheng.content.model.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "teachplan")
public class Teachplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;

    /**
     * 课程计划名称
     */
    private String pname;

    /**
     * 课程计划父级Id
     */
    private Long parentid;

    /**
     * 层级，分为1、2、3级
     */
    private Integer grade;

    /**
     * 课程类型:1视频、2文档
     */
    @Column(name = "media_type")
    private String mediaType;

    /**
     * 开始直播时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 直播结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 章节及课程时介绍
     */
    private String description;

    /**
     * 时长，单位时:分:秒
     */
    private String timelength;

    /**
     * 排序字段
     */
    private Integer orderby;

    /**
     * 课程标识
     */
    @Column(name = "course_id")
    private Long courseId;

    /**
     * 课程发布标识
     */
    @Column(name = "course_pub_id")
    private Long coursePubId;

    /**
     * 状态（1正常  0删除）
     */
    private Integer status;

    /**
     * 是否支持试学或预览（试看）
     */
    @Column(name = "is_preview")
    private String isPreview;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @Column(name = "change_date")
    private Date changeDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取课程计划名称
     *
     * @return pname - 课程计划名称
     */
    public String getPname() {
        return pname;
    }

    /**
     * 设置课程计划名称
     *
     * @param pname 课程计划名称
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * 获取课程计划父级Id
     *
     * @return parentid - 课程计划父级Id
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * 设置课程计划父级Id
     *
     * @param parentid 课程计划父级Id
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取层级，分为1、2、3级
     *
     * @return grade - 层级，分为1、2、3级
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置层级，分为1、2、3级
     *
     * @param grade 层级，分为1、2、3级
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * 获取课程类型:1视频、2文档
     *
     * @return media_type - 课程类型:1视频、2文档
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * 设置课程类型:1视频、2文档
     *
     * @param mediaType 课程类型:1视频、2文档
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * 获取开始直播时间
     *
     * @return start_time - 开始直播时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始直播时间
     *
     * @param startTime 开始直播时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取直播结束时间
     *
     * @return end_time - 直播结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置直播结束时间
     *
     * @param endTime 直播结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取章节及课程时介绍
     *
     * @return description - 章节及课程时介绍
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置章节及课程时介绍
     *
     * @param description 章节及课程时介绍
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取时长，单位时:分:秒
     *
     * @return timelength - 时长，单位时:分:秒
     */
    public String getTimelength() {
        return timelength;
    }

    /**
     * 设置时长，单位时:分:秒
     *
     * @param timelength 时长，单位时:分:秒
     */
    public void setTimelength(String timelength) {
        this.timelength = timelength;
    }

    /**
     * 获取排序字段
     *
     * @return orderby - 排序字段
     */
    public Integer getOrderby() {
        return orderby;
    }

    /**
     * 设置排序字段
     *
     * @param orderby 排序字段
     */
    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    /**
     * 获取课程标识
     *
     * @return course_id - 课程标识
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * 设置课程标识
     *
     * @param courseId 课程标识
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * 获取课程发布标识
     *
     * @return course_pub_id - 课程发布标识
     */
    public Long getCoursePubId() {
        return coursePubId;
    }

    /**
     * 设置课程发布标识
     *
     * @param coursePubId 课程发布标识
     */
    public void setCoursePubId(Long coursePubId) {
        this.coursePubId = coursePubId;
    }

    /**
     * 获取状态（1正常  0删除）
     *
     * @return status - 状态（1正常  0删除）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（1正常  0删除）
     *
     * @param status 状态（1正常  0删除）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否支持试学或预览（试看）
     *
     * @return is_preview - 是否支持试学或预览（试看）
     */
    public String getIsPreview() {
        return isPreview;
    }

    /**
     * 设置是否支持试学或预览（试看）
     *
     * @param isPreview 是否支持试学或预览（试看）
     */
    public void setIsPreview(String isPreview) {
        this.isPreview = isPreview;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改时间
     *
     * @return change_date - 修改时间
     */
    public Date getChangeDate() {
        return changeDate;
    }

    /**
     * 设置修改时间
     *
     * @param changeDate 修改时间
     */
    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }
}