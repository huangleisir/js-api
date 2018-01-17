/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class UserMonthCardBean extends BaseBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id	;//Y	Int	月卡ID	
	private String parkId	;//Y	string	车场id	
	private String parkname ;
	private String status	;//Y	Int	状态	1、正常 2、禁用 3、冻结 4、注销
	private String type ;
	private String userId ;
	private String name ;
	private String carNo	;//Y	string	车牌号	
	private String phone	;//Y	string	手机号	
	private String valtime	;//Y	string	有效期	“2014-12-31 09:55:32”
	private int remainDays	;//Y	Int	剩余天数	0-为已过期
	
	//用户删除月卡
	private String monthCardId; //月卡id
	private String carId;  //车牌id
	private Date createTime;
	
	private int increaseNum; //增加的数量
	private int reduceNum; //减少的数量
	
	private boolean isSyn;
	
	List<UserMonthCardBean> list ;


	public boolean isSyn() {
		return isSyn;
	}

	public void setSyn(boolean isSyn) {
		this.isSyn = isSyn;
	}

	public int getIncreaseNum() {
		return increaseNum;
	}

	public void setIncreaseNum(int increaseNum) {
		this.increaseNum = increaseNum;
	}

	public int getReduceNum() {
		return reduceNum;
	}

	public void setReduceNum(int reduceNum) {
		this.reduceNum = reduceNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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

	public List<UserMonthCardBean> getList() {
		return list;
	}

	public void setList(List<UserMonthCardBean> list) {
		this.list = list;
	}

	public String getParkname() {
		return parkname;
	}

	public void setParkname(String parkname) {
		this.parkname = parkname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMonthCardId() {
		return monthCardId;
	}

	public void setMonthCardId(String monthCardId) {
		this.monthCardId = monthCardId;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
