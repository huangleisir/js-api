package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.listbean.BindBkCardListBean;

/**
 * 会员绑卡第一次鉴权
 * @author liang
 *
 */
public class UserBindBkCardsCardBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String userId;  // 用户id
	private String userName;     //用户名称  
	private String bankCardCode;     //银行卡号   
	private String certification;     //用户认证标识  
	private String bankCardType ; //卡类型 01借记卡 02贷记卡
	private List<BindBkCardListBean> BindBkCardList; //银行卡信息列表
	private int maxCardsNum; //允许用户最多绑卡张数
	
	public int getMaxCardsNum() {
		return maxCardsNum;
	}
	public void setMaxCardsNum(int maxCardsNum) {
		this.maxCardsNum = maxCardsNum;
	}
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

	public String getBankCardCode() {
		return bankCardCode;
	}
	public void setBankCardCode(String bankCardCode) {
		this.bankCardCode = bankCardCode;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getBankCardType() {
		return bankCardType;
	}
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	public List<BindBkCardListBean> getBindBkCardList() {
		return BindBkCardList;
	}
	public void setBindBkCardList(List<BindBkCardListBean> bindBkCardList) {
		BindBkCardList = bindBkCardList;
	}
}
