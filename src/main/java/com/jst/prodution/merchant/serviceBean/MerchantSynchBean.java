package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantMoveLog;
import com.jst.prodution.merchant.model.MerchantSynch;

import java.util.List;

/**
 * Created by Administrator on 2017/9/15.
 */
public class MerchantSynchBean extends BaseBean{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mchntCd;
    private String mccCd;
    private String mchntNmCn;
    private String mchntEnNm;
    private String mchntAbbrCn;
    private String discAlgoIn;
    private String discRate;
    private String discCd;
    private String allotIn;
    private String hdrMchntCd;
    private String bankAcc;
    private String bankName;
    private String allotMchntCd;
    private String settltMchntCd;
    private String merType;
    private String payAccNo;
    private String payBankName;
    private String compCode;
    private String compName;
    private String bankAcchold;
    private String bankId;
    
    private MerchantMoveLog merchantMoveLog;

    List<MerchantSynch> merchantSynchList;

    public String getMchntCd() {
        return mchntCd;
    }

    public void setMchntCd(String mchntCd) {
        this.mchntCd = mchntCd;
    }

    public String getMccCd() {
        return mccCd;
    }

    public void setMccCd(String mccCd) {
        this.mccCd = mccCd;
    }

    public String getMchntNmCn() {
        return mchntNmCn;
    }

    public void setMchntNmCn(String mchntNmCn) {
        this.mchntNmCn = mchntNmCn;
    }

    public String getMchntEnNm() {
        return mchntEnNm;
    }

    public void setMchntEnNm(String mchntEnNm) {
        this.mchntEnNm = mchntEnNm;
    }

    public String getMchntAbbrCn() {
        return mchntAbbrCn;
    }

    public void setMchntAbbrCn(String mchntAbbrCn) {
        this.mchntAbbrCn = mchntAbbrCn;
    }

    public String getDiscAlgoIn() {
        return discAlgoIn;
    }

    public void setDiscAlgoIn(String discAlgoIn) {
        this.discAlgoIn = discAlgoIn;
    }

    public String getDiscRate() {
        return discRate;
    }

    public void setDiscRate(String discRate) {
        this.discRate = discRate;
    }

    public String getDiscCd() {
        return discCd;
    }

    public void setDiscCd(String discCd) {
        this.discCd = discCd;
    }

    public String getAllotIn() {
        return allotIn;
    }

    public void setAllotIn(String allotIn) {
        this.allotIn = allotIn;
    }

    public String getHdrMchntCd() {
        return hdrMchntCd;
    }

    public void setHdrMchntCd(String hdrMchntCd) {
        this.hdrMchntCd = hdrMchntCd;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAllotMchntCd() {
        return allotMchntCd;
    }

    public void setAllotMchntCd(String allotMchntCd) {
        this.allotMchntCd = allotMchntCd;
    }

    public String getSettltMchntCd() {
        return settltMchntCd;
    }

    public void setSettltMchntCd(String settltMchntCd) {
        this.settltMchntCd = settltMchntCd;
    }

    public String getMerType() {
        return merType;
    }

    public void setMerType(String merType) {
        this.merType = merType;
    }

    public String getPayAccNo() {
        return payAccNo;
    }

    public void setPayAccNo(String payAccNo) {
        this.payAccNo = payAccNo;
    }

    public String getPayBankName() {
        return payBankName;
    }

    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName;
    }

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getBankAcchold() {
        return bankAcchold;
    }

    public void setBankAcchold(String bankAcchold) {
        this.bankAcchold = bankAcchold;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public List<MerchantSynch> getMerchantSynchList() {
        return merchantSynchList;
    }

    public void setMerchantSynchList(List<MerchantSynch> merchantSynchList) {
        this.merchantSynchList = merchantSynchList;
    }

	public MerchantMoveLog getMerchantMoveLog() {
		return merchantMoveLog;
	}

	public void setMerchantMoveLog(MerchantMoveLog merchantMoveLog) {
		this.merchantMoveLog = merchantMoveLog;
	}
}
