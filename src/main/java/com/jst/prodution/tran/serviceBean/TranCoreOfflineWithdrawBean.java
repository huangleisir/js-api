package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreOfflineWithdrawBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String busNo;// 交易流水号
	private String state;// 状态
	private String failReason;// 失败原因
	private String approveStatus;// 审批状态
	private String frozenId;//冻结流水号
	private Long tranAmout;// 金额
	private String tranDate;// 交易日期
	private String bankAcctNo;// 提现渠道银行卡
	private String bankSerialNo;// 银行流水号
	private String receiveBankCard;// 收款方银行卡号
	private String userId;// 用户标识
	private String userName;// 用户名称
	private String remark;// 备注
	private String createUser;// 创建人
	private String updateUser;// 最后更新人
	private Date createTime;// 新增时间
	private Date updateTime;// 最后更新时间

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getFrozenId() {
		return frozenId;
	}

	public void setFrozenId(String frozenId) {
		this.frozenId = frozenId;
	}

	public Long getTranAmout() {
		return tranAmout;
	}

	public void setTranAmout(Long tranAmout) {
		this.tranAmout = tranAmout;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getBankAcctNo() {
		return bankAcctNo;
	}

	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}

	public String getBankSerialNo() {
		return bankSerialNo;
	}

	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}

	public String getReceiveBankCard() {
		return receiveBankCard;
	}

	public void setReceiveBankCard(String receiveBankCard) {
		this.receiveBankCard = receiveBankCard;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

}
