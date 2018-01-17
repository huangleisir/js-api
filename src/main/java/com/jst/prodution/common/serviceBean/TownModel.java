package com.jst.prodution.common.serviceBean;


import com.jst.prodution.base.bean.BaseBean;

/**
 * 区县信息bean(公共元素)
 * @author 彭则华
 * */
public class TownModel implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;//区县编码
	private String name;//区县名称
	private String cityCode;//所属城市编码
	
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
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	@Override
	public String toString() {
		return "TownBean [id=" + id + ", code=" + code + ", name=" + name + ", cityCode=" + cityCode + "]";
	}
}
