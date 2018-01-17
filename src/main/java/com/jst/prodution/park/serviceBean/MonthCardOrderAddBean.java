/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class MonthCardOrderAddBean extends BaseBean{
	
	private int id	;//Y	Int	月卡ID	
	private String parkId	;//Y	string	车场id	
	private int status	;//Y	Int	状态	1、正常 2、禁用 3、冻结 4、注销
	private String userId ;
	private String name ;
	private String carNo	;//Y	string	车牌号	
	private String phone	;//Y	string	手机号	
	private String valtime	;//Y	string	有效期	“2014-12-31 09:55:32”
	private int remainDays	;//Y	Int	剩余天数	0-为已过期
	
	List<MonthCardOrderAddBean> list ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getValtime() {
		return valtime;
	}

	public void setValtime(String valtime) {
		this.valtime = valtime;
	}

	public int getRemainDays() {
		return remainDays;
	}

	public void setRemainDays(int remainDays) {
		this.remainDays = remainDays;
	}

	public List<MonthCardOrderAddBean> getList() {
		return list;
	}

	public void setList(List<MonthCardOrderAddBean> list) {
		this.list = list;
	}


	
}
