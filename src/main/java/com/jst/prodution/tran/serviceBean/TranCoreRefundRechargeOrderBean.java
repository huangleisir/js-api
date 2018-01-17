package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 充值订单退款bean
 * @author ningxuzhou
 *
 */

public class TranCoreRefundRechargeOrderBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String originBusNo;//充值订单交易流水号
	private Long refundAmount;//退款金额
	private String createUser;//创建人
	private String remark;//
	public String getOriginBusNo() {
		return originBusNo;
	}
	public void setOriginBusNo(String originBusNo) {
		this.originBusNo = originBusNo;
	}
	public Long getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
