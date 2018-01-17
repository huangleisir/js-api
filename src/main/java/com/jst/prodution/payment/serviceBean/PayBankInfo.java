package com.jst.prodution.payment.serviceBean;

import java.util.List;

/**
 * 封装银行账号
 * @author Administrator
 *
 */
public class PayBankInfo implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String bankName;				//银行名称
	private String bankCode;				//银行简称
	private List<String> accountList;		//账号列表
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public List<String> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<String> accountList) {
		this.accountList = accountList;
	}
	
}
