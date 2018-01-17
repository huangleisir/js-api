package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class CloudOfflineBean extends BaseBean {
	
	String merchantId;
	String userId;
	String jstMerchantId;
	String orderType;//订单类型
	String orderNo;
	String cardNo;
	String payType;//付款方式
	String tranState;//交易类型
	String tranAmountSum;//实收金额
	String needAmountSum;//应收金额
	String disCountAmtSum;//优惠金额
	List<CloudOfflineRecordBean> cloudOfflineRecordBeanList;
	
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getJstMerchantId() {
		return jstMerchantId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setJstMerchantId(String jstMerchantId) {
		this.jstMerchantId = jstMerchantId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getTranAmountSum() {
		return tranAmountSum;
	}
	public void setTranAmountSum(String tranAmountSum) {
		this.tranAmountSum = tranAmountSum;
	}
	public String getNeedAmountSum() {
		return needAmountSum;
	}
	public void setNeedAmountSum(String needAmountSum) {
		this.needAmountSum = needAmountSum;
	}
	public String getDisCountAmtSum() {
		return disCountAmtSum;
	}
	public void setDisCountAmtSum(String disCountAmtSum) {
		this.disCountAmtSum = disCountAmtSum;
	}
	public List<CloudOfflineRecordBean> getCloudOfflineRecordBeanList() {
		return cloudOfflineRecordBeanList;
	}
	public String getTranState() {
		return tranState;
	}
	public void setTranState(String tranState) {
		this.tranState = tranState;
	}
	public void setCloudOfflineRecordBeanList(List<CloudOfflineRecordBean> cloudOfflineRecordBeanList) {
		this.cloudOfflineRecordBeanList = cloudOfflineRecordBeanList;
	}
    @Override
    public String toString() {
        return "CloudOfflineBean [merchantId=" + merchantId + ", userId=" + userId + ", jstMerchantId=" + jstMerchantId
                + ", orderType=" + orderType + ", orderNo=" + orderNo + ", cardNo=" + cardNo + ", payType=" + payType
                + ", tranState=" + tranState + ", tranAmountSum=" + tranAmountSum + ", needAmountSum=" + needAmountSum
                + ", disCountAmtSum=" + disCountAmtSum + ", cloudOfflineRecordBeanList=" + cloudOfflineRecordBeanList
                + "]";
    }
	
}
