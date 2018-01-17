/**
 * author:汤广海
 * 2016年11月1日
 * 下午3:30:24
 */
package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class QmAKeyToPayBean extends BaseBean {

	/**
	 * 快钱-一键支付
	 */
	private static final long serialVersionUID = 1L;

	private String version;// 版本号
	private String txnType;// 交易类型编码
	private String spFlag;// 特殊交易标志
	private String interactiveStatus;// 消息状态
	private String merchantId;// 商户编号
	private String terminalId;// 终端编号
	private String externalRefNumber;// 外部跟踪编号
	private String amount;// 交易金额
	private String cardNo;// 卡号
	private String storableCardNo;// 短卡号
	private String expiredDate;// 卡有效期
	private String cvv2;// 安全校验值
	private String customerId;// 客户号
	private String cardHolderName;// 客户姓名
	private String idType;// 客户证件类型
	private String cardHolderId;// 客户身份证号
	private String entryTime;// 商户端交易时间
	private String payBatch;// 快捷支付批次
	private String savePciFlag;// 是否保存鉴权信息
	private String phone;// 持卡人手机号
	private String validCode;// 手机验证码
	private String token;// 手机验证码令牌
	private String tr3Url;// tr3Url地址
	private String transTime;// 交易传输时间
	private String responseCode;// 应答码
	private String responseTextMessage;// 应答码文本消息
	private String refNumber;//系统参考号
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public String getSpFlag() {
		return spFlag;
	}
	public void setSpFlag(String spFlag) {
		this.spFlag = spFlag;
	}
	public String getInteractiveStatus() {
		return interactiveStatus;
	}
	public void setInteractiveStatus(String interactiveStatus) {
		this.interactiveStatus = interactiveStatus;
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
	public String getExternalRefNumber() {
		return externalRefNumber;
	}
	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getStorableCardNo() {
		return storableCardNo;
	}
	public void setStorableCardNo(String storableCardNo) {
		this.storableCardNo = storableCardNo;
	}
	public String getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}
	public String getCvv2() {
		return cvv2;
	}
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getCardHolderId() {
		return cardHolderId;
	}
	public void setCardHolderId(String cardHolderId) {
		this.cardHolderId = cardHolderId;
	}
	public String getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}
	public String getPayBatch() {
		return payBatch;
	}
	public void setPayBatch(String payBatch) {
		this.payBatch = payBatch;
	}
	public String getSavePciFlag() {
		return savePciFlag;
	}
	public void setSavePciFlag(String savePciFlag) {
		this.savePciFlag = savePciFlag;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getValidCode() {
		return validCode;
	}
	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTr3Url() {
		return tr3Url;
	}
	public void setTr3Url(String tr3Url) {
		this.tr3Url = tr3Url;
	}
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
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
	public String getRefNumber() {
		return refNumber;
	}
	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}
}
