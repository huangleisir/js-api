package com.jst.prodution.jsyun.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class ParkOrderBean extends BaseBean{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 记录编号
     */
    private String id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 
     */
    private String userId;

    /**
     * 车牌号
     */
    private String carNo;

    /**
     * 停车场编号
     */
    private String parkCode;

    /**
     * 停车场名称
     */
    private String parkName;

    /**
     * 入场时间(yyyy-MM-dd HH:mm:ss)
     */
    private Date intTime;

    /**
     * 离场时间(yyyy-MM-dd HH:mm:ss)
     */
    private Date outTime;

    /**
     * 应缴金额(单位分)
     */
    private Long payFee;

    /**
     * 
     */
    private String intType;

    /**
     * 
     */
    private Long needPay;

    /**
     * 
     */
    private Date outvalidtime;

    /**
     * 01-已下单；02-已取消；03-停车中；04-离场待支付；05-已完成
     */
    private String tradeStatus;

    /**
     * 创建时间
     */
    private Date createDatetime;

    /**
     * 记录编号
     * @return id 记录编号
     */
    public String getId() {
        return id;
    }

    /**
     * 记录编号
     * @param id 记录编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 订单编号
     * @return order_no 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 订单编号
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 
     * @return user_id 
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 车牌号
     * @return car_no 车牌号
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * 车牌号
     * @param carNo 车牌号
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * 停车场编号
     * @return park_code 停车场编号
     */
    public String getParkCode() {
        return parkCode;
    }

    /**
     * 停车场编号
     * @param parkCode 停车场编号
     */
    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    /**
     * 停车场名称
     * @return park_name 停车场名称
     */
    public String getParkName() {
        return parkName;
    }

    /**
     * 停车场名称
     * @param parkName 停车场名称
     */
    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    /**
     * 入场时间(yyyy-MM-dd HH:mm:ss)
     * @return int_time 入场时间(yyyy-MM-dd HH:mm:ss)
     */
    public Date getIntTime() {
        return intTime;
    }

    /**
     * 入场时间(yyyy-MM-dd HH:mm:ss)
     * @param intTime 入场时间(yyyy-MM-dd HH:mm:ss)
     */
    public void setIntTime(Date intTime) {
        this.intTime = intTime;
    }

    /**
     * 离场时间(yyyy-MM-dd HH:mm:ss)
     * @return out_time 离场时间(yyyy-MM-dd HH:mm:ss)
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * 离场时间(yyyy-MM-dd HH:mm:ss)
     * @param outTime 离场时间(yyyy-MM-dd HH:mm:ss)
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * 应缴金额(单位分)
     * @return pay_fee 应缴金额(单位分)
     */
    public Long getPayFee() {
        return payFee;
    }

    /**
     * 应缴金额(单位分)
     * @param payFee 应缴金额(单位分)
     */
    public void setPayFee(Long payFee) {
        this.payFee = payFee;
    }

    /**
     * 
     * @return int_type 
     */
    public String getIntType() {
        return intType;
    }

    /**
     * 
     * @param intType 
     */
    public void setIntType(String intType) {
        this.intType = intType;
    }

    /**
     * 
     * @return need_pay 
     */
    public Long getNeedPay() {
        return needPay;
    }

    /**
     * 
     * @param needPay 
     */
    public void setNeedPay(Long needPay) {
        this.needPay = needPay;
    }

    /**
     * 
     * @return outvalidtime 
     */
    public Date getOutvalidtime() {
        return outvalidtime;
    }

    /**
     * 
     * @param outvalidtime 
     */
    public void setOutvalidtime(Date outvalidtime) {
        this.outvalidtime = outvalidtime;
    }

    /**
     * 01-已下单；02-已取消；03-停车中；04-离场待支付；05-已完成
     * @return trade_status 01-已下单；02-已取消；03-停车中；04-离场待支付；05-已完成
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * 01-已下单；02-已取消；03-停车中；04-离场待支付；05-已完成
     * @param tradeStatus 01-已下单；02-已取消；03-停车中；04-离场待支付；05-已完成
     */
    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
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