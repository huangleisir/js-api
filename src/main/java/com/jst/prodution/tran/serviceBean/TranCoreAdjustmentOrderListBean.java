package com.jst.prodution.tran.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreAdjustmentOrderListBean extends BaseBean {

	private String busNo;   //输出    交易流水号

	private String state;   //输出     订单状态  0:成功1:待审核，2:审批拒绝，3: 失败
	    
	private String busType;   //业务类型：1：线下调账   2:线上转账     
    
    private String outMemberId;   //转出会员标识           
 
    private String outMemberName; //转出会员名称          
    
    private String sourceFrom;			//业务来源    0：B门户，1：商户后台，2：OMS   

    private String outAccountId;  //转出账户号           

    private String inMemberId;    //转入会员标识             

    private String inMemberName;  //转入会员名称           

    private String inAccountId;	  //转出账户号           

    private String approvUserId;	//审批人会员标识       

    private String approvUserName;  //审批人姓名          

    private String merchantExtenalNo; //外部订单号         

    private Long tranAmount;       //交易金额           

    private String orderName;			//订单名称        

    private String orderDes;			//订单描述        

    private String remark;             //备注        

    private String errorMsg;			// 调账错误信息  

    private String createUser;			//创建人（系统默认“99”，其它为运营人员ID号）

    private String updateUser; 			// 最后更新人 

    private String createTime;			// 创建时间

    private String updateTime;			// 最后更新时间 
    
    private Long tranAmountSum;         //交易金额汇总

    private List<TranCoreAdjustmentOrderListBean> tranCoreAdjustmentOrderList;

    private static final long serialVersionUID = 1L;

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo == null ? null : busNo.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType == null ? null : busType.trim();
    }

    public String getOutMemberId() {
        return outMemberId;
    }

    public void setOutMemberId(String outMemberId) {
        this.outMemberId = outMemberId == null ? null : outMemberId.trim();
    }

    public String getOutMemberName() {
        return outMemberName;
    }

    public void setOutMemberName(String outMemberName) {
        this.outMemberName = outMemberName == null ? null : outMemberName.trim();
    }

    public String getOutAccountId() {
        return outAccountId;
    }

    public void setOutAccountId(String outAccountId) {
        this.outAccountId = outAccountId == null ? null : outAccountId.trim();
    }

    public String getInMemberId() {
        return inMemberId;
    }

    public void setInMemberId(String inMemberId) {
        this.inMemberId = inMemberId == null ? null : inMemberId.trim();
    }

    public String getInMemberName() {
        return inMemberName;
    }

    public void setInMemberName(String inMemberName) {
        this.inMemberName = inMemberName == null ? null : inMemberName.trim();
    }

    public String getInAccountId() {
        return inAccountId;
    }

    public void setInAccountId(String inAccountId) {
        this.inAccountId = inAccountId == null ? null : inAccountId.trim();
    }

    public String getApprovUserId() {
        return approvUserId;
    }

    public void setApprovUserId(String approvUserId) {
        this.approvUserId = approvUserId == null ? null : approvUserId.trim();
    }

    public String getApprovUserName() {
        return approvUserName;
    }

    public void setApprovUserName(String approvUserName) {
        this.approvUserName = approvUserName == null ? null : approvUserName.trim();
    }

    public String getMerchantExtenalNo() {
        return merchantExtenalNo;
    }

    public void setMerchantExtenalNo(String merchantExtenalNo) {
        this.merchantExtenalNo = merchantExtenalNo == null ? null : merchantExtenalNo.trim();
    }

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(String orderDes) {
        this.orderDes = orderDes == null ? null : orderDes.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
    
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Long getTranAmountSum() {
		return tranAmountSum;
	}

	public void setTranAmountSum(Long tranAmountSum) {
		this.tranAmountSum = tranAmountSum;
	}

	public List<TranCoreAdjustmentOrderListBean> getTranCoreAdjustmentOrderList() {
		return tranCoreAdjustmentOrderList;
	}

	public void setTranCoreAdjustmentOrderList(List<TranCoreAdjustmentOrderListBean> tranCoreAdjustmentOrderList) {
		this.tranCoreAdjustmentOrderList = tranCoreAdjustmentOrderList;
	}
    
}