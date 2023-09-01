package com.xuecheng.content.model.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "course_teacher")
public class CourseTeacher {
    /**
     * 主键
     */
    @Id
    private Long id;

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
     * 教师标识
     */
    @Column(name = "teacher_name")
    private String teacherName;

    /**
     * 教师职位
     */
    private String position;

    /**
     * 教师简介
     */
    private String introduction;

    /**
     * 照片
     */
    private String photograph;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

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
     * 获取教师标识
     *
     * @return teacher_name - 教师标识
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置教师标识
     *
     * @param teacherName 教师标识
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * 获取教师职位
     *
     * @return position - 教师职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置教师职位
     *
     * @param position 教师职位
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取教师简介
     *
     * @return introduction - 教师简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置教师简介
     *
     * @param introduction 教师简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 获取照片
     *
     * @return photograph - 照片
     */
    public String getPhotograph() {
        return photograph;
    }

    /**
     * 设置照片
     *
     * @param photograph 照片
     */
    public void setPhotograph(String photograph) {
        this.photograph = photograph;
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
}