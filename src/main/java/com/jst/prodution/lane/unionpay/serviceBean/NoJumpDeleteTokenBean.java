package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联无跳转解除标记bean
 * @author pengyuanjun
 *
 */
public class NoJumpDeleteTokenBean extends BaseBean {
	private static final long serialVersionUID = -1530679518590627348L;
	
	/**
	 * 原开通交易的订单号
	 */
	private String orderId;
	/**
	 * 订单发送时间，格式为YYYYMMDDhhmmss，必须取当前时间，否则会报无效
	 */
	private String tradeTime;
	/**
	 * token
	 */
	private String token;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
}
