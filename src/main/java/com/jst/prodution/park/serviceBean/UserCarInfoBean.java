package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class UserCarInfoBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String userId;
	
	private String carNo;
	
	private String ifHold;
	
	private String opType;
	
	private String vin;
	
	private String engineNo;
	

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

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getIfHold() {
		return ifHold;
	}

	public void setIfHold(String ifHold) {
		this.ifHold = ifHold;
	}

	public String getOpType() {
		return opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	
	
	
}
