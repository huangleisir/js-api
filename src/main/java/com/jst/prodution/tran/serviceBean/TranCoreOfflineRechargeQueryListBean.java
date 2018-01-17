package com.jst.prodution.tran.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreOfflineRechargeQueryListBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String busNo;// 交易流水号
	private String state;// 状态
	private String failReason;// 失败原因
	private String approveStatus;// 审批状态
	private Long tranAmout;// 金额
	private String tranDate;// 交易日期
	private String bankAcctNo;// 充值渠道银行卡
	private String bankSerialNo;// 银行流水号
	private String payBankCard;// 付款方银行卡号
	private String userId;// 用户标识
	private String userName;// 用户名称
	private String remark;// 备注
	private String createUser;// 创建人
	private String updateUser;// 最后更新人
	private String createTime;// 新增时间
	private String updateTime;// 最后更新时间
	private Long tranAmoutSum;// 交易金额汇总
	private String acctId;//充值账户

	private List<TranCoreOfflineRechargeQueryListBean> tranCoreOfflineRechargeQueryList;

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public Long getTranAmoutSum() {
		return tranAmoutSum;
	}

	public void setTranAmoutSum(Long tranAmoutSum) {
		this.tranAmoutSum = tranAmoutSum;
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

	public String getPayBankCard() {
		return payBankCard;
	}

	public void setPayBankCard(String payBankCard) {
		this.payBankCard = payBankCard;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public List<TranCoreOfflineRechargeQueryListBean> getTranCoreOfflineRechargeQueryList() {
		return tranCoreOfflineRechargeQueryList;
	}

	public void setTranCoreOfflineRechargeQueryList(
			List<TranCoreOfflineRechargeQueryListBean> tranCoreOfflineRechargeQueryList) {
		this.tranCoreOfflineRechargeQueryList = tranCoreOfflineRechargeQueryList;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

}
