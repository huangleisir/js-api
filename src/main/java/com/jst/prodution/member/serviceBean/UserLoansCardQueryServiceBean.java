package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.model.BankCardInfo;

public class UserLoansCardQueryServiceBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private String userId;//会员ID
	
	private String userName;//会员名称
	
	private String isLock; //是否锁定为贷款卡
	
	private List<UserLoansCardBean> loansCardList;

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
	
	public String getIsLock() {
		return isLock;
	}

	public void setIsLock(String isLock) {
		this.isLock = isLock;
	}

	public List<UserLoansCardBean> getLoansCardList() {
		return loansCardList;
	}

	public void setLoansCardList(List<UserLoansCardBean> loansCardList) {
		this.loansCardList = loansCardList;
	}
}
