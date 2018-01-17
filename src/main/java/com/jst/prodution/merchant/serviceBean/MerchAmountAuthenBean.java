package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class MerchAmountAuthenBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String listId;			//清单ID
	private Integer times;			//总错误次数
	private Integer errorTimes;		//剩余错误次数
	private Integer amount;			//回填金额
	private boolean isSuccess;		//认证是否成功
	public String getListId() {
		return listId;
	}
	public void setListId(String listId) {
		this.listId = listId;
	}
	public Integer getTimes() {
		return times;
	}
	public void setTimes(Integer times) {
		this.times = times;
	}
	public Integer getErrorTimes() {
		return errorTimes;
	}
	public void setErrorTimes(Integer errorTimes) {
		this.errorTimes = errorTimes;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}
