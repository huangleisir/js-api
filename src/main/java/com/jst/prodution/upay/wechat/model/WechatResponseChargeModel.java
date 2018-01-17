package com.jst.prodution.upay.wechat.model;

import java.util.List;

public class WechatResponseChargeModel implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String jstAppId;				//应用id
	private String jstMchId;				//商户id
	private String jstNonceStr;				//随机字符串
	private String jstSign;					//签名
	
	private String busNo;					//支付平台交易流水号（调用交易系统获取）
	private int payStatus;					//支付状态
	private String payChannelId;			//支付渠道
	private String orderId;					//商户订单号
//	private String clientIp;				//发起支付请求客户端IPd地址
	private int totalAmount;				//订单总金额
	private int refundAmount;				//已退款金额
	private int settleAmount;				//清算金额
	private String currency;				//货币代码
	private String subject;					//订单标题
	private String description;				//订单描述
	private String createTime;				//订单生成时间
	private String expireTime;				//订单失效时间
	private String settleTime;				//清算时间
	private Object credential;				//支付凭证
	private String notifyUrl;				//后台通知地址
	private String pageUrl;					//页面跳转地址
	private String payType;					//支付方式（APP，NATIVE,JSAPI）
	private String sceneCode;				//支付场景码
	private String userMobile;
//	private String openId;					//openId
	private String userId;				//第三方userId
	
	private String extra;					//用户扩展信息
	private List refunds;					//退款记录 
	
	private String orderType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJstAppId() {
		return jstAppId;
	}
	public void setJstAppId(String jstAppId) {
		this.jstAppId = jstAppId;
	}
	public String getJstMchId() {
		return jstMchId;
	}
	public void setJstMchId(String jstMchId) {
		this.jstMchId = jstMchId;
	}
	public String getJstNonceStr() {
		return jstNonceStr;
	}
	public void setJstNonceStr(String jstNonceStr) {
		this.jstNonceStr = jstNonceStr;
	}
	public String getJstSign() {
		return jstSign;
	}
	public void setJstSign(String jstSign) {
		this.jstSign = jstSign;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public int getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayChannelId() {
		return payChannelId;
	}
	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
//	public String getClientIp() {
//		return clientIp;
//	}
//	public void setClientIp(String clientIp) {
//		this.clientIp = clientIp;
//	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getSettleAmount() {
		return settleAmount;
	}
	public void setSettleAmount(int settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getSettleTime() {
		return settleTime;
	}
	public void setSettleTime(String settleTime) {
		this.settleTime = settleTime;
	}
//	public String getExternTransactionId() {
//		return externTransactionId;
//	}
//	public void setExternTransactionId(String externTransactionId) {
//		this.externTransactionId = externTransactionId;
//	}
	public int getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(int refundAmount) {
		this.refundAmount = refundAmount;
	}
	public Object getCredential() {
		return credential;
	}
	public void setCredential(Object credential) {
		this.credential = credential;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getPageUrl() {
		return pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getSceneCode() {
		return sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
//	public String getOpenId() {
//		return openId;
//	}
//	public void setOpenId(String openId) {
//		this.openId = openId;
//	}
	
	public String getExtra() {
		return extra;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public List getRefunds() {
		return refunds;
	}
	public void setRefunds(List refunds) {
		this.refunds = refunds;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}	
	
	
	
}
