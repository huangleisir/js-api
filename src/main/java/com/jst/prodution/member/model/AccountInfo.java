package com.jst.prodution.member.model;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员账户信息表
 * 
 * @author zhouyl
 *
 */
public class AccountInfo extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String userId;             //用户ID                      
	private String acctId;             //用户账户号                      
	private String acctName;           //账户开户者名称       
	private String status;           	//账户状态 01 有效账户 02无效账户       
	private String acctType;           	//账户类型：01 基本户      
	private String createTime;         //创建时间     
	private String modifyTime;         //更新时间
	private String sourceFrom;         //例如：app
	private String remark;				//描述
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
