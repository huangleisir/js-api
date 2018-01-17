package com.jst.prodution.common.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 城市信息bean(公共元素)
 * @author 彭则华
 * 
 * */
public class CityModel implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;//城市编码
	private String name;//城市名称
	private String provinceCode;//所属城市编码
	private List<TownModel> towns;//下属县区
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public List<TownModel> getTowns() {
		return towns;
	}
	public void setTowns(List<TownModel> towns) {
		this.towns = towns;
	}
	@Override
	public String toString() {
		return "CityBean [id=" + id + ", code=" + code + ", name=" + name + ", provinceCode=" + provinceCode
				+ "]";
	}
}
