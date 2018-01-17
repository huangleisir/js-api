package com.jst.prodution.settlement.model;

import java.util.Date;

public class SettBalanceOrder implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;


    private String reviewStatus;//审核状态 00-待审核，01--已审核
    private  String payAcctType;  //账户类型(01-基本户,02-待结算账户,03-备付金账户,04-待清算账户, 05-代扣长款户,06-代付长款户,07-代扣短款户,08-代付短款户,09-贷款收款户,10-贷款付款户)
    private String regSeq;   //序号  结算流水

    private Integer regDate;

    private String settType;

    private Integer settlementDate;//结算日期

    private Long tranAmount;//交易金额

    private Long settleMinAmount;

    private Long settAmount;//结算金额

    private String settAmountType;//结算金额来源

    private String settStatus;//结算状态 0,--待结算，1--结算成功，2--结算中，3--结算失败,4--不需结算

    private String outMchNo;

    private String outMchmemId;

    private String outMchName;

    private String inMchNo;//商户号

    private String inMchmemId;//商户会员id

    private String inMchName;//商户名称

    private String inBankCard;

    private String inBankcardName;

    private String inBankName;

    private String inBankCode;
    private String inCcpcCode;

    private String inBankBranch;

    private Integer backNum;

    private Long backAmount;

    private Date createdOn;

    private Date updatedOn;
    private String useOf;
    private String remark;
    private Long feeAmount;//手续费金额
    public String getPayAcctType() {
        return payAcctType;
    }

    public void setPayAcctType(String payAcctType) {
        this.payAcctType = payAcctType;
    }
    public String getRegSeq() {
        return regSeq;
    }

    public void setRegSeq(String regSeq) {
        this.regSeq = regSeq == null ? null : regSeq.trim();
    }

    public Integer getRegDate() {
        return regDate;
    }

    public void setRegDate(Integer regDate) {
        this.regDate = regDate;
    }

    public String getSettType() {
        return settType;
    }

    public void setSettType(String settType) {
        this.settType = settType == null ? null : settType.trim();
    }

    public Integer getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    public Long getSettleMinAmount() {
        return settleMinAmount;
    }

    public void setSettleMinAmount(Long settleMinAmount) {
        this.settleMinAmount = settleMinAmount;
    }

    public Long getSettAmount() {
        return settAmount;
    }

    public void setSettAmount(Long settAmount) {
        this.settAmount = settAmount;
    }

    public String getSettAmountType() {
        return settAmountType;
    }

    public void setSettAmountType(String settAmountType) {
        this.settAmountType = settAmountType == null ? null : settAmountType.trim();
    }

    public String getSettStatus() {
        return settStatus;
    }

    public void setSettStatus(String settStatus) {
        this.settStatus = settStatus == null ? null : settStatus.trim();
    }

    public String getOutMchNo() {
        return outMchNo;
    }

    public void setOutMchNo(String outMchNo) {
        this.outMchNo = outMchNo == null ? null : outMchNo.trim();
    }

    public String getOutMchmemId() {
        return outMchmemId;
    }

    public void setOutMchmemId(String outMchmemId) {
        this.outMchmemId = outMchmemId == null ? null : outMchmemId.trim();
    }

    public String getOutMchName() {
        return outMchName;
    }

    public void setOutMchName(String outMchName) {
        this.outMchName = outMchName == null ? null : outMchName.trim();
    }

    public String getInMchNo() {
        return inMchNo;
    }

    public void setInMchNo(String inMchNo) {
        this.inMchNo = inMchNo == null ? null : inMchNo.trim();
    }

    public String getInMchmemId() {
        return inMchmemId;
    }

    public void setInMchmemId(String inMchmemId) {
        this.inMchmemId = inMchmemId == null ? null : inMchmemId.trim();
    }

    public String getInMchName() {
        return inMchName;
    }

    public void setInMchName(String inMchName) {
        this.inMchName = inMchName == null ? null : inMchName.trim();
    }

    public String getInBankCard() {
        return inBankCard;
    }

    public void setInBankCard(String inBankCard) {
        this.inBankCard = inBankCard == null ? null : inBankCard.trim();
    }

    public String getInBankcardName() {
        return inBankcardName;
    }

    public void setInBankcardName(String inBankcardName) {
        this.inBankcardName = inBankcardName == null ? null : inBankcardName.trim();
    }

    public String getInBankName() {
        return inBankName;
    }

    public void setInBankName(String inBankName) {
        this.inBankName = inBankName == null ? null : inBankName.trim();
    }

    public String getInBankCode() {
        return inBankCode;
    }

    public void setInBankCode(String inBankCode) {
        this.inBankCode = inBankCode == null ? null : inBankCode.trim();
    }

    public String getInCcpcCode() {
        return inCcpcCode;
    }

    public void setInCcpcCode(String inCcpcCode) {
        this.inCcpcCode = inCcpcCode == null ? null : inCcpcCode.trim();
    }

    public String getInBankBranch() {
        return inBankBranch;
    }

    public void setInBankBranch(String inBankBranch) {
        this.inBankBranch = inBankBranch == null ? null : inBankBranch.trim();
    }

    public Integer getBackNum() {
        return backNum;
    }

    public void setBackNum(Integer backNum) {
        this.backNum = backNum;
    }

    public Long getBackAmount() {
        return backAmount;
    }

    public void setBackAmount(Long backAmount) {
        this.backAmount = backAmount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getUseOf() {
        return useOf;
    }

    public void setUseOf(String useOf) {
        this.useOf = useOf;
    }

    public Long getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Long feeAmount) {
        this.feeAmount = feeAmount;
    }
}