package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class MerchantWithDrawCashLogBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int logId;						//日志ID
	
	private String userId;					//会员号
	
	private String merchantId;				//商户号
	
	private String bankAccount;				//银行账号
	
	private String bankName;				//银行名称
	
	private String openName;				//开户人
	
	private int withdrawCashAmount;			//提现金额
	
	private int withdrawCashAmountSum;		//提现金额总和
	
	private String withdrawCashTime;		//提现时间
	
	private String withdrawCashPerson;		//提现人

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getOpenName() {
		return openName;
	}

	public void setOpenName(String openName) {
		this.openName = openName;
	}

	public int getWithdrawCashAmount() {
		return withdrawCashAmount;
	}

	public void setWithdrawCashAmount(int withdrawCashAmount) {
		this.withdrawCashAmount = withdrawCashAmount;
	}

	public int getWithdrawCashAmountSum() {
		return withdrawCashAmountSum;
	}

	public void setWithdrawCashAmountSum(int withdrawCashAmountSum) {
		this.withdrawCashAmountSum = withdrawCashAmountSum;
	}

	public String getWithdrawCashTime() {
		return withdrawCashTime;
	}

	public void setWithdrawCashTime(String withdrawCashTime) {
		this.withdrawCashTime = withdrawCashTime;
	}

	public String getWithdrawCashPerson() {
		return withdrawCashPerson;
	}

	public void setWithdrawCashPerson(String withdrawCashPerson) {
		this.withdrawCashPerson = withdrawCashPerson;
	}
	
}
