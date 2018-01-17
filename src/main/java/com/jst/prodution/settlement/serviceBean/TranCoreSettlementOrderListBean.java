package com.jst.prodution.settlement.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreSettlementOrderListBean extends BaseBean {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Integer repDateStart;

    private Integer repDateEnd;

	private String settlementNo;

    private String settlementState;

    private String merchantId; 

    private String merchantMemberId;
    
    private Integer settlementDate;
    
    private String settlementType;
    
    private String merchantName;
    
    private String companyShortName;
    
    private String bankAcctno;

    private String bankAcctNoSuf;//拓展商

    private Long tranAcount;//结算金额,在这里表示汇总金额
    
    private Long tradeAccount ;//交易金额,在这里表示汇总金额
    
    private Integer settlementNumber;

    private String remark;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    private String cycle;
    
    private String oFlag;//
    
    private Long feeAmountTotal;//手续费汇总
    
    private Long thdAmountTotal;//分润金额汇总
    
    private Integer settSuccTotal;//结算成功笔数

    private Long settSuccBalance;//结算成功金额
    
    private String settInOut;//结算类型   
    private  String jstMerchantId;
    private String payedFlag;
    private String merchantLvl;//商户类别 1-1级商户 2-2级商户
    
    private List<TranCoreSettlementOrderBean> tranCoreSettlementOrderList;

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo == null ? null : settlementNo.trim();
    }

    public String getSettlementState() {
        return settlementState;
    }

    public void setSettlementState(String settlementState) {
        this.settlementState = settlementState == null ? null : settlementState.trim();
    }
    public String getMerchantLvl() {
        return merchantLvl;
    }

    public void setMerchantLvl(String merchantLvl) {
        this.merchantLvl = merchantLvl;
    }
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantMemberId() {
        return merchantMemberId;
    }

    public void setMerchantMemberId(String merchantMemberId) {
        this.merchantMemberId = merchantMemberId == null ? null : merchantMemberId.trim();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
    }

    public String getBankAcctno() {
        return bankAcctno;
    }

    public void setBankAcctno(String bankAcctno) {
        this.bankAcctno = bankAcctno == null ? null : bankAcctno.trim();
    }

    public String getBankAcctNoSuf() {
        return bankAcctNoSuf;
    }

    public void setBankAcctNoSuf(String bankAcctNoSuf) {
        this.bankAcctNoSuf = bankAcctNoSuf == null ? null : bankAcctNoSuf.trim();
    }

    public Integer getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }

 

    public Integer getSettlementNumber() {
        return settlementNumber;
    }

    public void setSettlementNumber(Integer settlementNumber) {
        this.settlementNumber = settlementNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
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

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }
    
    public List<TranCoreSettlementOrderBean> getTranCoreSettlementOrderList() {
        return tranCoreSettlementOrderList;
    }

    public void setTranCoreSettlementOrderList(List<TranCoreSettlementOrderBean> tranCoreSettlementOrderList) {
        this.tranCoreSettlementOrderList = tranCoreSettlementOrderList;
    }


    /**
     * @return the companyShortName
     */
    public String getCompanyShortName() {
        return companyShortName;
    }

    /**
     * @param companyShortName the companyShortName to set
     */
    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    /**
     * @return the merchantName
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * @param merchantName the merchantName to set
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * @return the oFlag
     */
    public String getoFlag() {
        return oFlag;
    }

    /**
     * @param oFlag the oFlag to set
     */
    public void setoFlag(String oFlag) {
        this.oFlag = oFlag;
    }

    /**
     * @return the settSuccTotal
     */
    public Integer getSettSuccTotal() {
        return settSuccTotal;
    }

    /**
     * @param settSuccTotal the settSuccTotal to set
     */
    public void setSettSuccTotal(Integer settSuccTotal) {
        this.settSuccTotal = settSuccTotal;
    }

    /**
     * @return the settSuccBalance
     */
    public Long getSettSuccBalance() {
        return settSuccBalance;
    }

    /**
     * @param settSuccBalance the settSuccBalance to set
     */
    public void setSettSuccBalance(Long settSuccBalance) {
        this.settSuccBalance = settSuccBalance;
    }

    /**
     * @return the settInOut
     */
    public String getSettInOut() {
        return settInOut;
    }

    /**
     * @param settInOut the settInOut to set
     */
    public void setSettInOut(String settInOut) {
        this.settInOut = settInOut;
    }

    public Long getFeeAmountTotal() {
        return feeAmountTotal;
    }

    public void setFeeAmountTotal(Long feeAmountTotal) {
        this.feeAmountTotal = feeAmountTotal;
    }

    public Long getThdAmountTotal() {
        return thdAmountTotal;
    }

    public void setThdAmountTotal(Long thdAmountTotal) {
        this.thdAmountTotal = thdAmountTotal;
    }

    public Long getTranAcount() {
        return tranAcount;
    }

    public void setTranAcount(Long tranAcount) {
        this.tranAcount = tranAcount;
    }

    public Integer getRepDateStart() {
        return repDateStart;
    }

    public void setRepDateStart(Integer repDateStart) {
        this.repDateStart = repDateStart;
    }

    public Integer getRepDateEnd() {
        return repDateEnd;
    }

    public void setRepDateEnd(Integer repDateEnd) {
        this.repDateEnd = repDateEnd;
    }

    public Long getTradeAccount() {
        return tradeAccount;
    }

    public void setTradeAccount(Long tradeAccount) {
        this.tradeAccount = tradeAccount;
    }

    public String getJstMerchantId() {
        return jstMerchantId;
    }

    public void setJstMerchantId(String jstMerchantId) {
        this.jstMerchantId = jstMerchantId;
    }

    public String getPayedFlag() {
        return payedFlag;
    }

    public void setPayedFlag(String payedFlag) {
        this.payedFlag = payedFlag;
    }
}
