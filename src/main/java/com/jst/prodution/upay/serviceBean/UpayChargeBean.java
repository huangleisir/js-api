package com.jst.prodution.upay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class UpayChargeBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	/**
	 * 支付流水号(支付核心生成)
	 */
	private String payNo;			//支付流水号
	/**
	 * 交易流水号(交易核心生成)
	 */
	private String busNo; 			//交易系统流水号
	/**
	 * 商户订单号(第三方商户生成)
	 */
	private String orderId; 		// 商户订单号
	/**
	 * 磐石应用ID
	 */
	private String jstAppId; 		// 应用id
	/**
	 * 磐石商户号
	 */
	private String jstMchId; 		// 商户id
	/**
	 * 支付状态
	 */
	private String payStatus;		//支付状态
	/**
	 * 支付渠道
	 */
	private String payChannelId;	// 支付渠道id
	/**
	 * 订单金额
	 */
	private int totalAmount; 		// 订单金额
	/**
	 * 货币代码
	 */
	private String currency; 		// 货币代码，人民币为 cny
	/**
	 * 订单名称
	 */
	private String subject; 		// 订单名称
	/**
	 * 订单创建时间
	 */
	private String createTime;		// 订单创建时间"20171002124556"
	/**
	 * 订单过期时间
	 */
	private String expireTime; 		// 订单过期时间"20171002124556"
	/**
	 * 支付凭证
	 */
	private Object credential; 		// 支付凭证
	/**
	 * 支付方式
	 */
	private String payType; 		// 支付模式
	
	/**
	 * 刷卡支付(微信)
	 */
	private String authCode;		//微信刷卡支付
	
	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
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

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
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

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
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

	public Object getCredential() {
		return credential;
	}

	public void setCredential(Object credential) {
		this.credential = credential;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	
}
