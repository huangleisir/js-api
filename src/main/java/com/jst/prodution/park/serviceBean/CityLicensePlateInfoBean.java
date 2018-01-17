package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class CityLicensePlateInfoBean extends BaseBean{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id; 
	private String province; //省
	private String city; //市
	private String parentId; //上级（父节点）市的上级
	private String lsprefix; //省的简称
	private String lsnum; //市的代表字母
	private String carorg; //省/市名称的拼音
	private String frameno; //车架号
	private String engineno; //发动机号码
	private String isDirect; //是否是直辖市 1省，2直辖市，3 市
	private List<CityLicensePlateInfoBean> list;
    
	
	public List<CityLicensePlateInfoBean> getList() {
		return list;
	}
	public void setList(List<CityLicensePlateInfoBean> list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLsprefix() {
		return lsprefix;
	}
	public void setLsprefix(String lsprefix) {
		this.lsprefix = lsprefix;
	}
	public String getLsnum() {
		return lsnum;
	}
	public void setLsnum(String lsnum) {
		this.lsnum = lsnum;
	}
	public String getCarorg() {
		return carorg;
	}
	public void setCarorg(String carorg) {
		this.carorg = carorg;
	}
	public String getFrameno() {
		return frameno;
	}
	public void setFrameno(String frameno) {
		this.frameno = frameno;
	}
	public String getEngineno() {
		return engineno;
	}
	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getIsDirect() {
		return isDirect;
	}
	public void setIsDirect(String isDirect) {
		this.isDirect = isDirect;
	}
    
}
