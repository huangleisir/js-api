package com.jst.prodution.merchant.model;

public class MerchantCheckStatusBank extends MerchantBank {

	/**
	 *  t_merchant_bank关联表t_merchant_base,获取merchant_id
	 */
	private static final long serialVersionUID = 1L;
	
	private String merchantId;
	
	private String companyName;
	
	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
