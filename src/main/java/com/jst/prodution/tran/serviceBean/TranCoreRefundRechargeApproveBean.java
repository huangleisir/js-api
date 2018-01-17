package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 充值订单退款审批bean
 * @author 汤广海
 *
 */

public class TranCoreRefundRechargeApproveBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String busNo;//退款交易流水号
	private Long refundAmount;//退款金额
    private String approveDescription;//审批原因
    private Integer approveStatus;//审批状态:0-通过,1-不通过,2-不通过
    private String createUser;
    private String updateUser;//审批人
    private Date createTime;
    private Date updateTime;
    
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public Long getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getApproveDescription() {
		return approveDescription;
	}
	public void setApproveDescription(String approveDescription) {
		this.approveDescription = approveDescription;
	}
	public Integer getApproveStatus() {
		return approveStatus;
	}
	public void setApproveStatus(Integer approveStatus) {
		this.approveStatus = approveStatus;
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
    
}
