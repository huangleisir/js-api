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
public class PayCoreQmPayOrderQueryListBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String payNo;

    private String busNo;

    private String orderId;

    private String jstAppId;

    private String jstMchId;

    private String channelCode;
    
    private String channelId;

    private Long tranAmout;

    private String userId;

    private String userName;

    private String mobile;

    private String bankCardNo;

    private Integer orderState;
    
    private Date paySuccessTime;

    private String orderType;

    private String smsFlag;

    private String remark;

    private String refNumber;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    private List<PayCoreQmPayOrderQueryListBean> payCoreQmPayOrderQueryList;

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

	public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public Long getTranAmout() {
        return tranAmout;
    }

    public void setTranAmout(Long tranAmout) {
        this.tranAmout = tranAmout;
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

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getSmsFlag() {
        return smsFlag;
    }

    public void setSmsFlag(String smsFlag) {
        this.smsFlag = smsFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
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

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
    
	public List<PayCoreQmPayOrderQueryListBean> getPayCoreQmPayOrderQueryList() {
		return payCoreQmPayOrderQueryList;
	}

	public void setPayCoreQmPayOrderQueryList(List<PayCoreQmPayOrderQueryListBean> payCoreQmPayOrderQueryList) {
		this.payCoreQmPayOrderQueryList = payCoreQmPayOrderQueryList;
	}
    
}
