package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.merchant.model.MerchantCheckStatusBank;

public class BankCardCheckStatusBean extends BankCardBean{

	/**
	 * 获取查询bean，返回的查询列表
	 */
	private static final long serialVersionUID = 1L;
	
	private String merchantId;
	
	private String companyName;
	
	private String offer;
	
	private List<MerchantCheckStatusBank> merchantBankList;
	
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

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	public List<MerchantCheckStatusBank> getMerchantBankList() {
		return merchantBankList;
	}

	public void setMerchantBankList(List<MerchantCheckStatusBank> merchantBankList) {
		this.merchantBankList = merchantBankList;
	}


}
