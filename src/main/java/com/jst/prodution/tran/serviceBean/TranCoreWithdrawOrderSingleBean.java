package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreWithdrawOrderSingleBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	//input
    private String busNo;
    //out
    private String state;

    private Integer tranAmout;

    private Integer tranFee;

    private String tranDate;

    private String bankAcctNo;

    private String bankAcctNoS;

    private String sourceFrom;

    private String approveStatus;

    private String approveRemark;
    

    private String frozenId;

    private String acctId;

    private String userId;

    private String userName;

    private String acctType;

    private String callType;

    private String writeoffFlag;

    private String linkPayNo;

    private String remark;

    private String createUser;

    private String updateUser;

    private String createTime;

    private String updateTime;
    
    private String bankName;
    
    private String payResult;
    
    private String bankPayId;  //银行处理流水

    private String payReturnTime;
	private Integer availableBalance;			//可提现金额 					必输
	private String applyTime;			//发起时间  					必输
    private String payTime;      //支付时间
	private String isFreePwd;			//是否支持免密（密文） 	0：是 1：否				必输
	private String userType;			//会员类型 （C：C用户，B：商户）					必输
	private String bankSign;		//银行账号  所属行号	必输
    private String frozenTime;      //冻结更新时间, 账户系统返回的冻结时间      
    private String frozenErrorMsg;      //冻结失败原因
    private String postPayCoreTime;      //发送付款中心（通道）时间
    private String payCoreErrorMsg;      //发送付款中心错误信息
    private String payCoreResult;      //付款中心（通道）处理结果 默认为空 Y-成功  N-失败
   

    public String getBankPayId() {
		return bankPayId;
	}

	public void setBankPayId(String bankPayId) {
		this.bankPayId = bankPayId;
	}

	public String getPayResult() {
		return payResult;
	}

	public void setPayResult(String payResult) {
		this.payResult = payResult;
	}

	public String getPayReturnTime() {
		return payReturnTime;
	}

	public void setPayReturnTime(String payReturnTime) {
		this.payReturnTime = payReturnTime;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
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

	public String getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	public String getFrozenTime() {
		return frozenTime;
	}

	public void setFrozenTime(String frozenTime) {
		this.frozenTime = frozenTime;
	}

	public String getPostPayCoreTime() {
		return postPayCoreTime;
	}

	public void setPostPayCoreTime(String postPayCoreTime) {
		this.postPayCoreTime = postPayCoreTime;
	}

	public Integer getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(Integer availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getIsFreePwd() {
		return isFreePwd;
	}

	public void setIsFreePwd(String isFreePwd) {
		this.isFreePwd = isFreePwd;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getBankSign() {
		return bankSign;
	}

	public void setBankSign(String bankSign) {
		this.bankSign = bankSign;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getFrozenErrorMsg() {
		return frozenErrorMsg;
	}

	public void setFrozenErrorMsg(String frozenErrorMsg) {
		this.frozenErrorMsg = frozenErrorMsg;
	}

	public String getPayCoreErrorMsg() {
		return payCoreErrorMsg;
	}

	public void setPayCoreErrorMsg(String payCoreErrorMsg) {
		this.payCoreErrorMsg = payCoreErrorMsg;
	}

	public String getPayCoreResult() {
		return payCoreResult;
	}

	public void setPayCoreResult(String payCoreResult) {
		this.payCoreResult = payCoreResult;
	}

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

    public Integer getTranAmout() {
        return tranAmout;
    }

    public void setTranAmout(Integer tranAmout) {
        this.tranAmout = tranAmout;
    }

    public Integer getTranFee() {
        return tranFee;
    }

    public void setTranFee(Integer tranFee) {
        this.tranFee = tranFee;
    }

    public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getBankAcctNo() {
        return bankAcctNo;
    }

    public void setBankAcctNo(String bankAcctNo) {
        this.bankAcctNo = bankAcctNo == null ? null : bankAcctNo.trim();
    }

    public String getBankAcctNoS() {
        return bankAcctNoS;
    }

    public void setBankAcctNoS(String bankAcctNoS) {
        this.bankAcctNoS = bankAcctNoS == null ? null : bankAcctNoS.trim();
    }

    public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus == null ? null : approveStatus.trim();
    }

    public String getApproveRemark() {
        return approveRemark;
    }

    public void setApproveRemark(String approveRemark) {
        this.approveRemark = approveRemark == null ? null : approveRemark.trim();
    }

    public String getFrozenId() {
        return frozenId;
    }

    public void setFrozenId(String frozenId) {
        this.frozenId = frozenId == null ? null : frozenId.trim();
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId == null ? null : acctId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType == null ? null : callType.trim();
    }

    public String getWriteoffFlag() {
        return writeoffFlag;
    }

    public void setWriteoffFlag(String writeoffFlag) {
        this.writeoffFlag = writeoffFlag == null ? null : writeoffFlag.trim();
    }

    public String getLinkPayNo() {
        return linkPayNo;
    }

    public void setLinkPayNo(String linkPayNo) {
        this.linkPayNo = linkPayNo == null ? null : linkPayNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

}