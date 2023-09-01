package com.xuecheng.content.model.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "course_pub")
public class CoursePub {
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
     * 机构ID
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 公司名称
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
     * 标签
     */
    private String tags;

    /**
     * 创建人
     */
    private String username;

    /**
     * 大分类
     */
    private String mt;

    @Column(name = "mt_name")
    private String mtName;

    /**
     * 小分类
     */
    private String st;

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
     * 发布时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @Column(name = "change_date")
    private Date changeDate;

    /**
     * 是否最新课程
     */
    @Column(name = "is_latest")
    private Byte isLatest;

    /**
     * 是否发布(0发布 1取消发布)
     */
    @Column(name = "is_pub")
    private Byte isPub;

    /**
     * 状态（1正常  0删除）
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 收费规则，对应数据字典--203
     */
    private String charge;

    /**
     * 现价
     */
    private Float price;

    /**
     * 原价
     */
    @Column(name = "price_old")
    private Float priceOld;

    /**
     * 咨询QQ
     */
    private String qq;

    /**
     * 有效性，对应数据字典--204
     */
    private String valid;

    /**
     * 课程有效期-开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 课程有效期-结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 课程介绍
     */
    private String description;

    /**
     * 课程营销信息，json格式
     */
    private String market;

    /**
     * 所有课程计划，json格式
     */
    private String teachplan;

    /**
     * 教师信息
     */
    private String teachers;

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
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
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
     * 获取标签
     *
     * @return tags - 标签
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置标签
     *
     * @param tags 标签
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * 获取创建人
     *
     * @return username - 创建人
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置创建人
     *
     * @param username 创建人
     */
    public void setUsername(String username) {
        this.username = username;
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
     * @return mt_name
     */
    public String getMtName() {
        return mtName;
    }

    /**
     * @param mtName
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
     * @return st_name
     */
    public String getStName() {
        return stName;
    }

    /**
     * @param stName
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
     * 获取发布时间
     *
     * @return create_date - 发布时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置发布时间
     *
     * @param createDate 发布时间
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

    /**
     * 获取是否最新课程
     *
     * @return is_latest - 是否最新课程
     */
    public Byte getIsLatest() {
        return isLatest;
    }

    /**
     * 设置是否最新课程
     *
     * @param isLatest 是否最新课程
     */
    public void setIsLatest(Byte isLatest) {
        this.isLatest = isLatest;
    }

    /**
     * 获取是否发布(0发布 1取消发布)
     *
     * @return is_pub - 是否发布(0发布 1取消发布)
     */
    public Byte getIsPub() {
        return isPub;
    }

    /**
     * 设置是否发布(0发布 1取消发布)
     *
     * @param isPub 是否发布(0发布 1取消发布)
     */
    public void setIsPub(Byte isPub) {
        this.isPub = isPub;
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
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取收费规则，对应数据字典--203
     *
     * @return charge - 收费规则，对应数据字典--203
     */
    public String getCharge() {
        return charge;
    }

    /**
     * 设置收费规则，对应数据字典--203
     *
     * @param charge 收费规则，对应数据字典--203
     */
    public void setCharge(String charge) {
        this.charge = charge;
    }

    /**
     * 获取现价
     *
     * @return price - 现价
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置现价
     *
     * @param price 现价
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取原价
     *
     * @return price_old - 原价
     */
    public Float getPriceOld() {
        return priceOld;
    }

    /**
     * 设置原价
     *
     * @param priceOld 原价
     */
    public void setPriceOld(Float priceOld) {
        this.priceOld = priceOld;
    }

    /**
     * 获取咨询QQ
     *
     * @return qq - 咨询QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置咨询QQ
     *
     * @param qq 咨询QQ
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取有效性，对应数据字典--204
     *
     * @return valid - 有效性，对应数据字典--204
     */
    public String getValid() {
        return valid;
    }

    /**
     * 设置有效性，对应数据字典--204
     *
     * @param valid 有效性，对应数据字典--204
     */
    public void setValid(String valid) {
        this.valid = valid;
    }

    /**
     * 获取课程有效期-开始时间
     *
     * @return start_time - 课程有效期-开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置课程有效期-开始时间
     *
     * @param startTime 课程有效期-开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取课程有效期-结束时间
     *
     * @return end_time - 课程有效期-结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置课程有效期-结束时间
     *
     * @param endTime 课程有效期-结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    /**
     * 获取课程营销信息，json格式
     *
     * @return market - 课程营销信息，json格式
     */
    public String getMarket() {
        return market;
    }

    /**
     * 设置课程营销信息，json格式
     *
     * @param market 课程营销信息，json格式
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * 获取所有课程计划，json格式
     *
     * @return teachplan - 所有课程计划，json格式
     */
    public String getTeachplan() {
        return teachplan;
    }

    /**
     * 设置所有课程计划，json格式
     *
     * @param teachplan 所有课程计划，json格式
     */
    public void setTeachplan(String teachplan) {
        this.teachplan = teachplan;
    }

    /**
     * 获取教师信息
     *
     * @return teachers - 教师信息
     */
    public String getTeachers() {
        return teachers;
    }

    /**
     * 设置教师信息
     *
     * @param teachers 教师信息
     */
    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }
}