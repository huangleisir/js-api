package com.jst.prodution.movedata.model;

import java.io.Serializable;

/**
 * 类名: CarInfoTb</br>
 * 作者: lin
 * 描述: 宜行扬州老用户绑定的车牌信息bean 
 * 创建时间: 2017年12月7日上午10:35:09
 * 版权及版本: Copyright(C)2017 jst版权所有
 */
public class CarInfoTb implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;  //记录编号
	private Long uin;  //老用户编号
	private String carNumber; //车牌号
	
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUin() {
		return uin;
	}
	public void setUin(Long uin) {
		this.uin = uin;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
}