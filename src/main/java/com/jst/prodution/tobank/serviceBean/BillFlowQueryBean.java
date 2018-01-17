package com.jst.prodution.tobank.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 转账单据流水查询
 * @author Administrator
 *
 */
public class BillFlowQueryBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 请求body
	 */
	private String requestSn;				//请求序列号
	private String accNo;					//帐号（必输）
	private String startDate;				//开始时间（必输）
	private String endDate;					//结束时间（必输）
	private String creditNo;				//凭证号
	private String cstPayNo1;				//客户方流水号
	private String djType;					//单据状态
	private String page;					//页次
	private String rem1;					//备注1
	private String rem2;					//备注2
	
	/**
	 * 响应body
	 */
	private String returnCode;				//返回码
	private String returnMsg;				//返回消息
	private Integer curPage;				//当前页
	private Integer pageCount;				//总页数
	private List<BillBean> payList;			//记录List
	
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
	public String getCreditNo() {
		return creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	public String getCstPayNo1() {
		return cstPayNo1;
	}
	public void setCstPayNo1(String cstPayNo1) {
		this.cstPayNo1 = cstPayNo1;
	}
	public String getDjType() {
		return djType;
	}
	public void setDjType(String djType) {
		this.djType = djType;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getRem1() {
		return rem1;
	}
	public void setRem1(String rem1) {
		this.rem1 = rem1;
	}
	public String getRem2() {
		return rem2;
	}
	public void setRem2(String rem2) {
		this.rem2 = rem2;
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
	public Integer getCurPage() {
		return curPage;
	}
	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public List<BillBean> getPayList() {
		return payList;
	}
	public void setPayList(List<BillBean> payList) {
		this.payList = payList;
	}

	@Override
	public String toString() {
		return "BillFlowQueryBean{" +
				"requestSn='" + requestSn + '\'' +
				", accNo='" + accNo + '\'' +
				", startDate='" + startDate + '\'' +
				", endDate='" + endDate + '\'' +
				", creditNo='" + creditNo + '\'' +
				", cstPayNo1='" + cstPayNo1 + '\'' +
				", djType='" + djType + '\'' +
				", page='" + page + '\'' +
				", rem1='" + rem1 + '\'' +
				", rem2='" + rem2 + '\'' +
				", returnCode='" + returnCode + '\'' +
				", returnMsg='" + returnMsg + '\'' +
				", curPage=" + curPage +
				", pageCount=" + pageCount +
				", payList=" + payList +
				'}';
	}
}
