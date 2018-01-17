package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 类名: DrivingLicenseInfoBean</br>
 * 作者: linyuanq
 * 描述: 行驶证信息bean 
 * 创建时间: 2017年4月19日下午3:15:21
 * 版权及版本: Copyright(C)2017 jst版权所有
 */
public class DrivingLicenseInfoBean extends BaseBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id; 
	private String plateNo; //车牌号
	private String vehicleType; //车辆类型
	private String owner; //车辆所有人
	private String userId; //
	private String imgUrl; //上传证件图片的地址
	private String address; //地址
	private String model; //车辆品牌型号
	private String useCharacter; //使用性质
	private String vin; //车辆识别代号（车架号）
	private String engineNo; //发动机号码
	private String registerDate; //注册日期
	private String issueDate; //发证日期
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getUseCharacter() {
		return useCharacter;
	}
	public void setUseCharacter(String useCharacter) {
		this.useCharacter = useCharacter;
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
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
}
