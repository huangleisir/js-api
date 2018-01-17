package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 转人工付款处理
 * @author Administrator
 *
 */
public class ChangeToManualPayBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String orderNo;				//订单号

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
