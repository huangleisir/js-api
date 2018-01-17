package com.jst.prodution.settlement.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.settlement.model.SettBalanceOrder;

import java.util.List;

/**
 * Created by Administrator on 2017/11/23.
 */
public class ReviewSettlementOrderBean extends BaseBean {

    private static final long serialVersionUID = 1L;

    private String settAmountType;//结算金额来源

    private Integer settlementDateStart;//结算日期
    private Integer settlementDateEnd;//结算日期
    private Long settAmount;//结算金额

    private String inMchNo;//商户号
    private String  inMchName;//商户名称

    private String settStatus;//结算状态

    private String reviewStatus;//结算审核状态

    private   Long settAmountTot;//结算金额汇总
    private   Long tranAmountTot;//交易金额汇总
    private   Long feeAmountTot;//手续费金额汇总
    private List<SettBalanceOrder> lstSettBalanceOrder;

    public String getSettAmountType() {
        return settAmountType;
    }

    public void setSettAmountType(String settAmountType) {
        this.settAmountType = settAmountType;
    }


    public Long getSettAmount() {
        return settAmount;
    }

    public void setSettAmount(Long settAmount) {
        this.settAmount = settAmount;
    }


    public String getSettStatus() {
        return settStatus;
    }

    public void setSettStatus(String settStatus) {
        this.settStatus = settStatus;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public List<SettBalanceOrder> getLstSettBalanceOrder() {
        return lstSettBalanceOrder;
    }

    public void setLstSettBalanceOrder(List<SettBalanceOrder> lstSettBalanceOrder) {
        this.lstSettBalanceOrder = lstSettBalanceOrder;
    }


    public Integer getSettlementDateStart() {
        return settlementDateStart;
    }

    public void setSettlementDateStart(Integer settlementDateStart) {
        this.settlementDateStart = settlementDateStart;
    }

    public Integer getSettlementDateEnd() {
        return settlementDateEnd;
    }

    public void setSettlementDateEnd(Integer settlementDateEnd) {
        this.settlementDateEnd = settlementDateEnd;
    }

    public String getInMchName() {
        return inMchName;
    }

    public void setInMchName(String inMchName) {
        this.inMchName = inMchName;
    }

    public String getInMchNo() {
        return inMchNo;
    }

    public void setInMchNo(String inMchNo) {
        this.inMchNo = inMchNo;
    }

    public Long getSettAmountTot() {
        return settAmountTot;
    }

    public void setSettAmountTot(Long settAmountTot) {
        this.settAmountTot = settAmountTot;
    }

    public Long getTranAmountTot() {
        return tranAmountTot;
    }

    public void setTranAmountTot(Long tranAmountTot) {
        this.tranAmountTot = tranAmountTot;
    }

    public Long getFeeAmountTot() {
        return feeAmountTot;
    }

    public void setFeeAmountTot(Long feeAmountTot) {
        this.feeAmountTot = feeAmountTot;
    }
}
