package com.jst.prodution.tran.serviceBean;
import java.util.List;

/**
 * 对应卡系统中的交易记录
 * B门户里交易记录中的卡交易
 */
import com.jst.prodution.base.bean.BaseBean;

public class CardTransactionBean extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logId ;// 记录id号
	private String userId ;// 用户号
	private String merchantId;//商户号
	private String txndate ;//交易日期,1
	private String txntime ;//交易具体时间,2
	private String termbatchno;//批次号3
	private String refKey;//参考号(凭证号)4
	private String termseq;//流水号5
	private String productnodesc; //卡产品6
	private String cardno ;//交易卡号,7
	private String inntype;//交易类型代码8
	private String errorDesc ;//交易结果描述,9
	private String beforeAmt; //交易前余额(元)10
	private String txnamt ;//交易金额,11
	private String afterAmt; //交易后余额(元)12
	private String txnmchntname;//商户名13s
	private String txnmchntcd ;//卡系统商户号14
	private String termid ;//终端号,15
	private String settdate;//中心结算日期16
	private String transCate;//交易流水类别17
	private String revsalFlag;// 冲正标志,18
	private String cancelFlag;// 撤销标志,19
	private String returnFlag;// 退货标志20
	private String orderNo;//商品订单号21

	private String txndesc ;//交易类型,8
	private String errcode ;//交易结果代码,
	
	private Long txnamtSum;//交易总金额
	private String txnChannel; //支付渠道
	
	private List<CardTransactionBean> cardTransactionList;
	
	public String getLogId() {
        return logId;
    }
    public void setLogId(String logId) {
        this.logId = logId;
    }
    public String getTxnmchntname() {
		return txnmchntname;
	}
	public void setTxnmchntname(String txnmchntname) {
		this.txnmchntname = txnmchntname;
	}
	public String getRefKey() {
		return refKey;
	}
	public void setRefKey(String refKey) {
		this.refKey = refKey;
	}
	public String getTransCate() {
		return transCate;
	}
	public void setTransCate(String transCate) {
		this.transCate = transCate;
	}
	public String getReturnFlag() {
		return returnFlag;
	}
	public void setReturnFlag(String returnFlag) {
		this.returnFlag = returnFlag;
	}
	public String getSettdate() {
		return settdate;
	}
	public void setSettdate(String settdate) {
		this.settdate = settdate;
	}
	public String getTermbatchno() {
		return termbatchno;
	}
	public void setTermbatchno(String termbatchno) {
		this.termbatchno = termbatchno;
	}
	public String getTermseq() {
		return termseq;
	}
	public void setTermseq(String termseq) {
		this.termseq = termseq;
	}
	public String getBeforeAmt() {
		return beforeAmt;
	}
	public void setBeforeAmt(String beforeAmt) {
		this.beforeAmt = beforeAmt;
	}
	public String getAfterAmt() {
		return afterAmt;
	}
	public void setAfterAmt(String afterAmt) {
		this.afterAmt = afterAmt;
	}
	public String getProductnodesc() {
		return productnodesc;
	}
	public void setProductnodesc(String productnodesc) {
		this.productnodesc = productnodesc;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Long getTxnamtSum() {
		return txnamtSum;
	}
	public void setTxnamtSum(Long txnamtSum) {
		this.txnamtSum = txnamtSum;
	}
	public String getInntype() {
		return inntype;
	}
	public void setInntype(String inntype) {
		this.inntype = inntype;
	}

	public String getUserId() {
		return userId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTxndesc() {
		return txndesc;
	}
	public void setTxndesc(String txndesc) {
		this.txndesc = txndesc;
	}
	public String getTxndate() {
		return txndate;
	}
	public void setTxndate(String txndate) {
		this.txndate = txndate;
	}
	public String getTxntime() {
		return txntime;
	}
	public void setTxntime(String txntime) {
		this.txntime = txntime;
	}
	public String getTxnmchntcd() {
		return txnmchntcd;
	}
	public void setTxnmchntcd(String txnmchntcd) {
		this.txnmchntcd = txnmchntcd;
	}
	public String getTermid() {
		return termid;
	}
	public void setTermid(String termid) {
		this.termid = termid;
	}
	public String getTxnamt() {
		return txnamt;
	}
	public void setTxnamt(String txnamt) {
		this.txnamt = txnamt;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getRevsalFlag() {
		return revsalFlag;
	}
	public void setRevsalFlag(String revsalFlag) {
		this.revsalFlag = revsalFlag;
	}
	public String getCancelFlag() {
		return cancelFlag;
	}
	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTxnChannel() {
        return txnChannel;
    }
    public void setTxnChannel(String txnChannel) {
        this.txnChannel = txnChannel;
    }
    public List<CardTransactionBean> getCardTransactionList() {
		return cardTransactionList;
	}

	public void setCardTransactionList(List<CardTransactionBean> cardTransactionList) {
		this.cardTransactionList = cardTransactionList;
	}
    @Override
    public String toString() {
        return "CardTransactionBean [logId=" + logId + ", userId=" + userId + ", merchantId=" + merchantId
                + ", txndate=" + txndate + ", txntime=" + txntime + ", termbatchno=" + termbatchno + ", refKey="
                + refKey + ", termseq=" + termseq + ", productnodesc=" + productnodesc + ", cardno=" + cardno
                + ", inntype=" + inntype + ", errorDesc=" + errorDesc + ", beforeAmt=" + beforeAmt + ", txnamt="
                + txnamt + ", afterAmt=" + afterAmt + ", txnmchntname=" + txnmchntname + ", txnmchntcd=" + txnmchntcd
                + ", termid=" + termid + ", settdate=" + settdate + ", transCate=" + transCate + ", revsalFlag="
                + revsalFlag + ", cancelFlag=" + cancelFlag + ", returnFlag=" + returnFlag + ", orderNo=" + orderNo
                + ", txndesc=" + txndesc + ", errcode=" + errcode + ", txnamtSum=" + txnamtSum + "]";
    }
	
	
}
