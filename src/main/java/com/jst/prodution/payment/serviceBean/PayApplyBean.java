package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 交易核心发起付款申请bean
 * @author Administrator
 *
 */
public class PayApplyBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String tranOrderNo;				//交易订单流水号
	private String payType;					//付款类型：01个人提现 02商户提现 03理财回款 04信贷放款 05人工出款 06 收入出款  07打款验证 08-营销放款 09-其他出款
	private String bankName;				//银行名称
	private String bankCode;				//银行编码
	private String cardNo;					//银行卡号
	private String receiveName;				//收款人姓名
	private String bankNo;					//银行卡所号
	private String openBankName;			//收款账户开户机构名称
	private String userId;					//会员号
	private String userName;				//会员名称
	private String userType;				//会员类型
	private Long amount;					//提现金额
	private Integer cutDate;				//日切日期
	private String usePay;               //付款用途
	
	
	/**
     * @return the usePay
     */
    public String getUsePay() {
        return usePay;
    }
    /**
     * @param usePay the usePay to set
     */
    public void setUsePay(String usePay) {
        this.usePay = usePay;
    }
    public String getTranOrderNo() {
		return tranOrderNo;
	}
	public void setTranOrderNo(String tranOrderNo) {
		this.tranOrderNo = tranOrderNo;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getOpenBankName() {
		return openBankName;
	}
	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Integer getCutDate() {
		return cutDate;
	}
	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}
	
}
