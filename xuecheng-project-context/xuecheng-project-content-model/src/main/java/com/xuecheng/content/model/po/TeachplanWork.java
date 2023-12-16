package com.xuecheng.content.model.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "teachplan_work")
public class TeachplanWork {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 作业信息标识
     */
    @Column(name = "work_id")
    private Long workId;

    /**
     * 作业标题
     */
    @Column(name = "work_title")
    private String workTitle;

    /**
     * 课程计划标识
     */
    @Column(name = "teachplan_id")
    private Long teachplanId;

    /**
     * 课程标识
     */
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "course_pub_id")
    private Long coursePubId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取作业信息标识
     *
     * @return work_id - 作业信息标识
     */
    public Long getWorkId() {
        return workId;
    }

    /**
     * 设置作业信息标识
     *
     * @param workId 作业信息标识
     */
    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    /**
     * 获取作业标题
     *
     * @return work_title - 作业标题
     */
    public String getWorkTitle() {
        return workTitle;
    }

    /**
     * 设置作业标题
     *
     * @param workTitle 作业标题
     */
    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    /**
     * 获取课程计划标识
     *
     * @return teachplan_id - 课程计划标识
     */
    public Long getTeachplanId() {
        return teachplanId;
    }

    /**
     * 设置课程计划标识
     *
     * @param teachplanId 课程计划标识
     */
    public void setTeachplanId(Long teachplanId) {
        this.teachplanId = teachplanId;
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
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return course_pub_id
     */
    public Long getCoursePubId() {
        return coursePubId;
    }

    /**
     * @param coursePubId
     */
    public void setCoursePubId(Long coursePubId) {
        this.coursePubId = coursePubId;
    }
}