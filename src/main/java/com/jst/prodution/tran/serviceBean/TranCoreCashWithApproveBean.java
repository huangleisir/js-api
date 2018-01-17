package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreCashWithApproveBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String busNo;			//订单号	  	交易产生的订单号			必输	
	private String approveStatus;	//审批结果  	2-审批通过，4-审批拒绝	必输
	private String sourceFrom;      //业务来源                                                                          必输
	private String operUser;		//操作人	  						可输
	private String remark;			//备注	  						可输	
	        
	

	/**
	 * @return the sourceFrom
	 */
	public String getSourceFrom() {
		return sourceFrom;
	}
	/**
	 * @param sourceFrom the sourceFrom to set
	 */
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}

	/**
	 * @return the busNo
	 */
	public String getBusNo() {
		return busNo;
	}
	/**
	 * @param busNo the busNo to set
	 */
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	/**
	 * @return the approveStatus
	 */
	public String getApproveStatus() {
		return approveStatus;
	}
	/**
	 * @param approveStatus the approveStatus to set
	 */
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	/**
	 * @return the operUser
	 */
	public String getOperUser() {
		return operUser;
	}
	/**
	 * @param operUser the operUser to set
	 */
	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
