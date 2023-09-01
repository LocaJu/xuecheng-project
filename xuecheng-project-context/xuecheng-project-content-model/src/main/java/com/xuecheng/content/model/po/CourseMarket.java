package com.xuecheng.content.model.po;

import javax.persistence.*;

@Table(name = "course_market")
public class CourseMarket {
    /**
     * 主键，课程id
     */
    @Id
    private Long id;

    /**
     * 收费规则，对应数据字典
     */
    private String charge;

    /**
     * 现价
     */
    private Float price;

    /**
     * 原价
     */
    @Column(name = "original_price")
    private Float originalPrice;

    /**
     * 咨询qq
     */
    private String qq;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 电话
     */
    private String phone;

    /**
     * 有效期天数
     */
    @Column(name = "valid_days")
    private Integer validDays;

    /**
     * 获取主键，课程id
     *
     * @return id - 主键，课程id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键，课程id
     *
     * @param id 主键，课程id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取收费规则，对应数据字典
     *
     * @return charge - 收费规则，对应数据字典
     */
    public String getCharge() {
        return charge;
    }

    /**
     * 设置收费规则，对应数据字典
     *
     * @param charge 收费规则，对应数据字典
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
     * @return original_price - 原价
     */
    public Float getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置原价
     *
     * @param originalPrice 原价
     */
    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 获取咨询qq
     *
     * @return qq - 咨询qq
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置咨询qq
     *
     * @param qq 咨询qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取微信
     *
     * @return wechat - 微信
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信
     *
     * @param wechat 微信
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取有效期天数
     *
     * @return valid_days - 有效期天数
     */
    public Integer getValidDays() {
        return validDays;
    }

    /**
     * 设置有效期天数
     *
     * @param validDays 有效期天数
     */
    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }
}