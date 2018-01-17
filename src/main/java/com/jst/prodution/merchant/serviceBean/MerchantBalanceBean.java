package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantBalance;

public class MerchantBalanceBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String merchantId;								//商户号
	private String userId;								//商户会员号
	private String companyName;							//商户名称
	private String memberStatus;
	private List<MerchantBalance> merchantBalanceList;	//结果列表
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
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	public List<MerchantBalance> getMerchantBalanceList() {
		return merchantBalanceList;
	}
	public void setMerchantBalanceList(List<MerchantBalance> merchantBalanceList) {
		this.merchantBalanceList = merchantBalanceList;
	}

}
