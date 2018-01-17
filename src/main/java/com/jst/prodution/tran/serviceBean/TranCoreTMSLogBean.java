package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreTMSLogBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String tmsId;// 日志ID
	private String optType;// 操作类型0-查询(暂未开发)，1-插入)
	private String userId;// 用户标识
	private String backCode;// 返回码
	private String backInfo;// 返回信息
	private String txnCode;// 交易流水号
	private String txnId;// 交易标识
	private String txnName;// 交易名称
	private String score;// 风险分值
	private String disposal;// 处置方式
	private Integer hitRuleNum;// 规则命中数
	private String trigRuleNum;// 规则触发数
	private String hitRules;// 规则命中列表
	private String deviceToken;// 设备标识
	private String cookieName;// Cookie名称
	private String errorInfo;// 返回错误信息
	private String createUser;// 创建人
	private Date updateTime;// 更新时间

	public String getTmsId() {
		return tmsId;
	}

	public void setTmsId(String tmsId) {
		this.tmsId = tmsId;
	}

	public String getOptType() {
		return optType;
	}

	public void setOptType(String optType) {
		this.optType = optType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBackCode() {
		return backCode;
	}

	public void setBackCode(String backCode) {
		this.backCode = backCode;
	}

	public String getBackInfo() {
		return backInfo;
	}

	public void setBackInfo(String backInfo) {
		this.backInfo = backInfo;
	}

	public String getTxnCode() {
		return txnCode;
	}

	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getTxnName() {
		return txnName;
	}

	public void setTxnName(String txnName) {
		this.txnName = txnName;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getDisposal() {
		return disposal;
	}

	public void setDisposal(String disposal) {
		this.disposal = disposal;
	}

	public Integer getHitRuleNum() {
		return hitRuleNum;
	}

	public void setHitRuleNum(Integer hitRuleNum) {
		this.hitRuleNum = hitRuleNum;
	}

	public String getTrigRuleNum() {
		return trigRuleNum;
	}

	public void setTrigRuleNum(String trigRuleNum) {
		this.trigRuleNum = trigRuleNum;
	}

	public String getHitRules() {
		return hitRules;
	}

	public void setHitRules(String hitRules) {
		this.hitRules = hitRules;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public String getCookieName() {
		return cookieName;
	}

	public void setCookieName(String cookieName) {
		this.cookieName = cookieName;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
