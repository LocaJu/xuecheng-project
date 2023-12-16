package com.xuecheng.content.model.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mq_message_history")
public class MqMessageHistory {
    /**
     * 消息id
     */
    @Id
    private String id;

    /**
     * 消息类型代码
     */
    @Column(name = "message_type")
    private String messageType;

    /**
     * 关联业务信息
     */
    @Column(name = "business_key1")
    private String businessKey1;

    /**
     * 关联业务信息
     */
    @Column(name = "business_key2")
    private String businessKey2;

    /**
     * 关联业务信息
     */
    @Column(name = "business_key3")
    private String businessKey3;

    /**
     * 消息队列主机
     */
    @Column(name = "mq_host")
    private String mqHost;

    /**
     * 消息队列端口
     */
    @Column(name = "mq_port")
    private Integer mqPort;

    /**
     * 消息队列虚拟主机
     */
    @Column(name = "mq_virtualhost")
    private String mqVirtualhost;

    /**
     * 队列名称
     */
    @Column(name = "mq_queue")
    private String mqQueue;

    /**
     * 通知次数
     */
    @Column(name = "inform_num")
    private Integer informNum;

    /**
     * 处理状态，0:初始，1:成功，2:失败
     */
    private Integer state;

    /**
     * 回复失败时间
     */
    @Column(name = "returnfailure_date")
    private Date returnfailureDate;

    /**
     * 回复成功时间
     */
    @Column(name = "returnsuccess_date")
    private Date returnsuccessDate;

    /**
     * 回复失败内容
     */
    @Column(name = "returnfailure_msg")
    private String returnfailureMsg;

    /**
     * 最近通知时间
     */
    @Column(name = "inform_date")
    private Date informDate;

    /**
     * 获取消息id
     *
     * @return id - 消息id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置消息id
     *
     * @param id 消息id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取消息类型代码
     *
     * @return message_type - 消息类型代码
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * 设置消息类型代码
     *
     * @param messageType 消息类型代码
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取关联业务信息
     *
     * @return business_key1 - 关联业务信息
     */
    public String getBusinessKey1() {
        return businessKey1;
    }

    /**
     * 设置关联业务信息
     *
     * @param businessKey1 关联业务信息
     */
    public void setBusinessKey1(String businessKey1) {
        this.businessKey1 = businessKey1;
    }

    /**
     * 获取关联业务信息
     *
     * @return business_key2 - 关联业务信息
     */
    public String getBusinessKey2() {
        return businessKey2;
    }

    /**
     * 设置关联业务信息
     *
     * @param businessKey2 关联业务信息
     */
    public void setBusinessKey2(String businessKey2) {
        this.businessKey2 = businessKey2;
    }

    /**
     * 获取关联业务信息
     *
     * @return business_key3 - 关联业务信息
     */
    public String getBusinessKey3() {
        return businessKey3;
    }

    /**
     * 设置关联业务信息
     *
     * @param businessKey3 关联业务信息
     */
    public void setBusinessKey3(String businessKey3) {
        this.businessKey3 = businessKey3;
    }

    /**
     * 获取消息队列主机
     *
     * @return mq_host - 消息队列主机
     */
    public String getMqHost() {
        return mqHost;
    }

    /**
     * 设置消息队列主机
     *
     * @param mqHost 消息队列主机
     */
    public void setMqHost(String mqHost) {
        this.mqHost = mqHost;
    }

    /**
     * 获取消息队列端口
     *
     * @return mq_port - 消息队列端口
     */
    public Integer getMqPort() {
        return mqPort;
    }

    /**
     * 设置消息队列端口
     *
     * @param mqPort 消息队列端口
     */
    public void setMqPort(Integer mqPort) {
        this.mqPort = mqPort;
    }

    /**
     * 获取消息队列虚拟主机
     *
     * @return mq_virtualhost - 消息队列虚拟主机
     */
    public String getMqVirtualhost() {
        return mqVirtualhost;
    }

    /**
     * 设置消息队列虚拟主机
     *
     * @param mqVirtualhost 消息队列虚拟主机
     */
    public void setMqVirtualhost(String mqVirtualhost) {
        this.mqVirtualhost = mqVirtualhost;
    }

    /**
     * 获取队列名称
     *
     * @return mq_queue - 队列名称
     */
    public String getMqQueue() {
        return mqQueue;
    }

    /**
     * 设置队列名称
     *
     * @param mqQueue 队列名称
     */
    public void setMqQueue(String mqQueue) {
        this.mqQueue = mqQueue;
    }

    /**
     * 获取通知次数
     *
     * @return inform_num - 通知次数
     */
    public Integer getInformNum() {
        return informNum;
    }

    /**
     * 设置通知次数
     *
     * @param informNum 通知次数
     */
    public void setInformNum(Integer informNum) {
        this.informNum = informNum;
    }

    /**
     * 获取处理状态，0:初始，1:成功，2:失败
     *
     * @return state - 处理状态，0:初始，1:成功，2:失败
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置处理状态，0:初始，1:成功，2:失败
     *
     * @param state 处理状态，0:初始，1:成功，2:失败
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取回复失败时间
     *
     * @return returnfailure_date - 回复失败时间
     */
    public Date getReturnfailureDate() {
        return returnfailureDate;
    }

    /**
     * 设置回复失败时间
     *
     * @param returnfailureDate 回复失败时间
     */
    public void setReturnfailureDate(Date returnfailureDate) {
        this.returnfailureDate = returnfailureDate;
    }

    /**
     * 获取回复成功时间
     *
     * @return returnsuccess_date - 回复成功时间
     */
    public Date getReturnsuccessDate() {
        return returnsuccessDate;
    }

    /**
     * 设置回复成功时间
     *
     * @param returnsuccessDate 回复成功时间
     */
    public void setReturnsuccessDate(Date returnsuccessDate) {
        this.returnsuccessDate = returnsuccessDate;
    }

    /**
     * 获取回复失败内容
     *
     * @return returnfailure_msg - 回复失败内容
     */
    public String getReturnfailureMsg() {
        return returnfailureMsg;
    }

    /**
     * 设置回复失败内容
     *
     * @param returnfailureMsg 回复失败内容
     */
    public void setReturnfailureMsg(String returnfailureMsg) {
        this.returnfailureMsg = returnfailureMsg;
    }

    /**
     * 获取最近通知时间
     *
     * @return inform_date - 最近通知时间
     */
    public Date getInformDate() {
        return informDate;
    }

    /**
     * 设置最近通知时间
     *
     * @param informDate 最近通知时间
     */
    public void setInformDate(Date informDate) {
        this.informDate = informDate;
    }
}