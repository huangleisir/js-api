package com.jst.prodution.common.model;

import com.jst.prodution.base.bean.BaseBean;

/**
 * app version management class
 * @author huanglei
 *
 */
public class AppVersionBean extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * app id
	 */
	private String appId;
	/**
	 * app 名称
	 */
	private String appName;
	/**
	 * app 最新版本
	 */
	private String appLatestVersion;
	/**
	 * app需要更新的最小版本
	 */
	private String appMiniVersion;
	/**
	 * 是否强制更新
	 */
	private int isMandatory;
	/**
	 * os类型 1安卓 2.ios
	 */
	private int osType;
	/**
	 * 下载地址
	 */
	private  String downLoadUrl;
	/**
	 * 版本说明
	 */
	private String versionDesc;
	private String createUser;
	private String updateTime;
	private String lastUpdateUser;
	private String lastUpdateTime;
	private String version;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppLatestVersion() {
		return appLatestVersion;
	}
	public void setAppLatestVersion(String appLatestVersion) {
		this.appLatestVersion = appLatestVersion;
	}
	public int getIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(int isMandatory) {
		this.isMandatory = isMandatory;
	}
	public int getOsType() {
		return osType;
	}
	public void setOsType(int osType) {
		this.osType = osType;
	}
	public String getDownLoadUrl() {
		return downLoadUrl;
	}
	public void setDownLoadUrl(String downLoadUrl) {
		this.downLoadUrl = downLoadUrl;
	}
	public String getVersionDesc() {
		return versionDesc;
	}
	public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}
	public String getAppMiniVersion() {
		return appMiniVersion;
	}
	public void setAppMiniVersion(String appMiniVersion) {
		this.appMiniVersion = appMiniVersion;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getLastUpdateUser() {
		return lastUpdateUser;
	}
	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	@Override
	public String toString() {
		return "AppVersionBean [id=" + id + ", appId=" + appId + ", appName=" + appName + ", appLatestVersion="
				+ appLatestVersion + ", appMiniVersion=" + appMiniVersion + ", isMandatory=" + isMandatory + ", osType="
				+ osType + ", downLoadUrl=" + downLoadUrl + ", versionDesc=" + versionDesc + ", createUser="
				+ createUser + ", updateTime=" + updateTime + ", lastUpdateUser=" + lastUpdateUser + ", lastUpdateTime="
				+ lastUpdateTime + "]";
	}
	
	
	
	

}
