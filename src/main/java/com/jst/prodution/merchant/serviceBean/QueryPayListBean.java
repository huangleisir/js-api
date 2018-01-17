package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantPayList;

/**
 * 查询打款清单列表bean
 * @author 吴安辉
 *
 */
public class QueryPayListBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String userId;						//商户ID
	private String merchantId;					//商户商务号
	private String merchName;					//商户名称（收款人名称）
	private String state;						//状态
	private Long amountSum;                     // 支付金额汇总
	
	private List<MerchantPayList> merchList;		//商户打款清单列表
	
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
	public String getMerchName() {
		return merchName;
	}
	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}
	public List<MerchantPayList> getMerchList() {
		return merchList;
	}
	public void setMerchList(List<MerchantPayList> merchList) {
		this.merchList = merchList;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getAmountSum() {
		return amountSum;
	}
	public void setAmountSum(Long amountSum) {
		this.amountSum = amountSum;
	}
}
