package com.jst.prodution.member.model;

import java.io.Serializable;

public class TmsLog implements Serializable{
	private static final long serialVersionUID = 1L;
	//日志流水号
	private String tmsLogId;
	//用户id
	private String userId;
	//业务类型
	private String businessType;
	//客户端ip地址
	private String clientIp;
	//风控评估标识（Y:已评估 N:未评估）
	private String evaluateFlag;
	//风控评估结果
	private String evaluateResult;
	//风险评估命中规则列表
	private String evaluateRiskList;
	//风控确认标识（Y:已确认 N:未确认）
	private String confirmFlag;
	//风控确认结果
	private String confirmResult;
	//执行时间
	private String executeTime;
	//修改时间
	private String updateTime;
	//执行结果（Y:成功 N:失败）
	private String executeResult;
	//系统异常信息
	private String sysError;
	
	
	public String getTmsLogId() {
		return tmsLogId;
	}
	public void setTmsLogId(String tmsLogId) {
		this.tmsLogId = tmsLogId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getEvaluateFlag() {
		return evaluateFlag;
	}
	public void setEvaluateFlag(String evaluateFlag) {
		this.evaluateFlag = evaluateFlag;
	}
	public String getEvaluateResult() {
		return evaluateResult;
	}
	public void setEvaluateResult(String evaluateResult) {
		this.evaluateResult = evaluateResult;
	}
	public String getEvaluateRiskList() {
		return evaluateRiskList;
	}
	public void setEvaluateRiskList(String evaluateRiskList) {
		this.evaluateRiskList = evaluateRiskList;
	}
	public String getConfirmFlag() {
		return confirmFlag;
	}
	public void setConfirmFlag(String confirmFlag) {
		this.confirmFlag = confirmFlag;
	}
	public String getConfirmResult() {
		return confirmResult;
	}
	public void setConfirmResult(String confirmResult) {
		this.confirmResult = confirmResult;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getExecuteTime() {
		return executeTime;
	}
	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getExecuteResult() {
		return executeResult;
	}
	public void setExecuteResult(String executeResult) {
		this.executeResult = executeResult;
	}
	public String getSysError() {
		return sysError;
	}
	public void setSysError(String sysError) {
		this.sysError = sysError;
	}
}
