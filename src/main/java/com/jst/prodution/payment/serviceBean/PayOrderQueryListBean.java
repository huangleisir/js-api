package com.jst.prodution.payment.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.payment.model.PayOrder;

/**
 * 付款中心付款订单查询
 * @author Administrator
 *
 */
public class PayOrderQueryListBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String tranOrderNo;				//交易核心订单号
	private String payType;					//出款类型：01-个人提现 02-商户提现 03-理财回款 04-信贷放款 05-人工出款  06-收入出款 07-其他出款
	private String payStyle;				//打款方式：01系统 02手工
	private String processState;			//处理状态：01待审核 02待付款 03付款失败 04付款成功 05一审通过 06一审不通过  07二审不通过 08付款中
	private String merchantId;				//商户号
	private String jstMerchantId;			//捷顺通商户号
	private String userId;					//会员ID
	private String userName;				//会员名称
	private String userType;				//会员类型
	private String bankBusNo;				//银行受理流水号
	private String reviewState;				//审核状态：01一审 02二审 03不审
	private String payOrderId;				//付款订单ID
	private String queryType;				//查询状态：all全量查询
	
	private Long amountSum;                     // 付款金额汇总
	
	private List<PayOrder> orderList;		//订单列表
	
	/**
     * @return the merchantId
     */
    public String getMerchantId() {
        return merchantId;
    }
    /**
     * @param merchantId the merchantId to set
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
    /**
     * @return the jstMerchantId
     */
    public String getJstMerchantId() {
        return jstMerchantId;
    }
    /**
     * @param jstMerchantId the jstMerchantId to set
     */
    public void setJstMerchantId(String jstMerchantId) {
        this.jstMerchantId = jstMerchantId;
    }
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
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayStyle() {
		return payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}
	public String getProcessState() {
		return processState;
	}
	public void setProcessState(String processState) {
		this.processState = processState;
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getBankBusNo() {
		return bankBusNo;
	}
	public void setBankBusNo(String bankBusNo) {
		this.bankBusNo = bankBusNo;
	}
	public String getReviewState() {
		return reviewState;
	}
	public void setReviewState(String reviewState) {
		this.reviewState = reviewState;
	}
	public String getPayOrderId() {
		return payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public String getQueryType() {
		return queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	public List<PayOrder> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<PayOrder> orderList) {
		this.orderList = orderList;
	}

}
