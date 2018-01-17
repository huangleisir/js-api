package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.payment.model.PayOrder;

/**
 * 查询单个付款订单bean
 * @author Administrator
 *
 */
public class PayOrderSingleBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String payOrderId;			//付款流水号
	private PayOrder payOrder;			//订单对象
	
	public String getPayOrderId() {
		return payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public PayOrder getPayOrder() {
		return payOrder;
	}
	public void setPayOrder(PayOrder payOrder) {
		this.payOrder = payOrder;
	}
	
}
