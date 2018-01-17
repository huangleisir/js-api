package com.jst.prodution.settlement.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class ContrastDetailCollect extends BaseBean{

	private static final long serialVersionUID = 1L;
	private int id;
	private String transDate;							//交易日期
	private String paymentType;							//交易类型  1代扣  2代付
	private int transNum;								//系统笔数
	private int channelMoney;							//交易金额
	private int thirdChannelTransNum;					//第三方交易渠道交易笔数
	private int thirdChannelMoney;						//第三方交易渠道交易金额
	private int equalTransNum;							//平账笔数
	private int qualTransMoney;							//平账金额
	private String accountResult;						//对账结果 1帐不平 0 帐平
	private String channelType;							//通道类型  1快钱 2 建行
	private String confirmResult;						//对账结果确认 0 已确认 1 未确认
	private String recvAccNo;							//收款方账号
	private String payAccNo;							//付款方账号
	private String settleNo;							//清算账号
	private int noEqualMoneyNum;						//不一致笔数
	private int noEqualMoneyTran;						//不一致系统金额
	private int noEqualMoneyBank;						//不一致银行金额
	private int transHaveChannelNoneTransNum;			//系统有银行无笔数
	private int transHaveChannelNoneTransMoney;			//系统有银行无金额
	private int transNoneChannelHaveTransNum;			//系统无银行有笔数
	private int transNoneChannelHaveTransMoney;			//系统无银行有金额
	private int cutdayTransHaveChannelNoneTransNum;		//日切系统有银行无笔数
	private int cutdayTransHaveChannelNoneTransMoney;	//日切系统有银行无金额
	private int cutdayTransNoneChannelHaveTransNum;		//日切系统无银行有笔数
	private int cutdayTransNoneChannelHaveTransMoney;	//日切系统无银行有金额
	private String isConfirm;							//是否需要确认
	private String createdBy;							//创建人
	private String createdOn;							//创建时间
	private String updatedBy;							//修改人
	private String updatedOn;							//修改时间
	private String auditBy;								//审核人	
	private String auditOn;								//审核时间
	private int channelMoneySum;						//交易金额汇总
	private int thirdChannelMoneySum;					//第三方交易渠道交易金额汇总
	private int qualTransMoneySum;						//平账金额汇总
	private int noEqualMoneyTranSum;					//不一致系统金额汇总
	private int noEqualMoneyBankSum;					//不一致银行金额汇总
	private int transHaveChannelNoneTransMoneySum;		//系统有银行无金额汇总
	private int transNoneChannelHaveTransMoneySum;		//系统无银行有金额汇总
	private int cutdayTransHaveChannelNoneTransMoneySum;//日切系统有银行无金额汇总
	private int cutdayTransNoneChannelHaveTransMoneySum;//日切系统无银行有金额
	private boolean collectStatus;						//是否需要汇总
	private String psMerchantId;             //磐石商户号
	private List<ContrastDetailCollect> pageList;
	
	
	/**
     * @return the psMerchantId
     */
    public String getPsMerchantId() {
        return psMerchantId;
    }
    /**
     * @param psMerchantId the psMerchantId to set
     */
    public void setPsMerchantId(String psMerchantId) {
        this.psMerchantId = psMerchantId;
    }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public int getTransNum() {
		return transNum;
	}
	public void setTransNum(int transNum) {
		this.transNum = transNum;
	}
	public int getChannelMoney() {
		return channelMoney;
	}
	public void setChannelMoney(int channelMoney) {
		this.channelMoney = channelMoney;
	}
	public int getThirdChannelTransNum() {
		return thirdChannelTransNum;
	}
	public void setThirdChannelTransNum(int thirdChannelTransNum) {
		this.thirdChannelTransNum = thirdChannelTransNum;
	}
	public int getThirdChannelMoney() {
		return thirdChannelMoney;
	}
	public void setThirdChannelMoney(int thirdChannelMoney) {
		this.thirdChannelMoney = thirdChannelMoney;
	}
	public int getEqualTransNum() {
		return equalTransNum;
	}
	public void setEqualTransNum(int equalTransNum) {
		this.equalTransNum = equalTransNum;
	}
	public int getQualTransMoney() {
		return qualTransMoney;
	}
	public void setQualTransMoney(int qualTransMoney) {
		this.qualTransMoney = qualTransMoney;
	}
	public String getAccountResult() {
		return accountResult;
	}
	public void setAccountResult(String accountResult) {
		this.accountResult = accountResult;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getConfirmResult() {
		return confirmResult;
	}
	public void setConfirmResult(String confirmResult) {
		this.confirmResult = confirmResult;
	}
	public String getRecvAccNo() {
		return recvAccNo;
	}
	public void setRecvAccNo(String recvAccNo) {
		this.recvAccNo = recvAccNo;
	}
	public String getPayAccNo() {
		return payAccNo;
	}
	public void setPayAccNo(String payAccNo) {
		this.payAccNo = payAccNo;
	}
	public String getSettleNo() {
		return settleNo;
	}
	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public int getNoEqualMoneyNum() {
		return noEqualMoneyNum;
	}
	public void setNoEqualMoneyNum(int noEqualMoneyNum) {
		this.noEqualMoneyNum = noEqualMoneyNum;
	}
	public int getNoEqualMoneyTran() {
		return noEqualMoneyTran;
	}
	public void setNoEqualMoneyTran(int noEqualMoneyTran) {
		this.noEqualMoneyTran = noEqualMoneyTran;
	}
	public int getNoEqualMoneyBank() {
		return noEqualMoneyBank;
	}
	public void setNoEqualMoneyBank(int noEqualMoneyBank) {
		this.noEqualMoneyBank = noEqualMoneyBank;
	}
	public int getTransHaveChannelNoneTransNum() {
		return transHaveChannelNoneTransNum;
	}
	public void setTransHaveChannelNoneTransNum(int transHaveChannelNoneTransNum) {
		this.transHaveChannelNoneTransNum = transHaveChannelNoneTransNum;
	}
	public int getTransHaveChannelNoneTransMoney() {
		return transHaveChannelNoneTransMoney;
	}
	public void setTransHaveChannelNoneTransMoney(int transHaveChannelNoneTransMoney) {
		this.transHaveChannelNoneTransMoney = transHaveChannelNoneTransMoney;
	}
	public int getTransNoneChannelHaveTransNum() {
		return transNoneChannelHaveTransNum;
	}
	public void setTransNoneChannelHaveTransNum(int transNoneChannelHaveTransNum) {
		this.transNoneChannelHaveTransNum = transNoneChannelHaveTransNum;
	}
	public int getTransNoneChannelHaveTransMoney() {
		return transNoneChannelHaveTransMoney;
	}
	public void setTransNoneChannelHaveTransMoney(int transNoneChannelHaveTransMoney) {
		this.transNoneChannelHaveTransMoney = transNoneChannelHaveTransMoney;
	}
	public int getCutdayTransHaveChannelNoneTransNum() {
		return cutdayTransHaveChannelNoneTransNum;
	}
	public void setCutdayTransHaveChannelNoneTransNum(int cutdayTransHaveChannelNoneTransNum) {
		this.cutdayTransHaveChannelNoneTransNum = cutdayTransHaveChannelNoneTransNum;
	}
	public int getCutdayTransHaveChannelNoneTransMoney() {
		return cutdayTransHaveChannelNoneTransMoney;
	}
	public void setCutdayTransHaveChannelNoneTransMoney(int cutdayTransHaveChannelNoneTransMoney) {
		this.cutdayTransHaveChannelNoneTransMoney = cutdayTransHaveChannelNoneTransMoney;
	}
	public int getCutdayTransNoneChannelHaveTransNum() {
		return cutdayTransNoneChannelHaveTransNum;
	}
	public void setCutdayTransNoneChannelHaveTransNum(int cutdayTransNoneChannelHaveTransNum) {
		this.cutdayTransNoneChannelHaveTransNum = cutdayTransNoneChannelHaveTransNum;
	}
	public int getCutdayTransNoneChannelHaveTransMoney() {
		return cutdayTransNoneChannelHaveTransMoney;
	}
	public void setCutdayTransNoneChannelHaveTransMoney(int cutdayTransNoneChannelHaveTransMoney) {
		this.cutdayTransNoneChannelHaveTransMoney = cutdayTransNoneChannelHaveTransMoney;
	}
	public String getIsConfirm() {
		return isConfirm;
	}
	public void setIsConfirm(String isConfirm) {
		this.isConfirm = isConfirm;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getAuditBy() {
		return auditBy;
	}
	public void setAuditBy(String auditBy) {
		this.auditBy = auditBy;
	}
	public String getAuditOn() {
		return auditOn;
	}
	public void setAuditOn(String auditOn) {
		this.auditOn = auditOn;
	}
	public int getChannelMoneySum() {
		return channelMoneySum;
	}
	public void setChannelMoneySum(int channelMoneySum) {
		this.channelMoneySum = channelMoneySum;
	}
	public int getThirdChannelMoneySum() {
		return thirdChannelMoneySum;
	}
	public void setThirdChannelMoneySum(int thirdChannelMoneySum) {
		this.thirdChannelMoneySum = thirdChannelMoneySum;
	}
	public int getQualTransMoneySum() {
		return qualTransMoneySum;
	}
	public void setQualTransMoneySum(int qualTransMoneySum) {
		this.qualTransMoneySum = qualTransMoneySum;
	}
	public int getNoEqualMoneyTranSum() {
		return noEqualMoneyTranSum;
	}
	public void setNoEqualMoneyTranSum(int noEqualMoneyTranSum) {
		this.noEqualMoneyTranSum = noEqualMoneyTranSum;
	}
	public int getNoEqualMoneyBankSum() {
		return noEqualMoneyBankSum;
	}
	public void setNoEqualMoneyBankSum(int noEqualMoneyBankSum) {
		this.noEqualMoneyBankSum = noEqualMoneyBankSum;
	}
	public int getTransHaveChannelNoneTransMoneySum() {
		return transHaveChannelNoneTransMoneySum;
	}
	public void setTransHaveChannelNoneTransMoneySum(int transHaveChannelNoneTransMoneySum) {
		this.transHaveChannelNoneTransMoneySum = transHaveChannelNoneTransMoneySum;
	}
	public int getTransNoneChannelHaveTransMoneySum() {
		return transNoneChannelHaveTransMoneySum;
	}
	public void setTransNoneChannelHaveTransMoneySum(int transNoneChannelHaveTransMoneySum) {
		this.transNoneChannelHaveTransMoneySum = transNoneChannelHaveTransMoneySum;
	}
	public int getCutdayTransHaveChannelNoneTransMoneySum() {
		return cutdayTransHaveChannelNoneTransMoneySum;
	}
	public void setCutdayTransHaveChannelNoneTransMoneySum(int cutdayTransHaveChannelNoneTransMoneySum) {
		this.cutdayTransHaveChannelNoneTransMoneySum = cutdayTransHaveChannelNoneTransMoneySum;
	}
	public int getCutdayTransNoneChannelHaveTransMoneySum() {
		return cutdayTransNoneChannelHaveTransMoneySum;
	}
	public void setCutdayTransNoneChannelHaveTransMoneySum(int cutdayTransNoneChannelHaveTransMoneySum) {
		this.cutdayTransNoneChannelHaveTransMoneySum = cutdayTransNoneChannelHaveTransMoneySum;
	}
	public boolean getCollectStatus() {
		return collectStatus;
	}
	public void setCollectStatus(boolean collectStatus) {
		this.collectStatus = collectStatus;
	}
	public List<ContrastDetailCollect> getPageList() {
		return pageList;
	}
	public void setPageList(List<ContrastDetailCollect> pageList) {
		this.pageList = pageList;
	}
}
