package com.jst.prodution.park.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class UnbundHistoryBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id ;
	
	private String userId ;
	
	private String oldUserId ;
	
	private String carNo ;
	
	private int ifHold ;
	
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOldUserId() {
		return oldUserId;
	}

	public void setOldUserId(String oldUserId) {
		this.oldUserId = oldUserId;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public int getIfHold() {
		return ifHold;
	}

	public void setIfHold(int ifHold) {
		this.ifHold = ifHold;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
