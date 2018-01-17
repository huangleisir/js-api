package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class LaneYFKCheckCardBean extends BaseBean {

	/**
	 * 调用预付卡前置系统校验捷顺通卡信息
	 */
	private static final long serialVersionUID = 1L;
	
	private String cardNo;//捷顺通卡号
	private String totalFee;//充值金额
	
	//出参
	private String orderNo;//预付卡前置生成的订单号
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
