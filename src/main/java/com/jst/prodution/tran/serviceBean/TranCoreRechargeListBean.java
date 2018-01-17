package com.jst.prodution.tran.serviceBean;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreRechargeListBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String busNo;// 交易流水号
	private String state; // 状态 0-成功，1-待处理，2-处理中，3-失败
	private String tranAmout;// 金额
	private String tranFee;// 手续费
	private String acctId;// 账户号
	private String userId;// 用户号
	private String userName;// 用户名称
	private String callType;// 订单调账方式 1-补单，2-销单,0-正常
	private String remark;// 备注
	private String createUser;// 创建人
	private String updateUser;// 最后更新人
	private String createTime;// 新增时间
	private String updateTime;// 最后更新时间
	private String isByPage;// 是否分页 Y , N
	private String rechargeWay;// 充值方式：03-微信，04-支付宝，05-捷易付(银行卡)
	private Long tranAmoutSum;// 交易金额汇总
    private Long tranFeeSum;//订单手续费汇总
    private String payLaneNo;//支付流水号

	List<TranCoreRechargeOrderBean> tranCoreRechargeOrderListBean;

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

	public Long getTranAmoutSum() {
		return tranAmoutSum;
	}

	public void setTranAmoutSum(Long tranAmoutSum) {
		this.tranAmoutSum = tranAmoutSum;
	}

	public Long getTranFeeSum() {
		return tranFeeSum;
	}

	public void setTranFeeSum(Long tranFeeSum) {
		this.tranFeeSum = tranFeeSum;
	}

	public String getTranAmout() {
		return tranAmout;
	}

	public void setTranAmout(String tranAmout) {
		this.tranAmout = StringUtils.isBlank(tranAmout) ? null : tranAmout;
	}

	public String getTranFee() {
		return tranFee;
	}

	public void setTranFee(String tranFee) {
		this.tranFee = tranFee;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = StringUtils.isBlank(acctId) ? null : acctId;
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
		this.callType = StringUtils.isBlank(callType) ? null : callType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = StringUtils.isBlank(remark) ? null : remark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = StringUtils.isBlank(createUser) ? null : createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = StringUtils.isBlank(updateUser) ? null : updateUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = StringUtils.isBlank(createTime) ? null : createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = StringUtils.isBlank(updateTime) ? null : updateTime;
	}
	
	public String getIsByPage() {
		return isByPage;
	}

	public void setIsByPage(String isByPage) {
		this.isByPage = isByPage;
	}

	public String getRechargeWay() {
		return rechargeWay;
	}

	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}
	
	public String getPayLaneNo() {
		return payLaneNo;
	}

	public void setPayLaneNo(String payLaneNo) {
		this.payLaneNo = payLaneNo;
	}

	public List<TranCoreRechargeOrderBean> getTranCoreRechargeOrderListBean() {
		return tranCoreRechargeOrderListBean;
	}

	public void setTranCoreRechargeOrderListBean(List<TranCoreRechargeOrderBean> tranCoreRechargeOrderListBean) {
		this.tranCoreRechargeOrderListBean = tranCoreRechargeOrderListBean;
	}

}
