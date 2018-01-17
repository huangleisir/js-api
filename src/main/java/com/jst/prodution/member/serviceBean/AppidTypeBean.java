package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * appid 对应系统类型查询
 * @author liang
 *
 */
public class AppidTypeBean extends BaseBean {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String appId;  // 分配给商户的appid
	private String appType;     //1 内部系统 2 外部系统   
	private String appKey;     //
    private String regChannel;         //模块渠道1.APP 2.WEB 3.OMS 4.API 5.JTC 
    private String merchantId;         //商户号 
    private String merchantName ;    // 商户名称 
    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getAppType() {
        return appType;
    }
    public void setAppType(String appType) {
        this.appType = appType;
    }
    public String getAppKey() {
        return appKey;
    }
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
    public String getRegChannel() {
        return regChannel;
    }
    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }
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
	@Override
	public String toString() {
		return "AppidTypeBean [appId=" + appId + ", appType=" + appType + ", appKey=" + appKey + ", regChannel="
				+ regChannel + ", merchantId=" + merchantId + ", merchantName=" + merchantName + "]";
	}
	
}

