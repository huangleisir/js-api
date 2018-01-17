package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.listbean.AssetBean;

/**
 * 用户资产查询
 * @author Administrator
 *
 */
public class UserAssetsInfoBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String userId;					//会员ID
	private String assetFlag;				//(四位数字[0、1])第一位是余额，第二位是借记卡，第三位是贷记卡，第四位是捷顺通卡（1代表需要查询，0代表不需要查询）
	private List<AssetBean> assetList;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAssetFlag() {
		return assetFlag;
	}
	public void setAssetFlag(String assetFlag) {
		this.assetFlag = assetFlag;
	}
	public List<AssetBean> getAssetList() {
		return assetList;
	}
	public void setAssetList(List<AssetBean> assetList) {
		this.assetList = assetList;
	}
}
