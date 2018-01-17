package com.jst.prodution.trade.model;

/**
 * 交易核心提现交易订单基类
 * @author 吴安辉
 *
 */
public class WithdrawOrder {

	private String tradeNo;				//订单流水号   trade_no
	private String systemCode;			//业务发起系统编码  system_code
	private String state;				//状态 00成功 10待处理 99失败   state
	private String applyType;			//申请类型 1提现申请 2提现   apply_type
	private String drawState;			//审核状态 1 审核通过 2 审核不通 3 未审核 4审核中  draw_status
	private String withdrawType;		//提现类型 1-线上 2-线下   withdraw_type
	private Long amout;					//提现金额  amout   
	private Integer fee;				//提现手续费     fee
	private String userId;				//提现用户编号  user_id
	private String userName;			//提现用户名称  user_name
	private String userCode;			//提现用户账户   user_code
	private String userIp;				//提现用户IP  user_ip
	private String callType;			//订单调帐方式 1补单 2销单 空表示未调账call_style
	private String faileTime;			//订单失效时间faile_time
	private String withdrawRelationNo;	//提现订单关联提现申请订单号withdraw_relation_no
	private String creator;				//创建者creator
	private String createTime;			//创建时间create_time
	private String updator;				//修改者updator
	private String updateTime;			//修改时间update_time
	private String note;				//描述note

	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getApplyType() {
		return applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}
	public String getDrawState() {
		return drawState;
	}
	public void setDrawState(String drawState) {
		this.drawState = drawState;
	}
	public String getWithdrawType() {
		return withdrawType;
	}
	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}
	public Long getAmout() {
		return amout;
	}
	public void setAmout(Long amout) {
		this.amout = amout;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getFaileTime() {
		return faileTime;
	}
	public void setFaileTime(String faileTime) {
		this.faileTime = faileTime;
	}
	public String getWithdrawRelationNo() {
		return withdrawRelationNo;
	}
	public void setWithdrawRelationNo(String withdrawRelationNo) {
		this.withdrawRelationNo = withdrawRelationNo;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
