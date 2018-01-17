package com.jst.prodution.engine.model;

import java.util.Date;

public class DataReady {
	//编号
	private String number;
	//名字
	private String name;
	//记录数
	private Integer count;
	//开始时间
	private Date startTime;
	//结束时间
	private Date endTime;
	//状态  批次状态 （state 0完成 1进行中 2失败 3未开始）
	private String state;
	//错误信息
	private String errorInfo;
	//创建时间
	private Date createTime;
	//更新表时间
	private Date updateTime;
	//数据日期
	private String dataDate;
	//对账日期
	private String checkBillDate;
	//文件名
	private String fileName;
	//对账总金额
	private Integer totalAmount;
	//手续费总和
	private Integer feeAmount;
	//结算总金额
	private Integer settleAmount;
	//对账状态0已对账   1对账失败 2未对账， 
    private String billState;
    
    //通道交易总金额
    private Integer totalTranAmount;
    //通道交易手续费总和
    private Integer totalTranFee;
	
	
	public String getBillState() {
        return billState;
    }
    public void setBillState(String billState) {
        this.billState = billState;
    }
    public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
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
	public String getDataDate() {
		return dataDate;
	}
	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}
	public String getCheckBillDate() {
		return checkBillDate;
	}
	public void setCheckBillDate(String checkBillDate) {
		this.checkBillDate = checkBillDate;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(Integer feeAmount) {
		this.feeAmount = feeAmount;
	}
	public Integer getSettleAmount() {
		return settleAmount;
	}
	public void setSettleAmount(Integer settleAmount) {
		this.settleAmount = settleAmount;
	}
	public Integer getTotalTranAmount() {
		return totalTranAmount;
	}
	public void setTotalTranAmount(Integer totalTranAmount) {
		this.totalTranAmount = totalTranAmount;
	}
	public Integer getTotalTranFee() {
		return totalTranFee;
	}
	public void setTotalTranFee(Integer totalTranFee) {
		this.totalTranFee = totalTranFee;
	}	
}
