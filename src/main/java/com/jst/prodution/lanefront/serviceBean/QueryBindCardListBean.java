package com.jst.prodution.lanefront.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 绑卡列表
 * @author 汤广海
 *
 */
public class QueryBindCardListBean extends BaseBean {
	

	private static final long serialVersionUID = 1L;
	private String authenflowNo;
    private String userId;
    private String certNo;
    private String certType;
    private String userName;
    private String bankcardNo;
    private String cardType;
    private String telephone;
    private String verifyNum;
    private String createTime;
    private Date updateTime;
    private String cardlastfourno;
    private String cvv;
    private String expireDate;
    private String channelCode;
    private String state;
    private String externalRefNumber;// 外部跟踪编号
    private List<QueryBindCardListBean> bindCardListBean;
    
	public String getAuthenflowNo() {
		return authenflowNo;
	}
	public void setAuthenflowNo(String authenflowNo) {
		this.authenflowNo = authenflowNo;
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
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBankcardNo() {
		return bankcardNo;
	}
	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
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
	public String getVerifyNum() {
		return verifyNum;
	}
	public void setVerifyNum(String verifyNum) {
		this.verifyNum = verifyNum;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
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
		this.cardlastfourno = cardlastfourno;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getExternalRefNumber() {
		return externalRefNumber;
	}
	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}
	public List<QueryBindCardListBean> getBindCardListBean() {
		return bindCardListBean;
	}
	public void setBindCardListBean(List<QueryBindCardListBean> bindCardListBean) {
		this.bindCardListBean = bindCardListBean;
	}
    
}
