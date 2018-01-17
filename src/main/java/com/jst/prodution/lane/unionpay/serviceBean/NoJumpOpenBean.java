package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联无跳转开通bean
 * @author pengyuanjun
 *
 */
public class NoJumpOpenBean extends BaseBean {
	private static final long serialVersionUID = -268288159383409847L;

	/**
	 * 商户订单号，8-40位数字字母，不能含“-”或“_”，可以自行定制规则
	 */
	private String orderId;
	/**
	 * 订单交易时间(格式为YYYYMMDDhhmmss，必须取当前时间，否则会报无效)
	 */
	private String tradeTime;
	/**
	 * 银行卡号
	 */
	private String bankCardNo;
	/**
	 * 手机号
	 */
	private String phoneNo;
	/**
	 * 证件类型(01:身份证)
	 */
	private String certifType;
	/**
	 * 证件号码
	 */
	private String certifId;
	/**
	 * 姓名
	 */
	private String fullName;
	/**
	 * 前台通知地址
	 */
	private String frontUrl;
	/**
	 * 订单超时时间(单位分钟)
	 */
	private int expireTime;
	/**
	 * 开通时申请成的html(把此html输出到浏览器,然后跳转到银联页面)
	 */
	private String generateHtml;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCertifType() {
		return certifType;
	}

	public void setCertifType(String certifType) {
		this.certifType = certifType;
	}

	public String getCertifId() {
		return certifId;
	}

	public void setCertifId(String certifId) {
		this.certifId = certifId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGenerateHtml() {
		return generateHtml;
	}

	public void setGenerateHtml(String generateHtml) {
		this.generateHtml = generateHtml;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getFrontUrl() {
		return frontUrl;
	}

	public void setFrontUrl(String frontUrl) {
		this.frontUrl = frontUrl;
	}

	public int getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(int expireTime) {
		this.expireTime = expireTime;
	}
}
