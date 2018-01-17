package com.jst.prodution.tran.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
* @ClassName: TranCoreOfflineSupplementQueryListBean 
* @Description: TODO(线下补登记对外暴露查询实体类) 
* @author 曾传保 
* @date 2017年10月30日 上午10:38:36 
*
 */
public class TranCoreOfflineSupplementQueryListBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	
	private String acqOrderNo;//受理方订单号
	
	private String payPartCode;//支付机构代码
	
	private String transType;//交易类型
	
	private String startTransDate;//交易日期开始时间
	
	private String endTransDate;//交易日期结束时间
	
	private Long transAmtSum;//订单金额汇总
 	
    private Long discAmtSum;//优惠金额汇总
    
    private Long totalAmtSum;//实际支付金额汇总
	
	private List<TranCoreOfflineSupplementBean> tranCoreOfflineSupplementList;

	public String getAcqOrderNo() {
		return acqOrderNo;
	}

	public void setAcqOrderNo(String acqOrderNo) {
		this.acqOrderNo = acqOrderNo;
	}

	public String getPayPartCode() {
		return payPartCode;
	}

	public void setPayPartCode(String payPartCode) {
		this.payPartCode = payPartCode;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
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

	public List<TranCoreOfflineSupplementBean> getTranCoreOfflineSupplementList() {
		return tranCoreOfflineSupplementList;
	}

	public void setTranCoreOfflineSupplementList(List<TranCoreOfflineSupplementBean> tranCoreOfflineSupplementList) {
		this.tranCoreOfflineSupplementList = tranCoreOfflineSupplementList;
	}
}
