package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员绑卡推送bean
 * @author Administrator
 *
 */
public class PushUserBankBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String userId ;            //用户标识                   
	private String cardId;           	//卡号	                   
	private String cardEnc;         	//银行账户加密，                  
	private String cardLast;          	//银行账户号尾数                          
	private String cardType;          	//银行卡类型                                    
	private String bankCode;          	//银行编码              
	private String bankName;          	//银行名称                        
	private String certType;         	//证件类型                  
	private String certNo;          	//证件号码              
	private String openName;          	//开户名            
	private String cardUsage; 			//结算默认标识：0非结算  1结算
	private String bankcardStat;       //银行卡状态：0未绑定  1 已绑定  2 已解绑
	private String telphone;     		//银行预留手机号
	private String createTime;     		//创建时间
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardEnc() {
		return cardEnc;
	}
	public void setCardEnc(String cardEnc) {
		this.cardEnc = cardEnc;
	}
	public String getCardLast() {
		return cardLast;
	}
	public void setCardLast(String cardLast) {
		this.cardLast = cardLast;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getOpenName() {
		return openName;
	}
	public void setOpenName(String openName) {
		this.openName = openName;
	}
	public String getCardUsage() {
		return cardUsage;
	}
	public void setCardUsage(String cardUsage) {
		this.cardUsage = cardUsage;
	}
	public String getBankcardStat() {
		return bankcardStat;
	}
	public void setBankcardStat(String bankcardStat) {
		this.bankcardStat = bankcardStat;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
