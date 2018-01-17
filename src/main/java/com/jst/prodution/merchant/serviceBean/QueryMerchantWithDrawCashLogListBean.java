package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantWithDrawCashLog;

/**
 * 
* @ClassName: QueryMerchantWithDrawCashLogListBean 
* @Description: TODO(提现日志bean) 
* @author 曾传保 
* @date 2017年7月4日 上午9:28:32 
*
 */
public class QueryMerchantWithDrawCashLogListBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private String merchantId;//商户号
	
	private int withdrawCashAmountSum;//提现金额总和
	
	private List<MerchantWithDrawCashLog> withDrawCashLogList;

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public int getWithdrawCashAmountSum() {
		return withdrawCashAmountSum;
	}

	public void setWithdrawCashAmountSum(int withdrawCashAmountSum) {
		this.withdrawCashAmountSum = withdrawCashAmountSum;
	}

	public List<MerchantWithDrawCashLog> getWithDrawCashLogList() {
		return withDrawCashLogList;
	}

	public void setWithDrawCashLogList(List<MerchantWithDrawCashLog> withDrawCashLogList) {
		this.withDrawCashLogList = withDrawCashLogList;
	}
}
