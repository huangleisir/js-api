package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 重新付款bean
 * @author Administrator
 *
 */
public class OrderRepayBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String orderNo;				//订单号

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
}
