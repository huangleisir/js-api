package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantMenu;

public class MerchantMenuBean extends BaseBean{

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String url;
	private String pId;
	private String rank;
	private String createTime;
	private String merchantId;
	private String upMerchantId;
	private List<MerchantMenu> merchantMenuList;
	private String position;
	

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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getUpMerchantId() {
		return upMerchantId;
	}
	public void setUpMerchantId(String upMerchantId) {
		this.upMerchantId = upMerchantId;
	}
	public List<MerchantMenu> getMerchantMenuList() {
		return merchantMenuList;
	}
	public void setMerchantMenuList(List<MerchantMenu> merchantMenuList) {
		this.merchantMenuList = merchantMenuList;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
