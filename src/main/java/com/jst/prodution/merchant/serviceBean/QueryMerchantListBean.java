package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantBase;

public class QueryMerchantListBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String userId;                 //商户号
	private String upUserId;                 //商户号
	private String merchantId;					//商户号
	private String merchantName;				//商户名称
	private String state;						//状态
	private String level;						//信用等级
	private List<MerchantBase> merchantList;	//商户列表
	private String merchantLevel;				//商户等级
	private String upMerchantId;				//上级商户号
	private String upCompanyName;				//上级商户名称
	private String jstMerchantId;				//捷顺通商户号
	private String updateMenuTime;				//修改菜单时间
	private String memberStatus;				//会员状态
	private String secretKey;					//商户密钥
	private String companyEmail;				//商户邮箱
	private String mchntSignAcc;				//拓展商:JST（捷顺通）,SYT（顺易通）,JYF（捷易付）
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public List<MerchantBase> getMerchantList() {
		return merchantList;
	}
	public void setMerchantList(List<MerchantBase> merchantList) {
		this.merchantList = merchantList;
	}
    public String getJstMerchantId() {
		return jstMerchantId;
	}
	public void setJstMerchantId(String jstMerchantId) {
		this.jstMerchantId = jstMerchantId;
	}
	/**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * @return the upUserId
     */
    public String getUpUserId() {
        return upUserId;
    }
    /**
     * @param upUserId the upUserId to set
     */
    public void setUpUserId(String upUserId) {
        this.upUserId = upUserId;
    }
	public String getMerchantLevel() {
		return merchantLevel;
	}
	public void setMerchantLevel(String merchantLevel) {
		this.merchantLevel = merchantLevel;
	}
	public String getUpMerchantId() {
		return upMerchantId;
	}
	public void setUpMerchantId(String upMerchantId) {
		this.upMerchantId = upMerchantId;
	}
	public String getUpCompanyName() {
		return upCompanyName;
	}
	public void setUpCompanyName(String upCompanyName) {
		this.upCompanyName = upCompanyName;
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
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getMchntSignAcc() {
		return mchntSignAcc;
	}
	public void setMchntSignAcc(String mchntSignAcc) {
		this.mchntSignAcc = mchntSignAcc;
	}
}
