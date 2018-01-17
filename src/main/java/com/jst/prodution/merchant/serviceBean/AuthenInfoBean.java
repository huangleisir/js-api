package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 授权认证信息
 * @author Administrator
 *
 */
public class AuthenInfoBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String userId;						//商户ID
	private String userName;					//商户名称
	private String merchantId;					//商户号
	private String creditLevel;					//商户等级
	private String authenState;					//认证（鉴权）状态
	private int payErrorNum;					//回款认证错误次数
	private List<AuthenModelBean> billList;		//打款清单
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getCreditLevel() {
		return creditLevel;
	}
	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}
	public String getAuthenState() {
		return authenState;
	}
	public void setAuthenState(String authenState) {
		this.authenState = authenState;
	}
	public List<AuthenModelBean> getBillList() {
		return billList;
	}
	public void setBillList(List<AuthenModelBean> billList) {
		this.billList = billList;
	}
	public int getPayErrorNum() {
		return payErrorNum;
	}
	public void setPayErrorNum(int payErrorNum) {
		this.payErrorNum = payErrorNum;
	}

}
