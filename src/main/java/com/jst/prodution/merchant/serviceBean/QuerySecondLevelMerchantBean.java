package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantBase;
import com.jst.prodution.merchant.model.MerchantPayConf;

public class QuerySecondLevelMerchantBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String userId;								//商户ID（B会员ID）
	
	private String merchantId;							//商户号
	
	private List<MerchantBase> merchantBase;			//商户列表
	
	private QuerySingleMerchantBean querySingleMerchantBean;
	
	
	private List<MerchantPayConf> merchantPayConfList;         //支付权限-----
	
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
	public List<MerchantBase> getMerchantBase() {
		return merchantBase;
	}
	public void setMerchantBase(List<MerchantBase> merchantBase) {
		this.merchantBase = merchantBase;
	}
	public List<MerchantPayConf> getMerchantPayConfList() {
		return merchantPayConfList;
	}
	public void setMerchantPayConfList(List<MerchantPayConf> merchantPayConfList) {
		this.merchantPayConfList = merchantPayConfList;
	}
	public QuerySingleMerchantBean getQuerySingleMerchantBean() {
		return querySingleMerchantBean;
	}
	public void setQuerySingleMerchantBean(QuerySingleMerchantBean querySingleMerchantBean) {
		this.querySingleMerchantBean = querySingleMerchantBean;
	}
	
}
