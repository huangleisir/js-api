package com.jst.prodution.tobank.serviceBean;

/**
 * 账单bean
 * @author Administrator
 *
 */
public class BillBean implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private String serial;					//流水号
	private String tranType;				//交易类别：W--外联平台
	private String payAccNo;				//付款方账号
	private String accName;					//付款账户客户名称
	private String openAccDept;				//付款单位开户机构
	private String recvAccNo;				//收款方账号
	private String recvAccName;				//收款账户客户名称
	private String recvOpenAccDept;			//收款单位开户机构
	private String amount;					//金额 == 他们是元，我们是分
	private String userOf;					//用途
	private String creditNo;				//网银凭证号 ==
	private String checkSn;					//验证码
	/**
	 * 交易状态 :
	 * 	0：已记账未复核
 	 *  1：复核中
 	 *  2：交易成功城综网处理
	 *  3：交易成功清算处理
	 *  4：交易成功手工处理
	 *  5：交易失败
	 *  6：不确定
	 *  9：银行处理中
	 *  A：单据被废除
	 */
	private String status;	// == 重要
	private String errMsg;					//错误描述
	private String operName;				//记账员姓名
	private String makDate;					//制单日期
	private String checkName;				//复核员姓名
	private String chkDate;					//复核日期
	private String adminName;				//主管姓名
	private String appDate;					//审批日期
	private String memo1;					//分行自定义备注字段1
	private String memo2;					//分行自定义备注字段2
	private String followInfo;				//跟单留言信息
	private String reasonDesc;				//退单原因描述
	private String delReason;				//复核不通过原因
	private String cancelReaso;				//退单原因
	private String curType;					//币种：01人民币
	private String cstPayNo;				//客户方流水号 ==
	
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public String getPayAccNo() {
		return payAccNo;
	}
	public void setPayAccNo(String payAccNo) {
		this.payAccNo = payAccNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getOpenAccDept() {
		return openAccDept;
	}
	public void setOpenAccDept(String openAccDept) {
		this.openAccDept = openAccDept;
	}
	public String getRecvAccNo() {
		return recvAccNo;
	}
	public void setRecvAccNo(String recvAccNo) {
		this.recvAccNo = recvAccNo;
	}
	public String getRecvAccName() {
		return recvAccName;
	}
	public void setRecvAccName(String recvAccName) {
		this.recvAccName = recvAccName;
	}
	public String getRecvOpenAccDept() {
		return recvOpenAccDept;
	}
	public void setRecvOpenAccDept(String recvOpenAccDept) {
		this.recvOpenAccDept = recvOpenAccDept;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getUserOf() {
		return userOf;
	}
	public void setUserOf(String userOf) {
		this.userOf = userOf;
	}
	public String getCreditNo() {
		return creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	public String getCheckSn() {
		return checkSn;
	}
	public void setCheckSn(String checkSn) {
		this.checkSn = checkSn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getOperName() {
		return operName;
	}
	public void setOperName(String operName) {
		this.operName = operName;
	}
	public String getMakDate() {
		return makDate;
	}
	public void setMakDate(String makDate) {
		this.makDate = makDate;
	}
	public String getCheckName() {
		return checkName;
	}
	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}
	public String getChkDate() {
		return chkDate;
	}
	public void setChkDate(String chkDate) {
		this.chkDate = chkDate;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAppDate() {
		return appDate;
	}
	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}
	public String getMemo1() {
		return memo1;
	}
	public void setMemo1(String memo1) {
		this.memo1 = memo1;
	}
	public String getMemo2() {
		return memo2;
	}
	public void setMemo2(String memo2) {
		this.memo2 = memo2;
	}
	public String getFollowInfo() {
		return followInfo;
	}
	public void setFollowInfo(String followInfo) {
		this.followInfo = followInfo;
	}
	public String getReasonDesc() {
		return reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}
	public String getDelReason() {
		return delReason;
	}
	public void setDelReason(String delReason) {
		this.delReason = delReason;
	}
	public String getCancelReaso() {
		return cancelReaso;
	}
	public void setCancelReaso(String cancelReaso) {
		this.cancelReaso = cancelReaso;
	}
	public String getCurType() {
		return curType;
	}
	public void setCurType(String curType) {
		this.curType = curType;
	}
	public String getCstPayNo() {
		return cstPayNo;
	}
	public void setCstPayNo(String cstPayNo) {
		this.cstPayNo = cstPayNo;
	}
}
