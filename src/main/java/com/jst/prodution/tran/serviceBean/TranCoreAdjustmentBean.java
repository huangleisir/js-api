package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreAdjustmentBean extends BaseBean {
	
    private static final long serialVersionUID = 1L;

    private String busNo;   //交易流水号   必输

    private String approveState;   //审批状态  0：审批通过  1:审批拒绝

    private String approvUserId;	//审批人会员标识       可输

    private String approvUserName;  //审批人姓名            可输

    private String remark;             //备注        可输

    //输出
    private String state;             //备注    

    private String errorMsg;			// 调账错误信息  

    
	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getApproveState() {
		return approveState;
	}

	public void setApproveState(String approveState) {
		this.approveState = approveState;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getApprovUserId() {
		return approvUserId;
	}

	public void setApprovUserId(String approvUserId) {
		this.approvUserId = approvUserId;
	}

	public String getApprovUserName() {
		return approvUserName;
	}

	public void setApprovUserName(String approvUserName) {
		this.approvUserName = approvUserName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}