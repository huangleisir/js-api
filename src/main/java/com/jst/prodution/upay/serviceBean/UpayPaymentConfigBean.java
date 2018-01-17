package com.jst.prodution.upay.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.upay.model.PaymentConfigModel;
/**
 * 
 * @Package: com.jst.prodution.upay.serviceBean
 * @ClassName: UpayPaymentConfigBean.java
 * @Description: OCD金科商户和微信支付账户映射关系实体类
 *
 * @author: wanghuai
 * @date: 2017年7月25日 上午11:06:46 
 * @version: V1.0
 *
 */
public class UpayPaymentConfigBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String id;
	private String jstAppName;
	private String appRemarks;
	private String jstMchName;
	private String mchRemarks;
	private String jstAppId;
	private String jstMchId;
	private String jstKey;
	private String appId;
	private String appSecret;
	private String mchId;
	private String key;
	private String payChannelId;
	private String payType;
	private String notifyUrl;
	private String status;
	private String certPath;
	private Date createTime;
	private Date updateTime;
	private List<PaymentConfigModel> resultList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJstAppName() {
		return jstAppName;
	}
	public void setJstAppName(String jstAppName) {
		this.jstAppName = jstAppName;
	}
	public String getAppRemarks() {
		return appRemarks;
	}
	public void setAppRemarks(String appRemarks) {
		this.appRemarks = appRemarks;
	}
	public String getJstMchName() {
		return jstMchName;
	}
	public void setJstMchName(String jstMchName) {
		this.jstMchName = jstMchName;
	}
	public String getMchRemarks() {
		return mchRemarks;
	}
	public void setMchRemarks(String mchRemarks) {
		this.mchRemarks = mchRemarks;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
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
	public List<PaymentConfigModel> getResultList() {
		return resultList;
	}
	public void setResultList(List<PaymentConfigModel> resultList) {
		this.resultList = resultList;
	}
}
