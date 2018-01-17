package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联无跳转-消费bean
 * @author pengyuanjun
 *
 */
public class NoJumpConsumeBean extends BaseBean {
	private static final long serialVersionUID = -7914924189448180763L;

	/**
	 * 商户订单号
	 */
	private String orderId;
	/**
	 * 交易时间，格式为YYYYMMDDhhmmss，必须取当前时间，否则会报无效
	 */
	private String tradeTime;
	/**
	 * token
	 */
	private String token;
	/**
	 * 交易金额 (单位分，不要带小数点)
	 */
	private int money;
	/**
	 * 消费流水号
	 */
	private String tradeSerialNo;

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

	public String getTradeSerialNo() {
		return tradeSerialNo;
	}

	public void setTradeSerialNo(String tradeSerialNo) {
		this.tradeSerialNo = tradeSerialNo;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
