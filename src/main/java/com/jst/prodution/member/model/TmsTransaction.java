package com.jst.prodution.member.model;

import java.util.Map;

/**
 * 
* @ClassName: 
* @Description: 风控参数对象
* @author  caojianhua
* @date 2016-07-23 下午3:35:36 
*
 */
public class TmsTransaction  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cstNo;		//用户id
	private String transType; //交易类型
	private String channelType; //客户端渠道类型
	private String customer;
	private String expCode;	//错误码
	private Map<String, Object> extInfo; 
	private String transPin;
	private String transCode;	//交易流水
	private String transTime;	//交易时间
	private String transStatus; //交易状态
	private String authStatus;	//认证状态
	private String deviceid;
	private String deviceToken;//设备标记
	private String deviceFinger;//设备指纹
	private String ipAddress;//IP地址
	private String sessionId;
	private String dispatch;
	private boolean isTimeOut;
	
	
	public String getCstNo() {
		return cstNo;
	}
	public void setCstNo(String cstNo) {
		this.cstNo = cstNo;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getExpCode() {
		return expCode;
	}
	public void setExpCode(String expCode) {
		this.expCode = expCode;
	}
	public Map<String, Object> getExtInfo() {
		return extInfo;
	}
	public void setExtInfo(Map<String, Object> extInfo) {
		this.extInfo = extInfo;
	}
	public String getTransPin() {
		return transPin;
	}
	public void setTransPin(String transPin) {
		this.transPin = transPin;
	}
	public String getTransCode() {
		return transCode;
	}
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	public String getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public String getAuthStatus() {
		return authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDeviceToken() {
		return deviceToken;
	}
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
	public String getDeviceFinger() {
		return deviceFinger;
	}
	public void setDeviceFinger(String deviceFinger) {
		this.deviceFinger = deviceFinger;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getDispatch() {
		return dispatch;
	}
	public void setDispatch(String dispatch) {
		this.dispatch = dispatch;
	}
	public boolean isTimeOut() {
		return isTimeOut;
	}
	public void setTimeOut(boolean isTimeOut) {
		this.isTimeOut = isTimeOut;
	}
}