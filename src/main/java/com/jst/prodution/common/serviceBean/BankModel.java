package com.jst.prodution.common.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 银行信息bean(公共元素)
 * @author 彭则华
 * 
 * */
public class BankModel implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String id;//序号
	private String name;//银行名称
	private String abbreviation;//简称
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
}
