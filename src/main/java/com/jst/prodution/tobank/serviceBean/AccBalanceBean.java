package com.jst.prodution.tobank.serviceBean;

/**
 * 账户余额bean
 * @author Administrator
 *
 */
public class AccBalanceBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private String bankName;				//银行名称
	private String bankCode;				//银行编号
	private String accNo;					//账号
	private String balance;					//余额
	private String avaliBalance;			//可用余额
	private String accInterset;				//账户利息
	private String accRate;					//利息利率
	private String accState;				//账户状态
	
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
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAvaliBalance() {
		return avaliBalance;
	}
	public void setAvaliBalance(String avaliBalance) {
		this.avaliBalance = avaliBalance;
	}
	public String getAccInterset() {
		return accInterset;
	}
	public void setAccInterset(String accInterset) {
		this.accInterset = accInterset;
	}
	public String getAccRate() {
		return accRate;
	}
	public void setAccRate(String accRate) {
		this.accRate = accRate;
	}
	public String getAccState() {
		return accState;
	}
	public void setAccState(String accState) {
		this.accState = accState;
	}
}
