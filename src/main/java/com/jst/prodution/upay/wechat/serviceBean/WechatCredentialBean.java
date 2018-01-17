package com.jst.prodution.upay.wechat.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class WechatCredentialBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	
	private String appId;
	private String mchId;
	private String nonceStr;
	private String sign;
	private String signType;
	private String prePayId;
	private String codeUrl;
	private String timestamp;
	private String nativePackage;
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
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
}
