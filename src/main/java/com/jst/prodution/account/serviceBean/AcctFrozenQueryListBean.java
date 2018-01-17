package com.jst.prodution.account.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 用户冻结
 * @author junfu_yuan
 * @date 2016年10月8日
 */
public class AcctFrozenQueryListBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//------------------------------ 接口输入参数 begin ------------------------------
	/**
	 * 冻结编号(解冻时关联冻结编号) - 可输
	 */
	private String frozenId;
	/**
	 * 冻结状态 - 可输
	 * 1：正常
	 * 2：已解冻
	 */
	private String frozenState;
	/**
	 * 账户号 - 可输
	 */
	private String acctId;
    /**
     * 用户标识
     */
    private String userId;
	/**
	 * 冻结解冻业务类型 - 必输
	 * 1：账户冻结
	 * 2：金额冻结
	 * 3：账户解冻
	 * 4：金额解冻
	 */
	private String busFrozenType;
	/**
	 * 冻结金额 - 可输
	 * 单位 分
	 * 注：frozenType为“1-账户冻结”必输
	 */
	private Long amount;
	/**
	 * 系统来源 - 必输
	 * 1：风控
	 * 2：运营
	 * 3: 内部冻结
	 */
	private String sourceFrom;
	//------------------------------ 接口输入参数 end ------------------------------

	
	//------------------------------ 接口输出参数 begin ------------------------------
	private List<AcctFrozenQueryListBean> list;
	/**
	 * 冻结主键标识
	 */
    private String id;
    /**
     * 账户类型
     */
    private String acctType;
    /**
     * 已解冻金额
     */
    private Long unfronzenAmount;
    /**
     * 操作类型	1-正常,3-冲正
     */
    private String operType;
    /**
     * 被冲销标志 (Y已冲销  N无冲销)
     */
    private String writeoffFlag;
    /**
     * 关联流水号（关联流水号）
     */
    private String linkId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 最后更新人
     */
    private String updateUser;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
    
    /**
     * 已解冻金额汇总
     */
    private Long unfronzenAmountSum;
    /**
	 * 冻结金额汇总
	 * 单位 分
	 */
	private Long amountSum;
	//------------------------------ 接口输出参数 end ------------------------------
    
	public String getFrozenId() {
		return frozenId;
	}
	public List<AcctFrozenQueryListBean> getList() {
		return list;
	}
	public void setList(List<AcctFrozenQueryListBean> list) {
		this.list = list;
	}
	public void setFrozenId(String frozenId) {
		this.frozenId = frozenId == null || "".equals(frozenId.trim()) ? null : frozenId.trim();
	}
	public String getFrozenState() {
		return frozenState;
	}
	public void setFrozenState(String frozenState) {
		this.frozenState = frozenState == null || "".equals(frozenState.trim()) ? null : frozenState.trim();
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId == null || "".equals(acctId.trim()) ? null : acctId.trim();
	}
	public String getBusFrozenType() {
		return busFrozenType;
	}
	public void setBusFrozenType(String busFrozenType) {
		this.busFrozenType = busFrozenType == null || "".equals(busFrozenType.trim()) ? null : busFrozenType.trim();
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom == null || "".equals(sourceFrom.trim()) ? null : sourceFrom.trim();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id == null || "".equals(id.trim()) ? null : id.trim();
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType == null || "".equals(acctType.trim()) ? null : acctType.trim();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId == null || "".equals(userId.trim()) ? null : userId.trim();
	}
	public Long getUnfronzenAmount() {
		return unfronzenAmount;
	}
	public void setUnfronzenAmount(Long unfronzenAmount) {
		this.unfronzenAmount = unfronzenAmount;
	}
	public String getOperType() {
		return operType;
	}
	public void setOperType(String operType) {
		this.operType = operType == null || "".equals(operType.trim()) ? null : operType.trim();
	}
	public String getWriteoffFlag() {
		return writeoffFlag;
	}
	public void setWriteoffFlag(String writeoffFlag) {
		this.writeoffFlag = writeoffFlag == null || "".equals(writeoffFlag.trim()) ? null : writeoffFlag.trim();
	}
	public String getLinkId() {
		return linkId;
	}
	public void setLinkId(String linkId) {
		this.linkId = linkId == null || "".equals(linkId.trim()) ? null : linkId.trim();
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark == null || "".equals(remark.trim()) ? null : remark.trim();
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser == null || "".equals(createUser.trim()) ? null : createUser.trim();
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null || "".equals(updateUser.trim()) ? null : updateUser.trim();
	}
	public Long getUnfronzenAmountSum() {
		return unfronzenAmountSum;
	}
	public void setUnfronzenAmountSum(Long unfronzenAmountSum) {
		this.unfronzenAmountSum = unfronzenAmountSum;
	}
	public Long getAmountSum() {
		return amountSum;
	}
	public void setAmountSum(Long amountSum) {
		this.amountSum = amountSum;
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

}
