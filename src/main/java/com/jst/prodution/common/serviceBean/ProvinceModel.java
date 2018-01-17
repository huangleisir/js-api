package com.jst.prodution.common.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 省份信息bean(公共元素)
 * @author 彭则华
 *
 */
public class ProvinceModel  implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String id;//
	private String code;//省份编码
	private String name;//省份名称
	private List<CityModel> citys;//下属市区
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
	public List<CityModel> getCitys() {
		return citys;
	}
	public void setCitys(List<CityModel> citys) {
		this.citys = citys;
	}
	@Override
	public String toString() {
		return "ProvinceBean [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
	
}
