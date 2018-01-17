package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 查询商户打款认证信息bean
 * @author Administrator
 *
 */
public class AuthenModelBean extends BaseBean{

	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userId;					//商户ID
	private String merchantId;				//商户号
	private String companyName;				//商户名称
	private String authenState;				//鉴权状态
	private String creditLevel;				//商户等级
	private String state;					//审核状态
	private String listId;					//清单ID
	private String billState;				//打款清单状态
	private String billPayTime;				//清单打款时间
	private String bankName;				//银行名称
	private String receiveCardNo;			//清单接收人卡号
	private String receiveName;				//清单接收人姓名
	private String timeOutState;			//清单超时状态
	
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAuthenState() {
		return authenState;
	}
	public void setAuthenState(String authenState) {
		this.authenState = authenState;
	}
	public String getCreditLevel() {
		return creditLevel;
	}
	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getListId() {
		return listId;
	}
	public void setListId(String listId) {
		this.listId = listId;
	}
	public String getBillState() {
		return billState;
	}
	public void setBillState(String billState) {
		this.billState = billState;
	}
	public String getBillPayTime() {
		return billPayTime;
	}
	public void setBillPayTime(String billPayTime) {
		this.billPayTime = billPayTime;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	public String getTimeOutState() {
		return timeOutState;
	}
	public void setTimeOutState(String timeOutState) {
		this.timeOutState = timeOutState;
	}
	
}
