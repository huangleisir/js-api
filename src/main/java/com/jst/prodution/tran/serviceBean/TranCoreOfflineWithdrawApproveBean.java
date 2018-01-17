package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreOfflineWithdrawApproveBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String busNo;// 交易流水号
	private String state;// 状态
	private String failReason;// 失败原因
	private String approveStatus;// 审批状态
	private String frozenId;//冻结流水号
	private String remark;// 备注
	private String updateUser;// 最后更新人
	private String updateTime;// 最后更新时间
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
