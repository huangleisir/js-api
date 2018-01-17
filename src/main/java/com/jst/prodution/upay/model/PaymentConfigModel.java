package com.jst.prodution.upay.model;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class PaymentConfigModel implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private int id;				//主键ID
	private String jstAppName;	//app名称
	private String jstMchName;	//商户名称
	private String jstAppId;    //OCD 的 appid
	private String jstMchId;	//OCD 的商户号
	private String jstKey;		//OCD 的密钥
	
	private String appId;		//第三方渠道的appid（微信、支付宝、捷易付）
	private String appSecret;	//第三方渠道的appSecret（微信、支付宝、捷易付）
	private String mchId;		//第三方渠道的商户号（微信、支付宝、捷易付）
	private String key;			//第三方渠道的支付密钥（微信、支付宝、捷易付）
	private String payChannelId;//支付渠道	（微信、支付宝、捷易付）
	private String payType;		//支付方式
	private String notifyUrl;	//后台通知地址
	private int status;		//帐号状态： 1启用、2停用
	private String certPath;	//证书路径
	private Date createTime;
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJstAppName() {
		return jstAppName;
	}
	public void setJstAppName(String jstAppName) {
		this.jstAppName = jstAppName;
	}
	public String getJstMchName() {
		return jstMchName;
	}
	public void setJstMchName(String jstMchName) {
		this.jstMchName = jstMchName;
	}
	public String getJstAppId() {
		return jstAppId;
	}
	public void setJstAppId(String jstAppId) {
		this.jstAppId = jstAppId;
	}
	public String getJstMchId() {
		return jstMchId;
	}
	public void setJstMchId(String jstMchId) {
		this.jstMchId = jstMchId;
	}
	public String getJstKey() {
		return jstKey;
	}
	public void setJstKey(String jstKey) {
		this.jstKey = jstKey;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	public String getMchId() {
		return mchId;
	}
	public void setMchId(String mchId) {
		this.mchId = mchId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getPayChannelId() {
		return payChannelId;
	}
	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCertPath() {
		return certPath;
	}
	public void setCertPath(String certPath) {
		this.certPath = certPath;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
}
