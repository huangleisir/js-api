package com.jst.prodution.paycore.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 *@description:支付核心发起支付bean
 *@author  widon
 *@date: 2017年10月12日 下午5:30:42
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class PayCoreUpayPayOrderQueryListBean extends BaseBean {
	
	
	private static final long serialVersionUID = 1L;

	private String payNo;

    private String busNo;

    private String orderId;

    private String jstAppId;

    private String jstMchId;

    private String userId;

    private String subject;

    private String description;

    private String externTransactionId;

    private Long totalAmount;

    private Integer orderState;

    private Date paySuccessTime;

    private String payChannelId;

    private String payType;

    private String orderType;

    private String otherDetails;

    private Date expireTime;

    private Date createTime;

    private Date updateTime;

    private List<PayCoreUpayPayOrderQueryListBean> payCoreUpayPayOrderQueryList;

    
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

    public Date getPaySuccessTime() {
		return paySuccessTime;
	}

	public void setPaySuccessTime(Date paySuccessTime) {
		this.paySuccessTime = paySuccessTime;
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternTransactionId() {
        return externTransactionId;
    }

    public void setExternTransactionId(String externTransactionId) {
        this.externTransactionId = externTransactionId;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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

	public List<PayCoreUpayPayOrderQueryListBean> getPayCoreUpayPayOrderQueryList() {
		return payCoreUpayPayOrderQueryList;
	}

	public void setPayCoreUpayPayOrderQueryList(List<PayCoreUpayPayOrderQueryListBean> payCoreUpayPayOrderQueryList) {
		this.payCoreUpayPayOrderQueryList = payCoreUpayPayOrderQueryList;
	}
}
