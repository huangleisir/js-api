package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联无跳转开通查询bean
 * @author pengyuanjun
 *
 */
public class NoJumpOpenQueryBean extends BaseBean {

	private static final long serialVersionUID = -1500319573213536682L;
	/**
	 * 原开通交易的订单号
	 */
	private String orderId;
	/**
	 * 订单发送时间，格式为YYYYMMDDhhmmss，必须取当前时间，否则会报无效
	 */
	private String orderSendTime;
	/**
	 * 开通状态(0：未开通业务 1：已开通银联全渠道支付 2：已开通小额临时支付 3：评级开通)
	 */
	private String activateStatus;
	/**
	 * token
	 */
	private String token;
	/**
	 * token开始时间
	 */
	private String tokenBegin;
	/**
	 * token结束时间
	 */
	private String tokenEnd;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderSendTime() {
		return orderSendTime;
	}
	public void setOrderSendTime(String orderSendTime) {
		this.orderSendTime = orderSendTime;
	}
	public String getActivateStatus() {
		return activateStatus;
	}
	public void setActivateStatus(String activateStatus) {
		this.activateStatus = activateStatus;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTokenBegin() {
		return tokenBegin;
	}
	public void setTokenBegin(String tokenBegin) {
		this.tokenBegin = tokenBegin;
	}
	public String getTokenEnd() {
		return tokenEnd;
	}
	public void setTokenEnd(String tokenEnd) {
		this.tokenEnd = tokenEnd;
	}

	
}
