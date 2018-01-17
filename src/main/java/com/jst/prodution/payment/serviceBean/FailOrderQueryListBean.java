package com.jst.prodution.payment.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.payment.model.FailOrder;

/**
 * 付款失败记录查询bean
 * @author Administrator
 *
 */
public class FailOrderQueryListBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String orderNo;					//付款订单ID
	private String tranOrderNo;				//交易核心流水号
	private String merchantId;				//商户号
	private String jstMerchantId;			//捷顺通商户号
	private String userId;					//会员ID
	private String userName;				//会员名称
	private String userType;				//会员类型
	private List<FailOrder> orderList;		//订单列表
	private Long amountSum;//提现金额（分）汇总

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getJstMerchantId() {
		return jstMerchantId;
	}

	public void setJstMerchantId(String jstMerchantId) {
		this.jstMerchantId = jstMerchantId;
	}

	public Long getAmountSum() {
		return amountSum;
	}
	public void setAmountSum(Long amountSum) {
		this.amountSum = amountSum;
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTranOrderNo() {
		return tranOrderNo;
	}
	public void setTranOrderNo(String tranOrderNo) {
		this.tranOrderNo = tranOrderNo;
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
	public List<FailOrder> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<FailOrder> orderList) {
		this.orderList = orderList;
	}

}
