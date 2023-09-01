package com.xuecheng.content.model.po;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

@Table(name = "course_base")
public class CourseBase {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 机构ID
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 机构名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 适用人群
     */
    private String users;

    /**
     * 课程标签
     */
    private String tags;

    /**
     * 大分类
     */
    private String mt;

    /**
     * 课程大类名称
     */
    @Column(name = "mt_name")
    private String mtName;

    /**
     * 小分类
     */
    private String st;

    /**
     * 课程小类名称
     */
    @Column(name = "st_name")
    private String stName;

    /**
     * 课程等级
     */
    private String grade;

    /**
     * 教育模式(common普通，record 录播，live直播等）
     */
    private String teachmode;

    /**
     * 课程图片
     */
    private String pic;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    @Column(name = "change_date")
    private Date changeDate;

    /**
     * 创建人
     */
    @Column(name = "create_people")
    private String createPeople;

    /**
     * 更新人
     */
    @Column(name = "change_people")
    private String changePeople;

    /**
     * 审核状态
     */
    @Column(name = "audit_status")
    private String auditStatus;

    /**
     * 审核意见
     */
    @Column(name = "audit_mind")
    private String auditMind;

    /**
     * 审核次数
     */
    @Column(name = "audit_nums")
    private Integer auditNums;

    /**
     * 审核时间
     */
    @Column(name = "audit_date")
    private Date auditDate;

    /**
     * 审核人
     */
    @Column(name = "audit_people")
    private String auditPeople;

    /**
     * 1为未发布，0为删除 2已发布
     */
    private Integer status;

    /**
     * 课程发布标识
     */
    @Column(name = "course_pub_id")
    private Long coursePubId;

    /**
     * 课程发布时间
     */
    @Column(name = "course_pub_date")
    private Date coursePubDate;

    /**
     * 课程介绍
     */
    private String description;

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
     * 获取机构ID
     *
     * @return company_id - 机构ID
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 设置机构ID
     *
     * @param companyId 机构ID
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取机构名称
     *
     * @return company_name - 机构名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置机构名称
     *
     * @param companyName 机构名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取课程名称
     *
     * @return name - 课程名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置课程名称
     *
     * @param name 课程名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取适用人群
     *
     * @return users - 适用人群
     */
    public String getUsers() {
        return users;
    }

    /**
     * 设置适用人群
     *
     * @param users 适用人群
     */
    public void setUsers(String users) {
        this.users = users;
    }

    /**
     * 获取课程标签
     *
     * @return tags - 课程标签
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置课程标签
     *
     * @param tags 课程标签
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * 获取大分类
     *
     * @return mt - 大分类
     */
    public String getMt() {
        return mt;
    }

    /**
     * 设置大分类
     *
     * @param mt 大分类
     */
    public void setMt(String mt) {
        this.mt = mt;
    }

    /**
     * 获取课程大类名称
     *
     * @return mt_name - 课程大类名称
     */
    public String getMtName() {
        return mtName;
    }

    /**
     * 设置课程大类名称
     *
     * @param mtName 课程大类名称
     */
    public void setMtName(String mtName) {
        this.mtName = mtName;
    }

    /**
     * 获取小分类
     *
     * @return st - 小分类
     */
    public String getSt() {
        return st;
    }

    /**
     * 设置小分类
     *
     * @param st 小分类
     */
    public void setSt(String st) {
        this.st = st;
    }

    /**
     * 获取课程小类名称
     *
     * @return st_name - 课程小类名称
     */
    public String getStName() {
        return stName;
    }

    /**
     * 设置课程小类名称
     *
     * @param stName 课程小类名称
     */
    public void setStName(String stName) {
        this.stName = stName;
    }

    /**
     * 获取课程等级
     *
     * @return grade - 课程等级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置课程等级
     *
     * @param grade 课程等级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取教育模式(common普通，record 录播，live直播等）
     *
     * @return teachmode - 教育模式(common普通，record 录播，live直播等）
     */
    public String getTeachmode() {
        return teachmode;
    }

    /**
     * 设置教育模式(common普通，record 录播，live直播等）
     *
     * @param teachmode 教育模式(common普通，record 录播，live直播等）
     */
    public void setTeachmode(String teachmode) {
        this.teachmode = teachmode;
    }

    /**
     * 获取课程图片
     *
     * @return pic - 课程图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置课程图片
     *
     * @param pic 课程图片
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(LocalDateTime createDate) {
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
     * 获取更新人
     *
     * @return change_people - 更新人
     */
    public String getChangePeople() {
        return changePeople;
    }

    /**
     * 设置更新人
     *
     * @param changePeople 更新人
     */
    public void setChangePeople(String changePeople) {
        this.changePeople = changePeople;
    }

    /**
     * 获取审核状态
     *
     * @return audit_status - 审核状态
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置审核状态
     *
     * @param auditStatus 审核状态
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取审核意见
     *
     * @return audit_mind - 审核意见
     */
    public String getAuditMind() {
        return auditMind;
    }

    /**
     * 设置审核意见
     *
     * @param auditMind 审核意见
     */
    public void setAuditMind(String auditMind) {
        this.auditMind = auditMind;
    }

    /**
     * 获取审核次数
     *
     * @return audit_nums - 审核次数
     */
    public Integer getAuditNums() {
        return auditNums;
    }

    /**
     * 设置审核次数
     *
     * @param auditNums 审核次数
     */
    public void setAuditNums(Integer auditNums) {
        this.auditNums = auditNums;
    }

    /**
     * 获取审核时间
     *
     * @return audit_date - 审核时间
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * 设置审核时间
     *
     * @param auditDate 审核时间
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    /**
     * 获取审核人
     *
     * @return audit_people - 审核人
     */
    public String getAuditPeople() {
        return auditPeople;
    }

    /**
     * 设置审核人
     *
     * @param auditPeople 审核人
     */
    public void setAuditPeople(String auditPeople) {
        this.auditPeople = auditPeople;
    }

    /**
     * 获取1为未发布，0为删除 2已发布
     *
     * @return status - 1为未发布，0为删除 2已发布
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1为未发布，0为删除 2已发布
     *
     * @param status 1为未发布，0为删除 2已发布
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取课程发布时间
     *
     * @return course_pub_date - 课程发布时间
     */
    public Date getCoursePubDate() {
        return coursePubDate;
    }

    /**
     * 设置课程发布时间
     *
     * @param coursePubDate 课程发布时间
     */
    public void setCoursePubDate(Date coursePubDate) {
        this.coursePubDate = coursePubDate;
    }

    /**
     * 获取课程介绍
     *
     * @return description - 课程介绍
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置课程介绍
     *
     * @param description 课程介绍
     */
    public void setDescription(String description) {
        this.description = description;
    }
}