package com.jst.prodution.common.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.common.model.PayChannelModel;
/**
 * 
 * @Package: com.jst.prodution.common.serviceBean
 * @ClassName: PayChannelBean.java
 * @Description: 支付渠道列表bean
 *
 * @author: wanghuai
 * @date: 2017年9月15日 下午7:40:04 
 * @version: V1.0
 *
 */
public class PayChannelBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 记录主键Id
	 */
	private String id;
	/**
	 *	应用Id
	 */
	private String jstAppId;
	/**
	 * APP名称
	 */
	private String jstAppName;
	/**
	 * 展示名称
	 */
	private String showName;
	/**
	 * 支付渠道Id
	 */
	private String payChannelId;
	/**
	 * 支付方式
	 */
	private String payType;
	/**
	 * 渠道状态
	 */
	private String status;
	/**
	 * 支付渠道LOGO
	 */
	private String logoUrl;
	/**
	 * 场景编码
	 */
	private String sceneCode;
	/**
	 * 场景备注
	 */
	private String remarks;
	/**
	 * 优先级
	 */
	private String priority;
	/**
	 * 创建人
	 */
	private String createUser;
	/**
	 * 修改人
	 */
	private String updateUser;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 支付渠道记录
	 */
	private List<PayChannelModel> modelList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJstAppId() {
		return jstAppId;
	}
	public void setJstAppId(String jstAppId) {
		this.jstAppId = jstAppId;
	}
	public String getJstAppName() {
		return jstAppName;
	}
	public void setJstAppName(String jstAppName) {
		this.jstAppName = jstAppName;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getSceneCode() {
		return sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
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
	public List<PayChannelModel> getModelList() {
		return modelList;
	}
	public void setModelList(List<PayChannelModel> modelList) {
		this.modelList = modelList;
	}
	
	
}
