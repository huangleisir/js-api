package com.jst.prodution.settlement.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.settlement.model.TransCode;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */
public class TransCodeBean extends BaseBean {

    private static final long serialVersionUID = 1L;
    private String transCode;

    private String transName;

    private String isSettle;

    private String acqDcFlag;

    private String payDcFlag;

    private String feeDirIn;

    private String settleType;

    private String creator;

    private Date createTime;

    private String updator;

    private Date updateTime;
    
    private List<TransCode> transCodeList;

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getTransName() {
		return transName;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}

	public String getIsSettle() {
		return isSettle;
	}

	public void setIsSettle(String isSettle) {
		this.isSettle = isSettle;
	}

	public String getAcqDcFlag() {
		return acqDcFlag;
	}

	public void setAcqDcFlag(String acqDcFlag) {
		this.acqDcFlag = acqDcFlag;
	}

	public String getPayDcFlag() {
		return payDcFlag;
	}

	public void setPayDcFlag(String payDcFlag) {
		this.payDcFlag = payDcFlag;
	}

	public String getFeeDirIn() {
		return feeDirIn;
	}

	public void setFeeDirIn(String feeDirIn) {
		this.feeDirIn = feeDirIn;
	}

	public String getSettleType() {
		return settleType;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<TransCode> getTransCodeList() {
		return transCodeList;
	}

	public void setTransCodeList(List<TransCode> transCodeList) {
		this.transCodeList = transCodeList;
	}

}
