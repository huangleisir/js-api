package com.jst.prodution.jsyun.serviceBean;

import java.util.Date;

public class PayOrderFlowRecordBean {
    /**
     * 编号
     */
    private String id;

    /**
     * 停车的订单号
     */
    private String orderNo;

    /**
     * 支付金额（单位分）
     */
    private Long amt;

    /**
     * 支付流水号
     */
    private String paySerialNumber;

    /**
     * 支付状态
     */
    private String payStatus;

    /**
     * 流水类型
     */
    private String transType;

    /**
     * 费用开始时间
     */
    private Date startTime;

    /**
     * 费用结束时间
     */
    private Date endTime;

    /**
     * 单笔支付停车时长
     */
    private String timefordtl;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 创建时间
     */
    private Date createDatetime;

    /**
     * 编号
     * @return id 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 编号
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 停车的订单号
     * @return order_no 停车的订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 停车的订单号
     * @param orderNo 停车的订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 支付金额（单位分）
     * @return amt 支付金额（单位分）
     */
    public Long getAmt() {
        return amt;
    }

    /**
     * 支付金额（单位分）
     * @param amt 支付金额（单位分）
     */
    public void setAmt(Long amt) {
        this.amt = amt;
    }

    /**
     * 支付流水号
     * @return pay_serial_number 支付流水号
     */
    public String getPaySerialNumber() {
        return paySerialNumber;
    }

    /**
     * 支付流水号
     * @param paySerialNumber 支付流水号
     */
    public void setPaySerialNumber(String paySerialNumber) {
        this.paySerialNumber = paySerialNumber;
    }

    /**
     * 支付状态
     * @return pay_status 支付状态
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * 支付状态
     * @param payStatus 支付状态
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 流水类型
     * @return trans_type 流水类型
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 流水类型
     * @param transType 流水类型
     */
    public void setTransType(String transType) {
        this.transType = transType;
    }

    /**
     * 费用开始时间
     * @return start_time 费用开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 费用开始时间
     * @param startTime 费用开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 费用结束时间
     * @return end_time 费用结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 费用结束时间
     * @param endTime 费用结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 单笔支付停车时长
     * @return timefordtl 单笔支付停车时长
     */
    public String getTimefordtl() {
        return timefordtl;
    }

    /**
     * 单笔支付停车时长
     * @param timefordtl 单笔支付停车时长
     */
    public void setTimefordtl(String timefordtl) {
        this.timefordtl = timefordtl;
    }

    /**
     * 支付时间
     * @return pay_time 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 支付时间
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 创建时间
     * @return create_datetime 创建时间
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * 创建时间
     * @param createDatetime 创建时间
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}