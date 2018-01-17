package com.jst.prodution.tran.serviceBean;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreCashWithDrawApplyListBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String busNo;// 交易流水号
	private String state;// 状态
	private String busType;// 提现类型01:个人提现，02:商户提现
	private Integer tranAmout;// 金额
	private Integer tranFee;// 手续费
	private String approveStatus;// 审核状态
	private String approveRemark;// 审批备注
	private String frozenId;// 冻结编号
    private String acctId;// 账户号
    private String acctType;// 账户类型
//    private String payType;// 打款类型 0:线上打款  1：线下打款
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
    private String bankAcctNo;// 银行卡号
    private String bankAcctNoS;// 银行卡号后4位
    private String provisionsAcctNo;// 备付金卡号
	private Integer tranAmountSum;// 交易金额汇总
	private Integer tranFeeSum;//手续费金额汇总
	private List<TranCoreCashWithDrawApplyOrderBean> tranCoreCashWithDrawApplyOrderList;
	
	
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public Integer getTranAmountSum() {
		return tranAmountSum;
	}
	public void setTranAmountSum(Integer tranAmountSum) {
		this.tranAmountSum = tranAmountSum;
	}
	public Integer getTranFeeSum() {
		return tranFeeSum;
	}
	public void setTranFeeSum(Integer tranFeeSum) {
		this.tranFeeSum = tranFeeSum;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = StringUtils.isBlank(acctType) ? null : acctType;
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = StringUtils.isBlank(acctId) ? null : acctId;
	}
	public String getBankAcctNo() {
		return bankAcctNo;
	}
	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = StringUtils.isBlank(bankAcctNo) ? null : bankAcctNo;
	}
	public String getBankAcctNoS() {
		return bankAcctNoS;
	}
	public void setBankAcctNoS(String bankAcctNoS) {
		this.bankAcctNoS = StringUtils.isBlank(bankAcctNoS) ? null : bankAcctNoS;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = StringUtils.isBlank(busNo) ? null : busNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = StringUtils.isBlank(state) ? null : state;
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
		this.userId = StringUtils.isBlank(userId) ? null : userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = StringUtils.isBlank(userName) ? null : userName;
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
	
	public String getProvisionsAcctNo() {
		return provisionsAcctNo;
	}
	public void setProvisionsAcctNo(String provisionsAcctNo) {
		this.provisionsAcctNo = provisionsAcctNo;
	}
	public List<TranCoreCashWithDrawApplyOrderBean> getTranCoreCashWithDrawApplyOrderList() {
		return tranCoreCashWithDrawApplyOrderList;
	}
	public void setTranCoreCashWithDrawApplyOrderList(
			List<TranCoreCashWithDrawApplyOrderBean> tranCoreCashWithDrawApplyOrderList) {
		this.tranCoreCashWithDrawApplyOrderList = tranCoreCashWithDrawApplyOrderList;
	}
}
