package com.jst.prodution.tran.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 充退订单查询bean
 * @author 汤广海
 *
 */

public class TranCoreRefundRechargeOrderQueryListBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String busNo;//交易流水号
	 private String originBusNo;
    private String state;//退款状态(00：退款成功，01退款中，02退款失败)
    private Long refundAmount;//退款金额
    private String payType;//微信支付模式：APP、JSAPI、NATIVE 捷易付支付模式：H5
    private String rechargeWay;//充值方式：03-微信，04-支付宝，05-捷易付(银行卡)
    private Date refundDate;//退款日期
    private String refundLaneNo;//退款流水号
    private String bankCardNo;//银行卡
    private String sourceFrom;//业务来源 1-APP，2-OMS
    private String acctId;//账户号
    private String userId;//用户号
    private String userName;//用户名称
    private String acctType;//账户类型
    private String remark;//备注
    private String createUser;//创建人 （系统默认“99”，其它为运营人员ID号）
    private String updateUser;//最后更新人
    private Date createTime;
    private Date updateTime;
    private String approveDescription;//审批描述
    private Integer approveStatus;//0-通过,1-待审核,2-不通过
    private String frozenId;
    private List<TranCoreRefundRechargeOrderQueryListBean> tranCoreRefundRechargeOrderList;
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getOriginBusNo() {
		return originBusNo;
	}
	public void setOriginBusNo(String originBusNo) {
		this.originBusNo = originBusNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getRechargeWay() {
		return rechargeWay;
	}
	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}
	public Date getRefundDate() {
		return refundDate;
	}
	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}
	public String getRefundLaneNo() {
		return refundLaneNo;
	}
	public void setRefundLaneNo(String refundLaneNo) {
		this.refundLaneNo = refundLaneNo;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
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
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
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
	public String getApproveDescription() {
		return approveDescription;
	}
	public void setApproveDescription(String approveDescription) {
		this.approveDescription = approveDescription;
	}
	public Integer getApproveStatus() {
		return approveStatus;
	}
	public void setApproveStatus(Integer approveStatus) {
		this.approveStatus = approveStatus;
	}
	public String getFrozenId() {
		return frozenId;
	}
	public void setFrozenId(String frozenId) {
		this.frozenId = frozenId;
	}
	public List<TranCoreRefundRechargeOrderQueryListBean> getTranCoreRefundRechargeOrderList() {
		return tranCoreRefundRechargeOrderList;
	}
	public void setTranCoreRefundRechargeOrderList(
			List<TranCoreRefundRechargeOrderQueryListBean> tranCoreRefundRechargeOrderList) {
		this.tranCoreRefundRechargeOrderList = tranCoreRefundRechargeOrderList;
	}
    
}
