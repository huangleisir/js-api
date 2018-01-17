package com.jst.prodution.member.model;

/**
 * 会员绑卡信息表
 * 
 * @author zhouyl
 *
 */
public class BankCardInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String userId ;            //用户标识                   
	private String cardId;           	//卡号	                   
	private String cardEnc;         	//银行账户加密，
	private String cardHash;			//银行账户号哈希
	private String cardFirst;          //银行账户号号段                    
	private String cardLast;          	//银行账户号尾数                
	private String cardLen;          	//银行号码长度              
	private String cardType;          	//银行卡类型                 
	private String cardUsage;          //卡用途：0非结算  1结算                 
	private String bankCode;          	//银行编码              
	private String bankName;          	//银行名称             
	private String bankShort;          //银行简称              
	private String certType;         	//证件类型                  
	private String certNo;          	//证件号码
	private String certVerify;			//绑卡成功标识  Y成功 N失败
	private String openName;          	//开户名          
	private String openProvince;       //开户省                
	private String openCity;          	//开户市         
	private String branbankNm;         //支行名称          
	private String expireYear;         //有效期年    
	private String expireMonth;        //有效期月        
	private String certcardCVN;        //信用卡cvn    
	private String bankcardStat;       //银行卡状态 0，未绑定1，已绑定 2，已解绑
	private String telphone;     		//银行预留手机号
	private String createTime;     		//创建时间
	private String modifyTime; 			//修改时间
	private String isLock;              // 贷款卡 00:锁定，01 解除
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
	public String getCardHash() {
		return cardHash;
	}
	public void setCardHash(String cardHash) {
		this.cardHash = cardHash;
	}
	public String getCardFirst() {
		return cardFirst;
	}
	public void setCardFirst(String cardFirst) {
		this.cardFirst = cardFirst;
	}
	public String getCardLast() {
		return cardLast;
	}
	public void setCardLast(String cardLast) {
		this.cardLast = cardLast;
	}
	public String getCardLen() {
		return cardLen;
	}
	public void setCardLen(String cardLen) {
		this.cardLen = cardLen;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardUsage() {
		return cardUsage;
	}
	public void setCardUsage(String cardUsage) {
		this.cardUsage = cardUsage;
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
	public String getBankShort() {
		return bankShort;
	}
	public void setBankShort(String bankShort) {
		this.bankShort = bankShort;
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
	public String getCertVerify() {
		return certVerify;
	}
	public void setCertVerify(String certVerify) {
		this.certVerify = certVerify;
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
	public String getOpenProvince() {
		return openProvince;
	}
	public void setOpenProvince(String openProvince) {
		this.openProvince = openProvince;
	}
	public String getOpenCity() {
		return openCity;
	}
	public void setOpenCity(String openCity) {
		this.openCity = openCity;
	}
	public String getBranbankNm() {
		return branbankNm;
	}
	public void setBranbankNm(String branbankNm) {
		this.branbankNm = branbankNm;
	}
	public String getExpireYear() {
		return expireYear;
	}
	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}
	public String getExpireMonth() {
		return expireMonth;
	}
	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}
	public String getCertcardCVN() {
		return certcardCVN;
	}
	public void setCertcardCVN(String certcardCVN) {
		this.certcardCVN = certcardCVN;
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
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getIsLock() {
		return isLock;
	}
	public void setIsLock(String isLock) {
		this.isLock = isLock;
	}
}
