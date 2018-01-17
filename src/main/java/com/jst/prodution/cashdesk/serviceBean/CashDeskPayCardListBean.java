package com.jst.prodution.cashdesk.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.cashdesk.listBean.CashDeskPayCardBean;

public class CashDeskPayCardListBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String userId;// 会员标识
	private String merchantId;// 商户标识
	private String sceneCode;// 场景码
	private List<CashDeskPayCardBean> cashDeskPayCardList;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getSceneCode() {
		return sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public List<CashDeskPayCardBean> getCashDeskPayCardList() {
		return cashDeskPayCardList;
	}
	public void setCashDeskPayCardList(List<CashDeskPayCardBean> cashDeskPayCardList) {
		this.cashDeskPayCardList = cashDeskPayCardList;
	}
}
