package com.jst.prodution.paycore.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
* @ClassName: PayCorePayOrderQueryListBean 
* @Description: TODO(支付核心支付订单实体Bean) 
* @author 曾传保 
* @date 2017年12月20日 上午11:25:46 
*
 */
public class PayCorePayOrderQueryListBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	
	private String payNo;				//支付流水号
	private String busNo;				//交易流水号
	private String orderId;				//商户订单号
	private String jstAppId;			//商户应用appid
	private String jstMchId;			//商户号
	private String payChannelId;		//支付渠道
	private String yfkMchId;			//预付卡商户号
	private String termId;				//终端号
	private String termFlag;			//预付卡终端标识
	private Long tranAmount;				//交易金额(单位 分)
	private String userId;				//会员号
	private String orderState;			//订单状态
	private String orderType;			//订单类型：1-支付，2-退款，3-代扣 ，4-扫码支付，5-主动还款，6. 充值
	private String mobile;				//预留手机号
	private String bankCardNo;			//卡号，银行卡号，预付卡号
	private String externTransactionId;	//外部流水号
	private String remark;				//备注
	private String createTime;			//创建时间
	private String createUser;			//创建人	
	private String updateTime;			//更新人
	private String updateUser;			//更新时间
	private List<PayCorePayOrderQueryListBean> payCorePayOrderList;
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getJstAppId() {
		return jstAppId;
	}
	public void setJstAppId(String jstAppId) {
		this.jstAppId = jstAppId;
	}
	public String getJstMchId() {
		return jstMchId;
	}
	public void setJstMchId(String jstMchId) {
		this.jstMchId = jstMchId;
	}
	public String getPayChannelId() {
		return payChannelId;
	}
	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
	public String getYfkMchId() {
		return yfkMchId;
	}
	public void setYfkMchId(String yfkMchId) {
		this.yfkMchId = yfkMchId;
	}
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}
	public String getTermFlag() {
		return termFlag;
	}
	public void setTermFlag(String termFlag) {
		this.termFlag = termFlag;
	}
	public Long getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getExternTransactionId() {
		return externTransactionId;
	}
	public void setExternTransactionId(String externTransactionId) {
		this.externTransactionId = externTransactionId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public List<PayCorePayOrderQueryListBean> getPayCorePayOrderList() {
		return payCorePayOrderList;
	}
	public void setPayCorePayOrderList(List<PayCorePayOrderQueryListBean> payCorePayOrderList) {
		this.payCorePayOrderList = payCorePayOrderList;
	}
}
