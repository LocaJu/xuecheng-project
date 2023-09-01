package com.xuecheng.content.model.po;

import javax.persistence.*;

@Table(name = "course_pub_msg")
public class CoursePubMsg {
    /**
     * 课程发布id
     */
    @Id
    @Column(name = "pub_id")
    private Long pubId;

    /**
     * 课程发布名称
     */
    @Column(name = "pub_name")
    private String pubName;

    /**
     * 课程发布消息状态(0:未发送，1:已发送)
     */
    @Column(name = "pub_status")
    private Byte pubStatus;

    /**
     * 课程基本信息id
     */
    @Column(name = "course_id")
    private Long courseId;

    /**
     * 教学机构id
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 获取课程发布id
     *
     * @return pub_id - 课程发布id
     */
    public Long getPubId() {
        return pubId;
    }

    /**
     * 设置课程发布id
     *
     * @param pubId 课程发布id
     */
    public void setPubId(Long pubId) {
        this.pubId = pubId;
    }

    /**
     * 获取课程发布名称
     *
     * @return pub_name - 课程发布名称
     */
    public String getPubName() {
        return pubName;
    }

    /**
     * 设置课程发布名称
     *
     * @param pubName 课程发布名称
     */
    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    /**
     * 获取课程发布消息状态(0:未发送，1:已发送)
     *
     * @return pub_status - 课程发布消息状态(0:未发送，1:已发送)
     */
    public Byte getPubStatus() {
        return pubStatus;
    }

    /**
     * 设置课程发布消息状态(0:未发送，1:已发送)
     *
     * @param pubStatus 课程发布消息状态(0:未发送，1:已发送)
     */
    public void setPubStatus(Byte pubStatus) {
        this.pubStatus = pubStatus;
    }

    /**
     * 获取课程基本信息id
     *
     * @return course_id - 课程基本信息id
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * 设置课程基本信息id
     *
     * @param courseId 课程基本信息id
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * 获取教学机构id
     *
     * @return company_id - 教学机构id
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 设置教学机构id
     *
     * @param companyId 教学机构id
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}