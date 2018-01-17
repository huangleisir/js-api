/**
 * author:汤广海
 * 2017年6月23日
 * 上午9:47:35
 */
package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class QmQueryTranBean extends BaseBean{
	/**
	 * 查询交易流水
	 */
	private static final long serialVersionUID = 1L;
	private String externalRefNumber;//外部跟踪号
	private String txnType;//交易类型 RFD:退货交易查询    PUR:消费
	private String merchantId;//商户号
	private String terminalId;//终端号
	private String amount;//金额
	private String entryTime;
	private String transTime;
	private String voidFlag;
	private String refNumber;
	private String responseCode;
	private String responseTextMessage;
	private String cardOrg;
	private String issuer;
	private String storableCardNo;
	private String authorizationCode;
	private String txnStatus; //S－交易成功,F－交易失败,P－交易挂起
	
	
	public String getExternalRefNumber() {
		return externalRefNumber;
	}
	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	public String getVoidFlag() {
		return voidFlag;
	}
	public void setVoidFlag(String voidFlag) {
		this.voidFlag = voidFlag;
	}
	public String getRefNumber() {
		return refNumber;
	}
	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseTextMessage() {
		return responseTextMessage;
	}
	public void setResponseTextMessage(String responseTextMessage) {
		this.responseTextMessage = responseTextMessage;
	}
	public String getCardOrg() {
		return cardOrg;
	}
	public void setCardOrg(String cardOrg) {
		this.cardOrg = cardOrg;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public String getStorableCardNo() {
		return storableCardNo;
	}
	public void setStorableCardNo(String storableCardNo) {
		this.storableCardNo = storableCardNo;
	}
	public String getAuthorizationCode() {
		return authorizationCode;
	}
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	public String getTxnStatus() {
		return txnStatus;
	}
	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

}
