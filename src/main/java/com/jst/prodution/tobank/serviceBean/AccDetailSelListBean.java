package com.jst.prodution.tobank.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 交易明细Bean
 * @author Administrator
 *
 */
public class AccDetailSelListBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 请求Body
	 */
	private String requestSn;					//请求序列号
	private String accNo;						//交易账号
	private String startDate;					//开始时间
	private String endDate;						//结束时间
	private String bargainFlag;					//交易方向：0-借 转出 ,1-贷 转入
	private String checkAccNo;					//对方账户	
	private String checkAccName;				//对方帐户名称
	private String remark;						//摘要	
	private Long lowAmt;						//最小金额
	private Long highAmt;						//最大金额	
	private String postStr;						//定位串
	private String detNo;						//起始明细号
	
	/**
	 * 响应Body
	 */
	private String returnCode;					//返回码
	private String returnMsg;					//返回消息
	private String currCod;						//币种
	private String accName;						//本方账号名称
	private String accOrgan;					//本方账号开户机构
	private String accState;					//本方账号状态
	private String intr;						//利率
    private List<AccDetailBean> detailList;		//详情List
    
	public String getRequestSn() {
		return requestSn;
	}
	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getBargainFlag() {
		return bargainFlag;
	}
	public void setBargainFlag(String bargainFlag) {
		this.bargainFlag = bargainFlag;
	}
	public String getCheckAccNo() {
		return checkAccNo;
	}
	public void setCheckAccNo(String checkAccNo) {
		this.checkAccNo = checkAccNo;
	}
	public String getCheckAccName() {
		return checkAccName;
	}
	public void setCheckAccName(String checkAccName) {
		this.checkAccName = checkAccName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getLowAmt() {
		return lowAmt;
	}
	public void setLowAmt(Long lowAmt) {
		this.lowAmt = lowAmt;
	}
	public Long getHighAmt() {
		return highAmt;
	}
	public void setHighAmt(Long highAmt) {
		this.highAmt = highAmt;
	}
	public String getPostStr() {
		return postStr;
	}
	public void setPostStr(String postStr) {
		this.postStr = postStr;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMsg() {
		return returnMsg;
	}
	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}
	public String getDetNo() {
		return detNo;
	}
	public void setDetNo(String detNo) {
		this.detNo = detNo;
	}
	public String getCurrCod() {
		return currCod;
	}
	public void setCurrCod(String currCod) {
		this.currCod = currCod;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccOrgan() {
		return accOrgan;
	}
	public void setAccOrgan(String accOrgan) {
		this.accOrgan = accOrgan;
	}
	public String getAccState() {
		return accState;
	}
	public void setAccState(String accState) {
		this.accState = accState;
	}
	public String getIntr() {
		return intr;
	}
	public void setIntr(String intr) {
		this.intr = intr;
	}
	public List<AccDetailBean> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<AccDetailBean> detailList) {
		this.detailList = detailList;
	}

}
