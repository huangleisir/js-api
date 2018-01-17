package com.jst.prodution.merchant.model;

/**
 * 商户绑卡信息表
 * @author 吴安辉
 *
 */
public class MerchantBank implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String logId;				//记录ID
	private String userId;				//商户ID
	private String type;				//类型：1开户 2结算
	private String state;				//状态：1 正在使用 2未使用
	private String bankName;			//银行名称
	private String bankCode;			//银行编号
	private String bankCardNo;			//银行卡号
	private String openName;			//开户人姓名
	private String openProvince;		//开户银行所在省
	private String openCity;			//开户银行所在市
	private String openBranbank;		//开户银行支行名称
	private String creator;					//申请人
	private String createTime;				//申请时间
	private String updator;					//修改人
	private String updateTime;				//修改时间
    private String isDefault;           //1-默认,0-不是默认

    private String verifyFlag;          //0--未鉴权,1--已鉴权
    private String pbocPayno;
    private String bankPbocCode;        

    private String openCityCode;
    
    private String checkStatus;			//审核状态
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
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getOpenName() {
		return openName;
	}
	public void setOpenName(String openName) {
		this.openName = openName;
	}
	public String getOpenProvince() {
		return openProvince;
	}
	public void setOpenProvince(String openProvince) {
		this.openProvince = openProvince;
	}
	public String getOpenCity() {
		return openCity;
	}
	public void setOpenCity(String openCity) {
		this.openCity = openCity;
	}
	public String getOpenBranbank() {
		return openBranbank;
	}
	public void setOpenBranbank(String openBranbank) {
		this.openBranbank = openBranbank;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
    /**
     * @return the isDefault
     */
    public String getIsDefault() {
        return isDefault;
    }
    /**
     * @param isDefault the isDefault to set
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
    /**
     * @return the verifyFlag
     */
    public String getVerifyFlag() {
        return verifyFlag;
    }
    /**
     * @param verifyFlag the verifyFlag to set
     */
    public void setVerifyFlag(String verifyFlag) {
        this.verifyFlag = verifyFlag;
    }
    public String getPbocPayno() {
        return pbocPayno;
    }

    public void setPbocPayno(String pbocPayno) {
        this.pbocPayno = pbocPayno == null ? null : pbocPayno.trim();
    }
    /**
     * @return the bankPbocCode
     */
    public String getBankPbocCode() {
        return bankPbocCode;
    }
    /**
     * @param bankPbocCode the bankPbocCode to set
     */
    public void setBankPbocCode(String bankPbocCode) {
        this.bankPbocCode = bankPbocCode;
    }
    /**
     * @return the openCityCode
     */
    public String getOpenCityCode() {
        return openCityCode;
    }
    /**
     * @param openCityCode the openCityCode to set
     */
    public void setOpenCityCode(String openCityCode) {
        this.openCityCode = openCityCode;
    }
    /**
     * @return the checkStatus
     */
	public String getCheckStatus() {
		return checkStatus;
	}
	/**
     * @param checkStatus the openCityCode to set
     */
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
    
}
