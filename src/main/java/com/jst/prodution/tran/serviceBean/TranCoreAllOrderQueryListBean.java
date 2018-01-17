package com.jst.prodution.tran.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
* @ClassName: TranCoreOrderQueryListBean 
* @Description: TODO(查询所有订单[充值、消费、退款]) 
* @author zcb 
* @date 2018年1月4日 上午9:32:08 
*
 */
public class TranCoreAllOrderQueryListBean extends BaseBean{

	private static final long serialVersionUID = 1L;
		
	/********************************充值入参********************************/
	private String rechargeStates;//充值状态 (0-成功，1-待处理，2-处理中，3-失败)
	
	
	/********************************消费参数********************************/
	private String[] payStates;//消费状态( 0-成功，1-支付中，3-代扣失败，5-订单已关闭)
	private String[] busTypes;//1-支付，2-退款，3-代扣 ，4-扫码支付，5-主动还款
	
	
	/********************************退款入参********************************/
	private String refundStates;//退款状态(00：退款成功，01退款中，02退款失败)
	
	
	/********************************公共出参********************************/
	private String userId;//会员号
	
	private String orderType;  //订单类型  01：充值 ，02：消费，03：退款      10 全部  必填

    private String orderName;  //订单名称

    private String tranAmount;  //交易金额

    private String tranTime;  //交易时间

    private String state ; //订单状态
    
    private String token ; //token名称
    
    private String busNo ; //交易流水

    private String merchantIds ; //(消费订单)商户号，多个用","隔开
 
    private String merchantId ; //商户号
	
    
	/********************************返回集合********************************/
	private List<TranCoreAllOrderQueryListBean> tranCoreAllOrderQueryList;  //账单列表
	
	
	public String getRechargeStates() {
		return rechargeStates;
	}
	public void setRechargeStates(String rechargeStates) {
		this.rechargeStates = rechargeStates;
	}
	public String getRefundStates() {
		return refundStates;
	}
	public void setRefundStates(String refundStates) {
		this.refundStates = refundStates;
	}
	public String[] getPayStates() {
		return payStates;
	}
	public void setPayStates(String[] payStates) {
		this.payStates = payStates;
	}
	public String[] getBusTypes() {
		return busTypes;
	}
	public void setBusTypes(String[] busTypes) {
		this.busTypes = busTypes;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(String tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getTranTime() {
		return tranTime;
	}
	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getMerchantIds() {
		return merchantIds;
	}
	public void setMerchantIds(String merchantIds) {
		this.merchantIds = merchantIds;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public List<TranCoreAllOrderQueryListBean> getTranCoreAllOrderQueryList() {
		return tranCoreAllOrderQueryList;
	}
	public void setTranCoreAllOrderQueryList(List<TranCoreAllOrderQueryListBean> tranCoreAllOrderQueryList) {
		this.tranCoreAllOrderQueryList = tranCoreAllOrderQueryList;
	}
	
}
