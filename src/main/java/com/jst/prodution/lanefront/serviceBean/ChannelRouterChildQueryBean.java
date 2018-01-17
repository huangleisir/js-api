/**
 * author:汤广海
 * 2016年11月1日
 * 下午3:30:24
 */
package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class ChannelRouterChildQueryBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private Long amount;
	private String channelCodeChild;
	private String channelDesc;
	private String parentId;
	private String priorityPoint;
	private String bankcardType;
	private Long singleAmountMax;
	private String smsFlag;
	private String state;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getChannelCodeChild() {
		return channelCodeChild;
	}

	public void setChannelCodeChild(String channelCodeChild) {
		this.channelCodeChild = channelCodeChild;
	}

	public String getChannelDesc() {
		return channelDesc;
	}

	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getPriorityPoint() {
		return priorityPoint;
	}

	public void setPriorityPoint(String priorityPoint) {
		this.priorityPoint = priorityPoint;
	}

	public String getBankcardType() {
		return bankcardType;
	}

	public void setBankcardType(String bankcardType) {
		this.bankcardType = bankcardType;
	}

	public Long getSingleAmountMax() {
		return singleAmountMax;
	}

	public void setSingleAmountMax(Long singleAmountMax) {
		this.singleAmountMax = singleAmountMax;
	}

	public String getSmsFlag() {
		return smsFlag;
	}

	public void setSmsFlag(String smsFlag) {
		this.smsFlag = smsFlag;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
