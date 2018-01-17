package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.model.UserAgreement;

/**
 * 查询签约详情bean
 * @author hewen
 *
 */
public class SelUserAgreementBean extends BaseBean {
	private static final long serialVersionUID = 1L;
    
	/**
	 * 用户id
	 */
	private String userId;
	
	/**
	 * 第三方用户id
	 */
	private  String thirdUserId;
	
	/**
	 * 商户查签约状态 Y 签约， N 解约 
	 */
	private String status;
	
	/**
	 * 商户id
	 */
	private String merchantId;
	
	/**
	 * appId
	 */
	private String appId;
	
	/**
	 * 开通渠道号  
	 */
	private String channelNo;
	
	/**
	 * 渠道来源 
	 */
	private String regChannel;
	
	/**
	 * 开通列表  
	 */
	private List<UserAgreement>     selList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getThirdUserId() {
		return thirdUserId;
	}

	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}
    
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	
	public String getRegChannel() {
		return regChannel;
	}

	public void setRegChannel(String regChannel) {
		this.regChannel = regChannel;
	}

	public List<UserAgreement> getSelList() {
		return selList;
	}

	public void setSelList(List<UserAgreement> selList) {
		this.selList = selList;
	}
	
}
