/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.market.dubbo.model;

import java.io.Serializable;

public class RechargeItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long rechargeAmt ; //	String	Y	充值金额，同请求,分
	private long transferAmt ; //		String	Y	到账金额,分
	private long payAmt ; //		String	Y	支付金额,分
	private long discountAmt ; //		String	Y	折扣金额,分
	private double calculateVal ;//		 //	String  优惠计算折扣值,分  20代表0.2元或者20%
	
	public long getRechargeAmt() {
		return rechargeAmt;
	}
	public void setRechargeAmt(long rechargeAmt) {
		this.rechargeAmt = rechargeAmt;
	}
	public long getTransferAmt() {
		return transferAmt;
	}
	public void setTransferAmt(long transferAmt) {
		this.transferAmt = transferAmt;
	}
	public long getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(long payAmt) {
		this.payAmt = payAmt;
	}
	public long getDiscountAmt() {
		return discountAmt;
	}
	public void setDiscountAmt(long discountAmt) {
		this.discountAmt = discountAmt;
	}
	public double getCalculateVal() {
		return calculateVal;
	}
	public void setCalculateVal(double calculateVal) {
		this.calculateVal = calculateVal;
	}
	
}
