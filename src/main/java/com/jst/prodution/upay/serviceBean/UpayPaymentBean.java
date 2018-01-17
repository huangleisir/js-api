package com.jst.prodution.upay.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class UpayPaymentBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	/**
	 * 支付流水号(支付中心生成)
	 */
	private String payNo;
	/**
	 * 交易流水号(交易核心生成)
	 */
	private String busNo;
	/**
	 * 商户订单号(第三方商户生成)
	 */
	private String orderId;
	/**
	 * 磐石APPID
	 */
	private String jstAppId;
	/**
	 * 磐石商户号
	 */
	private String jstMchId;
	/**
	 * 订单名称
	 */
	private String subject;
	/**
	 * 订单描述
	 */
	private String description;
	/**
	 * 第三方支付渠道流水号(微信、支付宝支付流水号)
	 */
	private String externTransactionId;
	/**
	 * 订单金额
	 */
	private int totalAmount;
	/**
	 * 订单状态
	 */
	private String status;
	/**
	 * 支付渠道
	 */
	private String payChannelId;
	/**
	 * 支付方式
	 */
	private String payType;
	/**
	 * 订单创建时间
	 */
	private Date createTime;
	/**
	 * 订单失效时间
	 */
	private Date expireTime;
	/**
	 * 订单最后更新时间
	 */
	private Date updateTime;
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
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
	public String getExternTransactionId() {
		return externTransactionId;
	}
	public void setExternTransactionId(String externTransactionId) {
		this.externTransactionId = externTransactionId;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
