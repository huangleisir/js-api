package com.jst.prodution.acctfront.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class AcctFrontCollectionQueryListBean extends BaseBean {
    private String payNo;

    private String busNo;

    private String acctId;

    private String acctName;

    private String acctType;

    private String userId;

    private String collectionAcct;

    private String channelCode;

    private String channelName;

    private Long tranAmount;

    private Integer busTransDate;

    private String busTranType;

    private String sourceFrom;

    private String orderStatus;

    private String writeoffFlag;

    private String remark;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    private String channelNo;

    private String bankcardNo;

    private Integer cutDate;

	private List<AcctFrontCollectionQueryListBean> acctFrontCollectionBeanList;

    private static final long serialVersionUID = 1L;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo == null ? null : busNo.trim();
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId == null ? null : acctId.trim();
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCollectionAcct() {
        return collectionAcct;
    }

    public void setCollectionAcct(String collectionAcct) {
        this.collectionAcct = collectionAcct == null ? null : collectionAcct.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    public Integer getBusTransDate() {
        return busTransDate;
    }

    public void setBusTransDate(Integer busTransDate) {
        this.busTransDate = busTransDate;
    }

    public String getBusTranType() {
        return busTranType;
    }

    public void setBusTranType(String busTranType) {
        this.busTranType = busTranType == null ? null : busTranType.trim();
    }

    public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getWriteoffFlag() {
        return writeoffFlag;
    }

    public void setWriteoffFlag(String writeoffFlag) {
        this.writeoffFlag = writeoffFlag == null ? null : writeoffFlag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
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

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo == null ? null : channelNo.trim();
    }

    public String getBankcardNo() {
        return bankcardNo;
    }

    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo == null ? null : bankcardNo.trim();
    }

    public Integer getCutDate() {
        return cutDate;
    }

    public void setCutDate(Integer cutDate) {
        this.cutDate = cutDate;
    }

	public List<AcctFrontCollectionQueryListBean> getAcctFrontCollectionBeanList() {
		return acctFrontCollectionBeanList;
	}

	public void setAcctFrontCollectionBeanList(List<AcctFrontCollectionQueryListBean> acctFrontCollectionBeanList) {
		this.acctFrontCollectionBeanList = acctFrontCollectionBeanList;
	}
    
    
}
