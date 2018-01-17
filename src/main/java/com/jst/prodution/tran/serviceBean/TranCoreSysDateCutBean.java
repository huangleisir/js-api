package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreSysDateCutBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	private String optType;//操作类型:0-查询,1-更新
	private int cutId;//主键(自增)
	private Integer cutDate;//日切时间(格式:yyyyMMdd)
	private Integer lastDate;//上一日切(格式:yyyyMMdd)
	private String updateUser;//操作人
	public String getOptType() {
		return optType;
	}
	public void setOptType(String optType) {
		this.optType = optType;
	}
	public int getCutId() {
		return cutId;
	}
	public void setCutId(int cutId) {
		this.cutId = cutId;
	}
	public Integer getLastDate() {
		return lastDate;
	}
	public void setLastDate(Integer lastDate) {
		this.lastDate = lastDate;
	}
	public Integer getCutDate() {
		return cutDate;
	}
	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
}
