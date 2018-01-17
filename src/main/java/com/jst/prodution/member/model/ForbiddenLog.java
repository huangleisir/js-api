package com.jst.prodution.member.model;

/**
 * 禁用解禁流水记录
 * @author 吴安辉
 *
 */
public class ForbiddenLog implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private String logId;			//流水ID
	private String userId;			//会员ID
	private String frozenType;		//禁用类型：1.冻结 2 解冻 3.禁用 4解禁
	private String frozenStatus;	//禁用状态：1、正常 2、异常
	private String frozenRemark;	//描述信息
	private String frozenChannel;	//禁用来源：1.风控 2.运营 3内部禁用
	private String creator;			//创建者
	private String createTime;		//创建时间
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFrozenType() {
		return frozenType;
	}
	public void setFrozenType(String frozenType) {
		this.frozenType = frozenType;
	}
	public String getFrozenStatus() {
		return frozenStatus;
	}
	public void setFrozenStatus(String frozenStatus) {
		this.frozenStatus = frozenStatus;
	}
	public String getFrozenRemark() {
		return frozenRemark;
	}
	public void setFrozenRemark(String frozenRemark) {
		this.frozenRemark = frozenRemark;
	}
	public String getFrozenChannel() {
		return frozenChannel;
	}
	public void setFrozenChannel(String frozenChannel) {
		this.frozenChannel = frozenChannel;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
