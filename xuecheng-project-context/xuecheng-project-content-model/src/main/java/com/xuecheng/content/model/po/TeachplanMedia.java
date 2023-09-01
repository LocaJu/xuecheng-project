package com.xuecheng.content.model.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "teachplan_media")
public class TeachplanMedia {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 媒资信息标识
     */
    @Column(name = "media_id")
    private Long mediaId;

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

    /**
     * 课程发布标识
     */
    @Column(name = "course_pub_id")
    private Long coursePubId;

    /**
     * 媒资文件原始名称
     */
    @Column(name = "media_fileName")
    private String mediaFilename;

    @Column(name = "create_date")
    private Date createDate;

    /**
     * 创建人
     */
    @Column(name = "create_people")
    private String createPeople;

    /**
     * 修改人
     */
    @Column(name = "change_people")
    private String changePeople;

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
     * 获取媒资信息标识
     *
     * @return media_id - 媒资信息标识
     */
    public Long getMediaId() {
        return mediaId;
    }

    /**
     * 设置媒资信息标识
     *
     * @param mediaId 媒资信息标识
     */
    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
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
     * 获取媒资文件原始名称
     *
     * @return media_fileName - 媒资文件原始名称
     */
    public String getMediaFilename() {
        return mediaFilename;
    }

    /**
     * 设置媒资文件原始名称
     *
     * @param mediaFilename 媒资文件原始名称
     */
    public void setMediaFilename(String mediaFilename) {
        this.mediaFilename = mediaFilename;
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
     * 获取创建人
     *
     * @return create_people - 创建人
     */
    public String getCreatePeople() {
        return createPeople;
    }

    /**
     * 设置创建人
     *
     * @param createPeople 创建人
     */
    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople;
    }

    /**
     * 获取修改人
     *
     * @return change_people - 修改人
     */
    public String getChangePeople() {
        return changePeople;
    }

    /**
     * 设置修改人
     *
     * @param changePeople 修改人
     */
    public void setChangePeople(String changePeople) {
        this.changePeople = changePeople;
    }
}