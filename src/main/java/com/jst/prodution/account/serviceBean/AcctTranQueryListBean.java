package com.jst.prodution.account.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 账户交易明细信息查询Bean（模糊查询）
 * 
 * @author tomy
 *
 */
public class AcctTranQueryListBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String acctId; // 账户标识
	private String userId; // 会员标识
	private String acctName; // 账户名称
	private String acctType; // 账户类型(01-基本户)
	private String sourceFrom; // 业务来源 （1-APP，2-OMS
	private Long tranAmount;// 交易金额
	private String tranDec; // 交易方向 （C-存入，D-支取）
	private String busTranType; // 业务类型 （00-充值，交易核心传送）
	private String busNo; // 交易流水号 （交易核心订单流水号）
	private String payNo; // 支付流水号 (账户前置流水号)
	private String oppAcctId; // 对方账户标识
	private String oppUserId; // 对方会员标识
	private String oppAcctName; // 对方账户名称
	private String oppAcctType; // 对方账户类型 (01-基本户)
	private String operType; // 操作类型 1-正常，2-调账,3-冲正
	private String writeoffFlag; // 被冲销标志 (Y已冲销 N无冲销)
	private String linkTranId; // 关联流水号 （关联流水号）
	private String createUser; // 创建人 （系统默认“99”，其它为运营人员ID号）
	private String updateUser; // 最后更新人
	private Integer busTransDate;//交易日期
	private Long tranAmountSum;// 交易金额汇总

	private List<AcctTranDetailBean> acctTranDetailList;

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId == null || "".equals(acctId.trim()) ? null : acctId.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null || "".equals(userId.trim()) ? null : userId.trim();
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName == null || "".equals(acctName.trim()) ? null : acctName.trim();
	}

	public String getAcctType() {
		return acctType;
	}

	public Long getTranAmountSum() {
		return tranAmountSum;
	}

	public void setTranAmountSum(Long tranAmountSum) {
		this.tranAmountSum = tranAmountSum;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType == null || "".equals(acctType.trim()) ? null : acctType.trim();
	}

	public String getSourceFrom() {
		return sourceFrom;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom == null || "".equals(sourceFrom.trim()) ? null : sourceFrom.trim();
	}

	public Long getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}

	public String getTranDec() {
		return tranDec;
	}

	public void setTranDec(String tranDec) {
		this.tranDec = tranDec == null || "".equals(tranDec.trim()) ? null : tranDec.trim();
	}

	public String getBusTranType() {
		return busTranType;
	}

	public void setBusTranType(String busTranType) {
		this.busTranType = busTranType == null || "".equals(busTranType.trim()) ? null : busTranType.trim();
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo == null || "".equals(busNo.trim()) ? null : busNo.trim();
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo == null || "".equals(payNo.trim()) ? null : payNo.trim();
	}

	public String getOppAcctId() {
		return oppAcctId;
	}

	public void setOppAcctId(String oppAcctId) {
		this.oppAcctId = oppAcctId == null || "".equals(oppAcctId.trim()) ? null : oppAcctId.trim();
	}

	public String getOppUserId() {
		return oppUserId;
	}

	public void setOppUserId(String oppUserId) {
		this.oppUserId = oppUserId == null || "".equals(oppUserId.trim()) ? null : oppUserId.trim();
	}

	public String getOppAcctName() {
		return oppAcctName;
	}

	public void setOppAcctName(String oppAcctName) {
		this.oppAcctName = oppAcctName == null || "".equals(oppAcctName.trim()) ? null : oppAcctName.trim();
	}

	public String getOppAcctType() {
		return oppAcctType;
	}

	public void setOppAcctType(String oppAcctType) {
		this.oppAcctType = oppAcctType == null || "".equals(oppAcctType.trim()) ? null : oppAcctType.trim();
	}

	public String getOperType() {
		return operType;
	}

	public void setOperType(String operType) {
		this.operType = operType == null || "".equals(operType.trim()) ? null : operType.trim();
	}

	public String getWriteoffFlag() {
		return writeoffFlag;
	}

	public void setWriteoffFlag(String writeoffFlag) {
		this.writeoffFlag = writeoffFlag == null || "".equals(writeoffFlag.trim()) ? null : writeoffFlag.trim();
	}

	public String getLinkTranId() {
		return linkTranId;
	}

	public void setLinkTranId(String linkTranId) {
		this.linkTranId = linkTranId == null || "".equals(linkTranId.trim()) ? null : linkTranId.trim();
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser == null || "".equals(createUser.trim()) ? null : createUser.trim();
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null || "".equals(updateUser.trim()) ? null : updateUser.trim();
	}

	public List<AcctTranDetailBean> getAcctTranDetailList() {
		return acctTranDetailList;
	}

	public void setAcctTranDetailList(List<AcctTranDetailBean> acctTranDetailList) {
		this.acctTranDetailList = acctTranDetailList;
	}

	public Integer getBusTransDate() {
		return busTransDate;
	}

	public void setBusTransDate(Integer busTransDate) {
		this.busTransDate = busTransDate;
	}
	
}
