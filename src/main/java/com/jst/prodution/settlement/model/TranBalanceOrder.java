package com.jst.prodution.settlement.model;

import java.util.Date;

public class TranBalanceOrder implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String mchSettSeq;//商户待结算单流水

    private Integer mchSettDate;//商户待结算单日期

    private String settType;//结算方式(2-结算到余额,1-结算到银行卡)

    private String settInOut;//结算类型（01-交易内结算，02--交易外结算）
    private String settleCycleType;//N:T+N,W:周结,M:月结,HM:半月结
    private Integer settCycle;//结算周期

    private Integer settlementDate;//结算日期

    private Integer preSettDate;//待结算单日期

    private Integer settleMaxDate;//最迟结算日期

    private Long tranAmount;//交易金额
    private Long settleMinAmount;//结算起始金额
    private Long settAmount;//结算金额

    private String settAmountType;//结算金额类型(0--结算金额，1--收费金额，2--分润金额)

    private String settStatus;//结算状态（0,--待结算，1--结算成功，2--结算中，3--结算失败）

    private String outMchNo;//结算出账商户号

    private String outMchmemId;//结算出账商户ID

    private String outMchName;//结算出账商户名称

    private String inMchNo;//结算入账商户号

    private String inMchmemId;//'结算入账商户ID

    private String inMchName;//结算入账商户名称

    private String inBankCard;//结算入账账户

    private String inBankcardName;//结算入账账户名称

    private String inBankName;//结算入账银行名称

    private String inBankCode;//结算入账银行编号

    private String inCcpcCode;//结算入账银行联行号

    private String inBankBranch;//结算入账银行分行

    private Integer backNum;//退款笔数

    private Long backAmount;//退款金额

    private Date createdOn;

    private Date updatedOn;

    private String remark;
    private String foreignSeq;

    private Integer settNum;
    private String tranMchNo;

    private String tranMchId;
    public String getMchSettSeq() {
        return mchSettSeq;
    }

    public void setMchSettSeq(String mchSettSeq) {
        this.mchSettSeq = mchSettSeq == null ? null : mchSettSeq.trim();
    }

    public Integer getMchSettDate() {
        return mchSettDate;
    }

    public void setMchSettDate(Integer mchSettDate) {
        this.mchSettDate = mchSettDate;
    }

    public String getSettType() {
        return settType;
    }

    public void setSettType(String settType) {
        this.settType = settType == null ? null : settType.trim();
    }

    public String getSettInOut() {
        return settInOut;
    }

    public void setSettInOut(String settInOut) {
        this.settInOut = settInOut == null ? null : settInOut.trim();
    }

    public Integer getSettCycle() {
        return settCycle;
    }

    public void setSettCycle(Integer settCycle) {
        this.settCycle = settCycle;
    }

    public Integer getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Integer getPreSettDate() {
        return preSettDate;
    }

    public void setPreSettDate(Integer preSettDate) {
        this.preSettDate = preSettDate;
    }

    public Integer getSettleMaxDate() {
        return settleMaxDate;
    }

    public void setSettleMaxDate(Integer settleMaxDate) {
        this.settleMaxDate = settleMaxDate;
    }

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
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

    public String getSettleCycleType() {
        return settleCycleType;
    }

    public void setSettleCycleType(String settleCycleType) {
        this.settleCycleType = settleCycleType;
    }

    public Long getSettleMinAmount() {
        return settleMinAmount;
    }

    public void setSettleMinAmount(Long settleMinAmount) {
        this.settleMinAmount = settleMinAmount;
    }

    public String getForeignSeq() {
        return foreignSeq;
    }

    public void setForeignSeq(String foreignSeq) {
        this.foreignSeq = foreignSeq;
    }

    public Integer getSettNum() {
        return settNum;
    }

    public void setSettNum(Integer settNum) {
        this.settNum = settNum;
    }

    public String getTranMchNo() {
        return tranMchNo;
    }

    public void setTranMchNo(String tranMchNo) {
        this.tranMchNo = tranMchNo;
    }

    public String getTranMchId() {
        return tranMchId;
    }

    public void setTranMchId(String tranMchId) {
        this.tranMchId = tranMchId;
    }
}