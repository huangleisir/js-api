package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联无跳转-消费查询bean
 * @author pengyuanjun
 *
 */
public class NoJumpConsumeQueryBean extends BaseBean {
	private static final long serialVersionUID = -7914924189448180763L;

	/**
	 * 原开通交易的订单号
	 */
	private String orderId;
	/**
	 * 订单交易时间(订单被消费时传入的时间)
	 */
	private String orderTradeTime;
	/**
	 * 消费状态 0:交易成功 1交易失败  2订单状态未明
	 */
	private int status;
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
	public String getOrderTradeTime() {
		return orderTradeTime;
	}
	public void setOrderTradeTime(String orderTradeTime) {
		this.orderTradeTime = orderTradeTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getTradeSerialNo() {
		return tradeSerialNo;
	}
	public void setTradeSerialNo(String tradeSerialNo) {
		this.tradeSerialNo = tradeSerialNo;
	}
}
