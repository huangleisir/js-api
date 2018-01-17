package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 付款中心--订单一审业务bean
 * @author Administrator
 *
 */
public class FirstReviewPayOrderBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String payOrderId;			//付款订单ID
	private String state;				//审核状态：1通过 2不通过（拒绝）
	private String mark;				//备注
	private String payBankName;			//付款银行名称
	private String payBankCode;			//付款银行编号
	private String payAccount;			//付款账号
	
	public String getPayOrderId() {
		return payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getPayBankName() {
		return payBankName;
	}
	public void setPayBankName(String payBankName) {
		this.payBankName = payBankName;
	}
	public String getPayBankCode() {
		return payBankCode;
	}
	public void setPayBankCode(String payBankCode) {
		this.payBankCode = payBankCode;
	}
	public String getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	
}
