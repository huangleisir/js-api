package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreRefundOrderBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String busNo; //原支付订单号                                             orderId 可输（二选一）
	private String orderId; //商户原支付订单号                                                       可 输
	private Date applyTime;//退款申请时间					     必输
	private String refundType; //退款类型1，退款至余额2，原路退款        必输
	private String merchantExtenalNo;//外部订单号                                   sourceFrom为商户后台时 必输
    private String merchantId ;//申请退款商户Id               可输
    private String merchantMemberId;//申请退款商户会员标识     	      可输
	private String sourceFrom;//退款发起源 0：B门户，1：商户后台(app），2：OMS  必输          
	
	private String orderName;//订单名称                                                                 可输
	private String orderDes;//订单描述						      可输
	private String remark; //备注							      可输
    private String merchantName; //商户名称     				      可输

    private Long refundAmount;//退款金额
	private Long tranAmount;//交易金额
    private String payChannelId; //支付渠道号 WeChat:微信，Alipay：支付宝，JYF：捷易付
    private String payType; //微信支付模式：APP、JSAPI、NATIVE 支付宝支付模式：APP、WAP、NATIVE 捷易付支付模式：H5
    
    
	
   //输出
    private String refundBusNo;//退款流水号 
    private String refundChannelId; //退款渠道编码 WeChat:微信，Alipay：支付宝，JST：捷顺通卡，KQ：快钱（银行卡） BAL：余额
	private String state; //退款状态(00：退款成功，01退款中，02退款失败)
	private Date refundTime; //退款时间

	private String refundErrorMsg; //退款失败错误信息

	public String getPayChannelId() {
		return payChannelId;
	}
	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
	public String getRefundChannelId() {
		return refundChannelId;
	}
	public void setRefundChannelId(String refundChannelId) {
		this.refundChannelId = refundChannelId;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getRefundType() {
		return refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	public String getMerchantExtenalNo() {
		return merchantExtenalNo;
	}
	public void setMerchantExtenalNo(String merchantExtenalNo) {
		this.merchantExtenalNo = merchantExtenalNo;
	}
	public Long getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public Long getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderDes() {
		return orderDes;
	}
	public void setOrderDes(String orderDes) {
		this.orderDes = orderDes;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantMemberId() {
		return merchantMemberId;
	}
	public void setMerchantMemberId(String merchantMemberId) {
		this.merchantMemberId = merchantMemberId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getRefundBusNo() {
		return refundBusNo;
	}
	public void setRefundBusNo(String refundBusNo) {
		this.refundBusNo = refundBusNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRefundErrorMsg() {
		return refundErrorMsg;
	}
	public void setRefundErrorMsg(String refundErrorMsg) {
		this.refundErrorMsg = refundErrorMsg;
	}
	public Date getRefundTime() {
		return refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	
}
