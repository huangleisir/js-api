package com.jst.prodution.lanefront.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.lanefront.listbean.RouterChannellistBean;

public class RouterChannelBean extends BaseBean{
	private static final long serialVersionUID = 1L;

    private String channelCode;

    private String channelDesc;

    private String priorityPoint;

    private String bankList;

    private String smsFlag;

    private String state;

    private String remark;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    private String flag;
    
    private List<RouterChannellistBean> routerChannelBeanList;
    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getChannelDesc() {
        return channelDesc;
    }

    public void setChannelDesc(String channelDesc) {
        this.channelDesc = channelDesc == null ? null : channelDesc.trim();
    }

    public String getPriorityPoint() {
        return priorityPoint;
    }

    public void setPriorityPoint(String priorityPoint) {
        this.priorityPoint = priorityPoint == null ? null : priorityPoint.trim();
    }

    public String getBankList() {
        return bankList;
    }

    public void setBankList(String bankList) {
        this.bankList = bankList == null ? null : bankList.trim();
    }

    public String getSmsFlag() {
        return smsFlag;
    }

    public void setSmsFlag(String smsFlag) {
        this.smsFlag = smsFlag == null ? null : smsFlag.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<RouterChannellistBean> getRouterChannelBeanList() {
		return routerChannelBeanList;
	}

	public void setRouterChannelBeanList(List<RouterChannellistBean> routerChannelBeanList) {
		this.routerChannelBeanList = routerChannelBeanList;
	}


}