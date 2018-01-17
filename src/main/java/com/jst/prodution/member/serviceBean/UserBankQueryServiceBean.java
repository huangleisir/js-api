package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.model.BankCardInfo;

/**
 * 会员银行卡列表查询
 * @author 吴安辉
 *
 */
public class UserBankQueryServiceBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String userId;			//会员ID
	private String openName;		//开户人
	private String bankCode;		//开户银行
	private String bankName;		//开户银行名称
	private String cardType;       //卡类型01:借记卡02贷记卡03对公账户04预付卡
	private String state;			// 银行卡状态  0，未绑定1，已绑定 2，已解绑
	List<BankCardInfo> bankList;	//卡列表
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOpenName() {
		return openName;
	}
	public void setOpenName(String openName) {
		this.openName = openName;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<BankCardInfo> getBankList() {
		return bankList;
	}
	public void setBankList(List<BankCardInfo> bankList) {
		this.bankList = bankList;
	}
    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }
    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
	
}
