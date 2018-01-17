package com.jst.prodution.merchant.model;

import java.util.Date;

/**
 * 商户结算信息表
 * @author Administrator
 *
 */
public class MerchantSettlement implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String logId;						//记录ID
	private String userId;						//商户ID
	private String type;						//类型：1结算
	private String state;						//状态：1 正在使用 2未使用
	private String settlementType;				//结算方向  1--结算到银行卡2--结算到余额
	private String cycle;						//结算周期
	private String rate;						//结算费率
	private String rateCycle;					//结算费率周期
	private String contactName;					//结算联系人姓名
	private String contactTel;					//结算联系人电话
	private String contactEmail;				//结算联系人邮箱
	private String creator;						//申请人
	private Date createTime;					//申请时间
	private String updator;						//修改人
	private Date updateTime;					//修改时间
	
	private String feeInOut;                    //结算类型 01-交易内收费，02-交易外收费

	private String settleCycleType;    //结算方式 'N:T+N,W:周结,M:月结,HM:半月结

    private Long settleMinAmount;   //'结算起始金额'

    private Integer settleMaxCycle;//结算最长周期

    private String settleByFestv;	//是否跨节假日，Y-是,N-否
    
    private String reviewState;                     //审核状态(0待审核,1审核通过 2驳回 3 不通过)
    private String reviewLog;                    //审核记录
	private String isSettle;                     //是否二清清算（0-否，1-是）

	private String isMatch;                    //是否二清对账（0-否，1-是）
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSettlementType() {
		return settlementType;
	}
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRateCycle() {
		return rateCycle;
	}
	public void setRateCycle(String rateCycle) {
		this.rateCycle = rateCycle;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	
    public String getFeeInOut() {
        return feeInOut;
    }
    
    public void setFeeInOut(String feeInOut) {
        this.feeInOut = feeInOut == null ? null : feeInOut.trim();
    }
    public String getSettleCycleType() {
        return settleCycleType;
    }
    public void setSettleCycleType(String settleCycleType) {
        this.settleCycleType = settleCycleType;
    }
    public Long getSettleMinAmount() {
        return settleMinAmount;
    }
    public void setSettleMinAmount(Long settleMinAmount) {
        this.settleMinAmount = settleMinAmount;
    }
    public Integer getSettleMaxCycle() {
        return settleMaxCycle;
    }
    public void setSettleMaxCycle(Integer settleMaxCycle) {
        this.settleMaxCycle = settleMaxCycle;
    }
    public String getSettleByFestv() {
        return settleByFestv;
    }
    public void setSettleByFestv(String settleByFestv) {
        this.settleByFestv = settleByFestv;
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

    public String getContactTel() {
        return contactTel;
    }
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }
    public String getReviewState() {
        return reviewState;
    }
    public void setReviewState(String reviewState) {
        this.reviewState = reviewState;
    }
    public String getReviewLog() {
        return reviewLog;
    }
    public void setReviewLog(String reviewLog) {
        this.reviewLog = reviewLog;
    }
	public String getIsSettle() {
		return isSettle;
	}

	public void setIsSettle(String isSettle) {
		this.isSettle = isSettle;
	}

	public String getIsMatch() {
		return isMatch;
	}

	public void setIsMatch(String isMatch) {
		this.isMatch = isMatch;
	}
}
