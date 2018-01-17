package com.jst.prodution.tobank.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.tobank.model.PayApplyOrder;

/**
 * 转账订单查询bean
 * @author Administrator
 *
 */
public class TransferOrderListBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String tranOrderNo;				//交易核心订单号
	private String payOrderNo;				//付款中心订单号
	private String userId;					//收款会员号
	private String payCardNo;				//付款账号
	private String receiveCardNo;			//收款账户号
	private String payState;				//划款状态：00未划款 01划款中  02划款成功 03划款失败
	private String checkFlag;				//对账标识（Y已对账 N 未对账）
	private String payType;					//付款类型：01-个人提现 02-商户提现 03-理财回款 04-信贷放款 05-人工出款  06-收入出款 07-其他出款
	private String userType;				//收款会员类型:C个人  B商户
	private Long amountSum;					//金额汇总

	private List<PayApplyOrder> orderList;
	
	public Long getAmountSum() {
		return amountSum;
	}
	public void setAmountSum(Long amountSum) {
		this.amountSum = amountSum;
	}
	public String getTranOrderNo() {
		return tranOrderNo;
	}
	public void setTranOrderNo(String tranOrderNo) {
		this.tranOrderNo = tranOrderNo;
	}
	public String getPayOrderNo() {
		return payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPayCardNo() {
		return payCardNo;
	}
	public void setPayCardNo(String payCardNo) {
		this.payCardNo = payCardNo;
	}
	public String getReceiveCardNo() {
		return receiveCardNo;
	}
	public void setReceiveCardNo(String receiveCardNo) {
		this.receiveCardNo = receiveCardNo;
	}
	public String getPayState() {
		return payState;
	}
	public void setPayState(String payState) {
		this.payState = payState;
	}
	public String getCheckFlag() {
		return checkFlag;
	}
	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}
	public List<PayApplyOrder> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<PayApplyOrder> orderList) {
		this.orderList = orderList;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
