package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantMenuCtrl;

public class MerchantMenuCtrlBean extends BaseBean{

	private static final long serialVersionUID = 1L;

	private String ctrlId;
	private String menuId;
	private String merchantId;
	private String userId;
	private String creater;
	private String createTime;
	private String updater;
	private String updateTime;
	private String isVerify;
	private List<MerchantMenuCtrl> mCtrlList;
	private String upMerchantId;
	private String noCheckedMenuId;
	
	public String getCtrlId() {
		return ctrlId;
	}
	public void setCtrlId(String ctrlId) {
		this.ctrlId = ctrlId;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getIsVerify() {
		return isVerify;
	}
	public void setIsVerify(String isVerify) {
		this.isVerify = isVerify;
	}
	public List<MerchantMenuCtrl> getmCtrlList() {
		return mCtrlList;
	}
	public void setmCtrlList(List<MerchantMenuCtrl> mCtrlList) {
		this.mCtrlList = mCtrlList;
	}
	public String getUpMerchantId() {
		return upMerchantId;
	}
	public void setUpMerchantId(String upMerchantId) {
		this.upMerchantId = upMerchantId;
	}
	public String getNoCheckedMenuId() {
		return noCheckedMenuId;
	}
	public void setNoCheckedMenuId(String noCheckedMenuId) {
		this.noCheckedMenuId = noCheckedMenuId;
	}
	
}
