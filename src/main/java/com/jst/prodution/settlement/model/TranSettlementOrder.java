package com.jst.prodution.settlement.model;

import java.util.Date;

public class TranSettlementOrder implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer repDate;

    private String settlementNo;

    private String settlementState;

    private Integer settSuccTotal;

    private Long settSuccBalance;

    private String merchantName;

    private String merchantId;

    private String merchantMemberId;

    private String settlementType;

    private String bankAcctno;

    private String bankAcctNoSuf;//拓展商

    private Integer settlementDate;

    private Long tranAcount;//结算金额
    
    private Long tradeAccount;//交易金额

    private Integer settlementNumber;

    private String remark;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    private String cycle;

    private Long feeAmountTotal;

    private Long thdAmountTotal;
    
    private String settInOut;//结算类型

    private String upMerchantId;
    private String useOf;
    private String upUserId;
    private String merchantLvl;//结算状态

    private String jstMerchantId;

    private String payedFlag;

    private String payNo;

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo == null ? null : settlementNo.trim();
    }

    public String getUpMerchantId() {
        return upMerchantId;
    }

    public void setUpMerchantId(String upMerchantId) {
        this.upMerchantId = upMerchantId;
    }

    public String getUpUserId() {
        return upUserId;
    }

    public void setUpUserId(String upUserId) {
        this.upUserId = upUserId;
    }
    public String getMerchantLvl() {
        return merchantLvl;
    }

    public void setMerchantLvl(String merchantLvl) {
        this.merchantLvl = merchantLvl;
    }
    public String getSettlementState() {
        return settlementState;
    }

    public void setSettlementState(String settlementState) {
        this.settlementState = settlementState == null ? null : settlementState.trim();
    }

    public Integer getSettSuccTotal() {
        return settSuccTotal;
    }

    public void setSettSuccTotal(Integer settSuccTotal) {
        this.settSuccTotal = settSuccTotal;
    }

    public Long getSettSuccBalance() {
        return settSuccBalance;
    }

    public void setSettSuccBalance(Long settSuccBalance) {
        this.settSuccBalance = settSuccBalance;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
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


    /**
     * @return the tranAcount
     */
    public Long getTranAcount() {
        return tranAcount;
    }

    /**
     * @param tranAcount the tranAcount to set
     */
    public void setTranAcount(Long tranAcount) {
        this.tranAcount = tranAcount;
    }

    /**
     * @return the feeAmountTotal
     */
    public Long getFeeAmountTotal() {
        return feeAmountTotal;
    }

    /**
     * @param feeAmountTotal the feeAmountTotal to set
     */
    public void setFeeAmountTotal(Long feeAmountTotal) {
        this.feeAmountTotal = feeAmountTotal;
    }

    /**
     * @return the thdAmountTotal
     */
    public Long getThdAmountTotal() {
        return thdAmountTotal;
    }

    /**
     * @param thdAmountTotal the thdAmountTotal to set
     */
    public void setThdAmountTotal(Long thdAmountTotal) {
        this.thdAmountTotal = thdAmountTotal;
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

    public Integer getRepDate() {
        return repDate;
    }

    public void setRepDate(Integer repDate) {
        this.repDate = repDate;
    }

    public Long getTradeAccount() {
        return tradeAccount;
    }

    public void setTradeAccount(Long tradeAccount) {
        this.tradeAccount = tradeAccount;
    }

    public String getUseOf() {
        return useOf;
    }

    public void setUseOf(String useOf) {
        this.useOf = useOf;
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

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
}