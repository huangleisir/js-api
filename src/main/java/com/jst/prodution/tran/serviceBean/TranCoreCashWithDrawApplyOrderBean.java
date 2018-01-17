package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreCashWithDrawApplyOrderBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String busNo;// 交易流水号
	private String state;// 状态
	private Integer tranAmout;// 金额
	private Integer tranFee;// 手续费
    private Integer tranDate;// 交易日期
    private String bankAcctNo;// 银行卡号
    private String bankAcctNoS;// 银行卡后4位
    private String provisionsAcctNo;// 备付金卡号
    private String sourceFrom;// 系统来源
	private String approveStatus;// 审核状态
	private String approveRemark;// 审批备注
	private String frozenId;// 冻结编号
    private String acctId;// 账户号
	private String userId;// 用户号
	private String userName;// 用户名称
	private String callType;// 订单调账方式
	private String writeoffFlag;// 被冲销标志（Y-已冲销，N-未冲销）
	private String linkPayNo;// 关联支付订单流水号
	private String remark;// 备注
	private String createUser;// 创建人（系统默认“99”，其它为运营人员ID号）
	private String updateUser;// 最后更新人
	private String createTime;// 新增时间
	private String updateTime;// 最后更新时间

	public Integer getTranDate() {
		return tranDate;
	}

	public void setTranDate(Integer tranDate) {
		this.tranDate = tranDate;
	}

	public String getBankAcctNo() {
		return bankAcctNo;
	}

	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}

	public String getProvisionsAcctNo() {
		return provisionsAcctNo;
	}

	public void setProvisionsAcctNo(String provisionsAcctNo) {
		this.provisionsAcctNo = provisionsAcctNo;
	}

	public String getBankAcctNoS() {
		return bankAcctNoS;
	}

	public void setBankAcctNoS(String bankAcctNoS) {
		this.bankAcctNoS = bankAcctNoS;
	}

	public String getSourceFrom() {
		return sourceFrom;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

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

	public Integer getTranAmout() {
		return tranAmout;
	}

	public void setTranAmout(Integer tranAmout) {
		this.tranAmout = tranAmout;
	}

	public Integer getTranFee() {
		return tranFee;
	}

	public void setTranFee(Integer tranFee) {
		this.tranFee = tranFee;
	}

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getApproveRemark() {
		return approveRemark;
	}

	public void setApproveRemark(String approveRemark) {
		this.approveRemark = approveRemark;
	}

	public String getFrozenId() {
		return frozenId;
	}

	public void setFrozenId(String frozenId) {
		this.frozenId = frozenId;
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

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public String getWriteoffFlag() {
		return writeoffFlag;
	}

	public void setWriteoffFlag(String writeoffFlag) {
		this.writeoffFlag = writeoffFlag;
	}

	public String getLinkPayNo() {
		return linkPayNo;
	}

	public void setLinkPayNo(String linkPayNo) {
		this.linkPayNo = linkPayNo;
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

}
