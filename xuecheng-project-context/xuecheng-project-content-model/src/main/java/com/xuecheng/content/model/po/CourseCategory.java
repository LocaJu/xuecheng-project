package com.xuecheng.content.model.po;

import javax.persistence.*;

@Table(name = "course_category")
public class CourseCategory {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类标签默认和名称一样
     */
    private String label;

    /**
     * 父结点id（第一级的父节点是0，自关联字段id）
     */
    private String parentid;

    /**
     * 是否显示
     */
    @Column(name = "is_show")
    private Byte isShow;

    /**
     * 排序字段
     */
    private Integer orderby;

    /**
     * 是否叶子
     */
    @Column(name = "is_leaf")
    private Byte isLeaf;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分类标签默认和名称一样
     *
     * @return label - 分类标签默认和名称一样
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置分类标签默认和名称一样
     *
     * @param label 分类标签默认和名称一样
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取父结点id（第一级的父节点是0，自关联字段id）
     *
     * @return parentid - 父结点id（第一级的父节点是0，自关联字段id）
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * 设置父结点id（第一级的父节点是0，自关联字段id）
     *
     * @param parentid 父结点id（第一级的父节点是0，自关联字段id）
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取是否显示
     *
     * @return is_show - 是否显示
     */
    public Byte getIsShow() {
        return isShow;
    }

    /**
     * 设置是否显示
     *
     * @param isShow 是否显示
     */
    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
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
     * 获取是否叶子
     *
     * @return is_leaf - 是否叶子
     */
    public Byte getIsLeaf() {
        return isLeaf;
    }

    /**
     * 设置是否叶子
     *
     * @param isLeaf 是否叶子
     */
    public void setIsLeaf(Byte isLeaf) {
        this.isLeaf = isLeaf;
    }
}