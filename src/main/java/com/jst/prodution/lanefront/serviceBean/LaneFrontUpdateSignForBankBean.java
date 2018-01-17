package com.jst.prodution.lanefront.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class LaneFrontUpdateSignForBankBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String authenflowNo;   //系统流水号

    private String userId;   //用户标识

    private String certNo;

    private String certType;

    private String userName;

    private String bankcardNo;

    private String cardType;

    private String telephone;

    private String verifyNum;

    private Date createTime;

    private Date updateTime;

    private String cardlastfourno;

    private String cvv;

    private String expireDate;

    private String channelCode; //通道编码(001-快钱，002-银联，003-一网通)

    private String state; //0-成功，1-失败，2-处理中
    
    private String externalRefNumber;// 外部跟踪编号
    
    private String startTime;
    
    private String endTime;

    public String getAuthenflowNo() {
        return authenflowNo;
    }

    public void setAuthenflowNo(String authenflowNo) {
        this.authenflowNo = authenflowNo == null ? null : authenflowNo.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getBankcardNo() {
        return bankcardNo;
    }

    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo == null ? null : bankcardNo.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getVerifyNum() {
        return verifyNum;
    }

    public void setVerifyNum(String verifyNum) {
        this.verifyNum = verifyNum == null ? null : verifyNum.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCardlastfourno() {
        return cardlastfourno;
    }

    public void setCardlastfourno(String cardlastfourno) {
        this.cardlastfourno = cardlastfourno == null ? null : cardlastfourno.trim();
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv == null ? null : cvv.trim();
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate == null ? null : expireDate.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	public String getExternalRefNumber() {
		return externalRefNumber;
	}

	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
    
}
