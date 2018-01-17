/**
 * author:汤广海
 * 2016年11月1日
 * 下午3:30:24
 */
package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class QmBindCardSedVadBean extends BaseBean {

	/**
	 * 快钱-绑卡第二次验证
	 */
	private static final long serialVersionUID = 1L;

	private String merchantId;// 商户编号
	private String terminalId;// 终端号
	private String customerId;// 客户号
	private String externalRefNumber;// 外部跟踪编号
	private String pan;// 卡号
	private String validCode;// 验证码
	private String token;// 安全校验值
	private String phoneNO;// 手机号码

	private String storablePan;// 缩略卡号
	private String responseCode;// 应答码
	private String responseTextMessage;// 应答码文本消息
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getExternalRefNumber() {
		return externalRefNumber;
	}
	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getValidCode() {
		return validCode;
	}
	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}
	public String getStorablePan() {
		return storablePan;
	}
	public void setStorablePan(String storablePan) {
		this.storablePan = storablePan;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseTextMessage() {
		return responseTextMessage;
	}
	public void setResponseTextMessage(String responseTextMessage) {
		this.responseTextMessage = responseTextMessage;
	}
	
}
