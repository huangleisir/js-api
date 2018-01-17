package com.jst.prodution.upay.model;

/**
 *@description: 退款情况返回信息model
 *@author  widon
 *@date: 2017年4月10日 下午2:45:26
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class UpayResponseRefundModel implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String jstAppId;				//应用id
	private String jstMchId;				//商户id
	private String jstNonceStr;				//随机字符串
	private String jstSign;					//签名
	
	
	private String refundId;				//订单号前缀+商户原始退款单号
	private String orderId;					//订单号前缀+商户原始订单号
	private String busRefundNo;				//交易系统退款流水号
	private String busNo;					//交易系统支付流水号
	private int totalAmount;				//订单总金额
	private int refundAmount;				//退款金额
	private int status;						//退款状态
	private String payChannelId;			//支付渠道
	private String payType;					//支付方式
	private String description;				//退款描述
	private String createTime;				//创建时间
	private String successTime;				//成功时间
	private String refundNotifyUrl;			//退款成功通知
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
	public String getRefundId() {
		return refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBusRefundNo() {
		return busRefundNo;
	}
	public void setBusRefundNo(String busRefundNo) {
		this.busRefundNo = busRefundNo;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(int refundAmount) {
		this.refundAmount = refundAmount;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPayChannelId() {
		return payChannelId;
	}
	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
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
	public String getSuccessTime() {
		return successTime;
	}
	public void setSuccessTime(String successTime) {
		this.successTime = successTime;
	}
	public String getRefundNotifyUrl() {
		return refundNotifyUrl;
	}
	public void setRefundNotifyUrl(String refundNotifyUrl) {
		this.refundNotifyUrl = refundNotifyUrl;
	}
	
	
}
