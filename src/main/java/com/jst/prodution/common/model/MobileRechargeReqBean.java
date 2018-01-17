package com.jst.prodution.common.model;

import com.jst.prodution.base.bean.BaseBean;

public class MobileRechargeReqBean extends BaseBean {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3768606570426755175L;
	/**
	 * token
	 */
	private String token;
	/**
	 * appId
	 */
	private String appId;
	/**
	 * 待充值手机号
	 */
	private String rechargeMobile;
	/**
	 * 用户手机号 userMobile
	 */
	private String userMobile;
	/**
	 * 面额
	 */
	private long rechargeAmount;
	
	/**
	 * 支付金额
	 */
	private long payAmount;
	
	/**
	 * 手机号归属地编码
	 */
	private String areaCode;
	/**
	 * 签名
	 * @return
	 */
	private String sign;
	/**
	 * 话费充值订单编号
	 * @return
	 */
	private long orderNo;
	/**
	 * 支付类型
	 * @return
	 */
	private String payType;
	
	/**
	 * deviceFinger
	 * @return
	 */
	
	private String deviceFinger;
	/**
	 * deviceType
	 */
	private String deviceType;
	/**
	 * userId
	 * @return
	 */
	private String userId;
	/**
	 * payChannelId  Alipay WeChat JYF
	 * @return
	 */
	private String payChannelId;
	/**
	 *请求时间戳
	 * @return
	 */
	private String reqTimestamp;
	/**
	 * 用于封装支付订单下单成功后，获取到的支付凭证，支付页面url等封装到data 中
	 */
	private Object data;
	
	private String key;
	
	private String terminalType;
	
	private String areaName;
	
	private String carrierName;
	
	private String pageUrl;
	
	
	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getReqTimestamp() {
		return reqTimestamp;
	}

	public void setReqTimestamp(String reqTimestamp) {
		this.reqTimestamp = reqTimestamp;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getDeviceFinger() {
		return deviceFinger;
	}

	public void setDeviceFinger(String deviceFinger) {
		this.deviceFinger = deviceFinger;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getRechargeMobile() {
		return rechargeMobile;
	}

	public void setRechargeMobile(String rechargeMobile) {
		this.rechargeMobile = rechargeMobile;
	}

	public long getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(long rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(long payAmount) {
		this.payAmount = payAmount;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "MobileRechargeReqBean [token=" + token + ", appId=" + appId + ", rechargeMobile=" + rechargeMobile
				+ ", userMobile=" + userMobile + ", rechargeAmount=" + rechargeAmount + ", payAmount=" + payAmount
				+ ", areaCode=" + areaCode + ", sign=" + sign + ", orderNo=" + orderNo + ", payType=" + payType
				+ ", deviceFinger=" + deviceFinger + ", deviceType=" + deviceType + ", userId=" + userId
				+ ", payChannelId=" + payChannelId + ", reqTimestamp=" + reqTimestamp + ", data=" + data + ", key="
				+ key + ", terminalType=" + terminalType + ", areaName=" + areaName + ", carrierName=" + carrierName
				+ "]";
	}



	
}
