package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联无跳转-退货bean
 * @author pengyuanjun
 */
public class NoJumpRefundBean extends BaseBean {
	private static final long serialVersionUID = -6495453959458415472L;
	/**
	 * 订单号
	 */
	private String orderId;
	/**
	 * 必须使用当前北京时间（年年年年月月日日时时分分秒秒）24小时制。 样例：20151123152540，北京时间 商户发送交易时间
	 */
	private String tradeTime;
	/**
	 * 原订单交易流水号
	 */
	private String tradeSerialNo;
	/**
	 * 订单金额(单位分)
	 */
	private int money;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
