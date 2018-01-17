package com.jst.prodution.merchant.model;

public class MerchantBalance implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String merchantId;			//商户号
	private String userId;			//商户会员号
	private String companyName;		//商户名称
	private Long balance;			//账户余额
	private Long freeBalance;		//可用余额
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public Long getFreeBalance() {
		return freeBalance;
	}
	public void setFreeBalance(Long freeBalance) {
		this.freeBalance = freeBalance;
	}

}
