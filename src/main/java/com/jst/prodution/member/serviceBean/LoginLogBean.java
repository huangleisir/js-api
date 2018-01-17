package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员登录
 * @author liang
 *
 */
public class LoginLogBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String logId;    	//日志ID
	private String userId;		//用户ID
	private String clientId;    //客户端ID
	private String deviceId ;   //设备id
	private String deviceType ; //设备类型，1安卓，2ios
	private String appVersion ; //版本号
	private String status;      //状态
	private String appId;		//appid
	private String appKey;      //appkey
	private String terminalType;//终端类型（M：移动用户，P：PC用户）
	private String createTime;  //创建时间
	private List<LoginLogBean> list ;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getUserId() {
		return userId;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public List<LoginLogBean> getList() {
		return list;
	}

	public void setList(List<LoginLogBean> list) {
		this.list = list;
	}
}
