package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class MerchantBaseBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String merchantId;
	private String companyName;
	private String jstMerchantId;
	private String updateMenuTime;
	private String memberStatus;
	private String upMerchantId;
	private String upUserId;
	private String upCompanyName;
	private String merchantLevel;
	private List<MerchantBaseBean> merchList;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJstMerchantId() {
		return jstMerchantId;
	}
	public void setJstMerchantId(String jstMerchantId) {
		this.jstMerchantId = jstMerchantId;
	}
	public String getUpdateMenuTime() {
		return updateMenuTime;
	}
	public void setUpdateMenuTime(String updateMenuTime) {
		this.updateMenuTime = updateMenuTime;
	}
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	public String getUpMerchantId() {
		return upMerchantId;
	}
	public void setUpMerchantId(String upMerchantId) {
		this.upMerchantId = upMerchantId;
	}
	public String getUpUserId() {
		return upUserId;
	}
	public void setUpUserId(String upUserId) {
		this.upUserId = upUserId;
	}
	public String getUpCompanyName() {
		return upCompanyName;
	}
	public void setUpCompanyName(String upCompanyName) {
		this.upCompanyName = upCompanyName;
	}
	public String getMerchantLevel() {
		return merchantLevel;
	}
	public void setMerchantLevel(String merchantLevel) {
		this.merchantLevel = merchantLevel;
	}
	public List<MerchantBaseBean> getMerchList() {
		return merchList;
	}
	public void setMerchList(List<MerchantBaseBean> merchList) {
		this.merchList = merchList;
	}
	
}
