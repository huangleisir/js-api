package com.jst.prodution.member.listbean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.model.UserAgreement;

public class UserAgreementListBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 商户号
	 */
	private String merchantId;
	
	/**
	 * 商户名称
	 */
	private String companyName;
	
	/**
	 * 签约渠道
	 */
	private String channelNo;
	
	/**
	 * 会员号
	 */
	private String userId;
	
	/**
	 * 注册手机号
	 */
	private String mobile;
	
	/**
	 * 签约状态(Y:签约 ，N解约 )
	 */
	private String status;
	
	/**
	 * 签约时间
	 */
	private String signTime;
	
	/**
	 * 解约时间
	 */
	private String rescissionTime;
	
	/**
	 * 数据集
	 */
	private List<UserAgreement> pageList;

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
	
	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSignTime() {
		return signTime;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getRescissionTime() {
		return rescissionTime;
	}

	public void setRescissionTime(String rescissionTime) {
		this.rescissionTime = rescissionTime;
	}

	public List<UserAgreement> getPageList() {
		return pageList;
	}

	public void setPageList(List<UserAgreement> pageList) {
		this.pageList = pageList;
	}
}
