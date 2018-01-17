package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 *  商户解约bean
 * @author hewen
 *
 */
public class MerRescissionBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	/**
	 * 第三方用户id
	 */
	private  String thirdUserId;
	
	private String userId;
	
	private String type ;
	/**
	 * 商户号 
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
	 * 处理返回码  0000 成功  
	 */
	private  String  resType;

	public String getThirdUserId() {
		return thirdUserId;
	}

	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getResType() {
		return resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
	}
	
}
