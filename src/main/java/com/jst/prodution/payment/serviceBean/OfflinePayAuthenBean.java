package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 线下打款操作bean
 * @author Administrator
 *
 */
public class OfflinePayAuthenBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String payOrderId;				//付款订单ID
	private String payTime;					//出款时间
	private String receiptTime;				//银行回执时间
	private String bankBusNo;				//银行处理外部流水号			
	private String processState;			//处理状态：03付款失败 04付款成功
	private String mark;					//备注
	private String payBankName;				//付款银行名称
	private String payBankCode;				//付款银行编号
	private String payAccount;				//付款银行账号
	
	public String getPayOrderId() {
		return payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getReceiptTime() {
		return receiptTime;
	}
	public void setReceiptTime(String receiptTime) {
		this.receiptTime = receiptTime;
	}
	public String getBankBusNo() {
		return bankBusNo;
	}
	public void setBankBusNo(String bankBusNo) {
		this.bankBusNo = bankBusNo;
	}
	public String getProcessState() {
		return processState;
	}
	public void setProcessState(String processState) {
		this.processState = processState;
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
