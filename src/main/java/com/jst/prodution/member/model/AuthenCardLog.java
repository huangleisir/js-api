package com.jst.prodution.member.model;

/**
 * 卡绑定鉴权日志表
 * @author zhouyl
 *
 */
public class AuthenCardLog implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String logId;             		//序列号                     
	private String userId;             		//用户标识                  
	private String certNo;           		//用户身份证号码  
	private String userName;           		//用户姓名     
	private String cardId;           		//银行卡号  
	private String operType;           		//1,绑卡，2，重置密码
	private String bankName;     			//银行名称  
	private String cardType;           		//卡类型     
	private String telephone;           	//银行预留手机号码      
	private String cardflag;           		//新卡标志       
	private String verifyNum;           	//短信校验码
	private String token;					//令牌信息
	private String externalRefNumber;		// 外部跟踪编号	
	private String authenflowNo;           //系统流水号  
	private String createTime;           	//创建时间   
	private String modifyTime;           	//变更时间    
	private String status;           		//状态 0，插入记录之前 1，第-次鉴权完成 2，第二次鉴权完成    
	private String expireDate;           	//有效期限
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCardflag() {
		return cardflag;
	}
	public void setCardflag(String cardflag) {
		this.cardflag = cardflag;
	}
	public String getVerifyNum() {
		return verifyNum;
	}
	public void setVerifyNum(String verifyNum) {
		this.verifyNum = verifyNum;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getExternalRefNumber() {
		return externalRefNumber;
	}
	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}
	public String getAuthenflowNo() {
		return authenflowNo;
	}
	public void setAuthenflowNo(String authenflowNo) {
		this.authenflowNo = authenflowNo;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getOperType() {
		return operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
}
