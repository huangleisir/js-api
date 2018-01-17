package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 生成商户打款清单
 * @author 吴安辉
 *
 */
public class MerchPayBillBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String userId;				//商户ID
	private String merchantId;			//商户号
	private String bankName;			//银行名称
	private String bankCode;			//银行编号
	private String receiveCardNo;		//收款人银行卡号
	private String receiveName;			//收款人姓名
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
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getReceiveCardNo() {
		return receiveCardNo;
	}
	public void setReceiveCardNo(String receiveCardNo) {
		this.receiveCardNo = receiveCardNo;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}

}
