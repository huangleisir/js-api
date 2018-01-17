package com.jst.prodution.tran.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
* @ClassName: TranOfflineIncorrectSupplementOrderBean 
* @Description: TODO(线下待补登订单) 
* @author  
* @date 2017年11月13日 下午5:35:30 
*
 */
public class TranCoreOfflineIncorrectSupplementQueryListBean extends BaseBean{

	private static final long serialVersionUID = 1L;

	private String busNo;

    private String merchantNo;

    private String payPartCode;

    private String transSsn;

    private String mchntCode;

    private Integer transDate;

    private String transTime;

    private String transType;

    private String transName;

    private String acqOrderNo;

    private String payOrderNo;

    private String orderCreateTime;

    private String productName;

    private Long transAmt;

    private Long discAmt;

    private Long totalAmt;

    private String transCurrCd;

    private String transSt;

    private String refundSt;

    private String acqRefundNo;

    private String payRefundNo;

    private Integer supplementState;
       
    private String errorMsg;

    private String createUser;

    private String updateUser;
    
    private String startTransDate;
    
    private String endTransDate;

    private Date createTime;//创建时间
    
    private Date updateTime;//修改时间
    
    private Long transAmtSum;//订单金额汇总
    
    private Long discAmtSum;//优惠金额汇总
    
    private Long totalAmtSum;//实际支付金额汇总
    
    List<TranCoreOfflineIncorrectSupplementQueryListBean> tranCoreOfflineIncorrectSupplementList;

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getPayPartCode() {
		return payPartCode;
	}

	public void setPayPartCode(String payPartCode) {
		this.payPartCode = payPartCode;
	}

	public String getTransSsn() {
		return transSsn;
	}

	public void setTransSsn(String transSsn) {
		this.transSsn = transSsn;
	}

	public String getMchntCode() {
		return mchntCode;
	}

	public void setMchntCode(String mchntCode) {
		this.mchntCode = mchntCode;
	}

	public Integer getTransDate() {
		return transDate;
	}

	public void setTransDate(Integer transDate) {
		this.transDate = transDate;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTransName() {
		return transName;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}

	public String getAcqOrderNo() {
		return acqOrderNo;
	}

	public void setAcqOrderNo(String acqOrderNo) {
		this.acqOrderNo = acqOrderNo;
	}

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public String getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(Long transAmt) {
		this.transAmt = transAmt;
	}

	public Long getDiscAmt() {
		return discAmt;
	}

	public void setDiscAmt(Long discAmt) {
		this.discAmt = discAmt;
	}

	public Long getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(Long totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getTransCurrCd() {
		return transCurrCd;
	}

	public void setTransCurrCd(String transCurrCd) {
		this.transCurrCd = transCurrCd;
	}

	public String getTransSt() {
		return transSt;
	}

	public void setTransSt(String transSt) {
		this.transSt = transSt;
	}

	public String getRefundSt() {
		return refundSt;
	}

	public void setRefundSt(String refundSt) {
		this.refundSt = refundSt;
	}

	public String getAcqRefundNo() {
		return acqRefundNo;
	}

	public void setAcqRefundNo(String acqRefundNo) {
		this.acqRefundNo = acqRefundNo;
	}

	public String getPayRefundNo() {
		return payRefundNo;
	}

	public void setPayRefundNo(String payRefundNo) {
		this.payRefundNo = payRefundNo;
	}

	public Integer getSupplementState() {
		return supplementState;
	}

	public void setSupplementState(Integer supplementState) {
		this.supplementState = supplementState;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	public String getStartTransDate() {
		return startTransDate;
	}

	public void setStartTransDate(String startTransDate) {
		this.startTransDate = startTransDate;
	}

	public String getEndTransDate() {
		return endTransDate;
	}

	public void setEndTransDate(String endTransDate) {
		this.endTransDate = endTransDate;
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
	
	public Long getTransAmtSum() {
		return transAmtSum;
	}

	public void setTransAmtSum(Long transAmtSum) {
		this.transAmtSum = transAmtSum;
	}

	public Long getDiscAmtSum() {
		return discAmtSum;
	}

	public void setDiscAmtSum(Long discAmtSum) {
		this.discAmtSum = discAmtSum;
	}

	public Long getTotalAmtSum() {
		return totalAmtSum;
	}

	public void setTotalAmtSum(Long totalAmtSum) {
		this.totalAmtSum = totalAmtSum;
	}

	public List<TranCoreOfflineIncorrectSupplementQueryListBean> getTranCoreOfflineIncorrectSupplementList() {
		return tranCoreOfflineIncorrectSupplementList;
	}

	public void setTranCoreOfflineIncorrectSupplementList(
			List<TranCoreOfflineIncorrectSupplementQueryListBean> tranCoreOfflineIncorrectSupplementList) {
		this.tranCoreOfflineIncorrectSupplementList = tranCoreOfflineIncorrectSupplementList;
	}
   
}
