package com.jst.prodution.lanefront.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.lanefront.listbean.RouterChannelChildlistBean;

public class RouterChannelChildBean extends BaseBean {
	private static final long serialVersionUID = 1L;

    private String channelCodeChild;

    private String channelDesc;

    private String parentId;

    private String priorityPoint;

    private String bankcardType;

    private Integer singleAmountMax;

    private String smsFlag;

	private Integer tranAmount;

    private String remark;

    private String flag;
    
    private String state;

    private List<RouterChannelChildlistBean> routerChannelChildBeanList;

    public String getChannelCodeChild() {
        return channelCodeChild;
    }

    public void setChannelCodeChild(String channelCodeChild) {
        this.channelCodeChild = channelCodeChild == null ? null : channelCodeChild.trim();
    }

    public String getChannelDesc() {
        return channelDesc;
    }

    public void setChannelDesc(String channelDesc) {
        this.channelDesc = channelDesc == null ? null : channelDesc.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getPriorityPoint() {
        return priorityPoint;
    }

    public void setPriorityPoint(String priorityPoint) {
        this.priorityPoint = priorityPoint == null ? null : priorityPoint.trim();
    }

    public String getBankcardType() {
        return bankcardType;
    }

    public void setBankcardType(String bankcardType) {
        this.bankcardType = bankcardType == null ? null : bankcardType.trim();
    }

    public Integer getSingleAmountMax() {
        return singleAmountMax;
    }

    public void setSingleAmountMax(Integer singleAmountMax) {
        this.singleAmountMax = singleAmountMax;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<RouterChannelChildlistBean> getRouterChannelChildBeanList() {
		return routerChannelChildBeanList;
	}

	public void setRouterChannelChildBeanList(List<RouterChannelChildlistBean> routerChannelChildBeanList) {
		this.routerChannelChildBeanList = routerChannelChildBeanList;
	}

	public Integer getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(Integer tranAmount) {
		this.tranAmount = tranAmount;
	}
    
}