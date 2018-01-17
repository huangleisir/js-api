package com.jst.prodution.accountant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcntAccountingBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	// 会计主体
	public static final String ACNTPARTNO_JST = "ZT00000001";
	// 分录事件码
	public static final String ACNT_ENTRYCODE_RECHARGE = "FLSJ00001";// 用户充值
	public static final String ACNT_ENTRYCODE_JST_RECHARGE = "FLSJ00022";// 预付卡充值

	public static final String ACNT_ENTRYCODE_RECHARGE_CLEAR= "FLSJ00002";// 充值清算
	public static final String ACNT_ENTRYCODE_WITHDRAW= "FLSJ00003";// 提现
	public static final String ACNT_ENTRYCODE_SETTLEMENT= "FLSJ00004";// 结算
	public static final String ACNT_ENTRYCODE_PAYMENT= "FLSJ00005";// 余额支付
	public static final String ACNT_ENTRYCODE_TRANSFER= "FLSJ00006";// 余额转账
	public static final String ACNT_ENTRYCODE_TOPAY = "FLSJ00021";// 代付(出款)
	public static final String ACNT_ENTRYCODE_TOPAY_CHNREFUND = "FLSJ00008";// 通道退款(出款)
	public static final String ACNT_ENTRYCODE_TOPAY_ACCTREFUND = "FLSJ00023";// 余额退款(出款)
	
	public static final String ACNT_ENTRYCODE_TOCOLLECTION = "FLSJ00020";// 代扣(收款)
	public static final String ACNT_ENTRYCODE_QRPAY = "FLSJ00022";// 微信扫码支付
	
	public static final String ACNT_ENTRYCODE_KM_ADD = "FLSJ00009";// 代扣长款
	public static final String ACNT_ENTRYCODE_KM_WRITEOFFS = "FLSJ00010";// 代扣长款冲销
	public static final String ACNT_ENTRYCODE_SW_ADD = "FLSJ00012";// 代扣短款
	public static final String ACNT_ENTRYCODE_SW_WRITEOFFS = "FLSJ00013";// 代扣短款冲销
	public static final String ACNT_ENTRYCODE_LP_ADD = "FLSJ00015";// 代付长款
	public static final String ACNT_ENTRYCODE_LP_WRITEOFFS = "FLSJ00016";// 代付长款冲销
	public static final String ACNT_ENTRYCODE_SP_ADD = "FLSJ00018";// 代付短款
	public static final String ACNT_ENTRYCODE_SP_WRITEOFFS = "FLSJ00016";// 代付短款冲销

	private String busNo;				//交易流水号	必输
	private String payNo;				//支付流水号	必输
	private String sysFrom;				//系统来源	必输
	private String dAcctId;				// 借方账号
  
	private String cAcctId;             //贷方账号 

	private String acctName;			// 账户名称,账户真实姓名 必输
	private String acctType;			// 账户类型(01-基本户) 必输
	private String busTranType;			//业务类型	必输
	private String acntPartNo;			//会计主体	必输
	private String entryCode;			//分录事件码	必输
	private String dFacor1;				//借方影响因数1	必输
	private String dFacor2;				//借方影响因数2	必输
	private String cFacor1;       		//贷方影响因数1	必输
	private String cFacor2;				//贷方影响因数2	必输
	private Integer busTransDate;		//交易日期	必输
	private Long tranAmount;			//交易金额	必输
	private String remark;				//备注	可输
	private String acnNo;				//会计流水号	输出
	
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getSysFrom() {
		return sysFrom;
	}
	public void setSysFrom(String sysFrom) {
		this.sysFrom = sysFrom;
	}
	/**
     * @return the dAcctId
     */
    public String getdAcctId() {
        return dAcctId;
    }
    /**
     * @param dAcctId the dAcctId to set
     */
    public void setdAcctId(String dAcctId) {
        this.dAcctId = dAcctId;
    }
    /**
     * @return the cAcctId
     */
    public String getcAcctId() {
        return cAcctId;
    }
    /**
     * @param cAcctId the cAcctId to set
     */
    public void setcAcctId(String cAcctId) {
        this.cAcctId = cAcctId;
    }
    public String getBusTranType() {
		return busTranType;
	}
	public void setBusTranType(String busTranType) {
		this.busTranType = busTranType;
	}
	public String getAcntPartNo() {
		return acntPartNo;
	}
	public void setAcntPartNo(String acntPartNo) {
		this.acntPartNo = acntPartNo;
	}
	public String getEntryCode() {
		return entryCode;
	}
	public void setEntryCode(String entryCode) {
		this.entryCode = entryCode;
	}
	public String getdFacor1() {
		return dFacor1;
	}
	public void setdFacor1(String dFacor1) {
		this.dFacor1 = dFacor1;
	}
	public String getdFacor2() {
		return dFacor2;
	}
	public void setdFacor2(String dFacor2) {
		this.dFacor2 = dFacor2;
	}
	public String getcFacor1() {
		return cFacor1;
	}
	public void setcFacor1(String cFacor1) {
		this.cFacor1 = cFacor1;
	}
	public String getcFacor2() {
		return cFacor2;
	}
	public void setcFacor2(String cFacor2) {
		this.cFacor2 = cFacor2;
	}
	public Integer getBusTransDate() {
		return busTransDate;
	}
	public void setBusTransDate(Integer busTransDate) {
		this.busTransDate = busTransDate;
	}
	public Long getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAcnNo() {
		return acnNo;
	}
	public void setAcnNo(String acnNo) {
		this.acnNo = acnNo;
	}
    public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	
}
