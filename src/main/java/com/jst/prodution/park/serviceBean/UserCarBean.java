/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class UserCarBean extends BaseBean{
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    private int id ;
	
	private String userId ;
	
	private String carNo ;
	
	private int ifHold ;
	
	private int carHold;
	
	private String vin;
	
	private String engineNo;
	
	List<UserCarBean> list ;

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

	public int getIfHold() {
		return ifHold;
	}

	public void setIfHold(int ifHold) {
		this.ifHold = ifHold;
	}

	public List<UserCarBean> getList() {
		return list;
	}

	public void setList(List<UserCarBean> list) {
		this.list = list;
	}

    public int getCarHold() {
        return carHold;
    }

    public void setCarHold(int carHold) {
        this.carHold = carHold;
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
