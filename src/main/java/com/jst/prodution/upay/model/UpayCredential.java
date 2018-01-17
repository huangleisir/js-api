package com.jst.prodution.upay.model;

import java.io.Serializable;

/**
 *@description:支付下单凭证,支付宝只有orderInfo ,放在sign字段里,微信支付和捷易付有其他的字段
 *@author  widon
 *@date: 2017年4月12日 下午2:06:47
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class UpayCredential implements Serializable {
    
	private static final long serialVersionUID = 1L;
	
	private String appId;
    private String mchId;
    private String nonceStr;
    private String sign;
    private String prePayId;
    private String codeUrl;
    private String timestamp;
    private String nativePackage;
    private String payStatus;
    
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getMchId() {
        return mchId;
    }
    public void setMchId(String mchId) {
        this.mchId = mchId;
    }
    public String getNonceStr() {
        return nonceStr;
    }
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }
    public String getSign() {
        return sign;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getPrePayId() {
        return prePayId;
    }
    public void setPrePayId(String prePayId) {
        this.prePayId = prePayId;
    }
    public String getCodeUrl() {
        return codeUrl;
    }
    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getNativePackage() {
        return nativePackage;
    }
    public void setNativePackage(String nativePackage) {
        this.nativePackage = nativePackage;
    }
}
