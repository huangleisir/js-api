package com.jst.prodution.accountant.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 分录模板查询
 * @author tudq
 * @date 2016年10月24日
 */
public class AcntEntryTemDetailBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//------------------------------ 接口输入参数 begin ------------------------------
	 /**
     * 会计主体
     */
    private String acntPartNo;
    /**
     * 分录事件码
     */
    private String entryCode;
    /**
     * 分录方向
     */
    private String entryDirec;
	/**
     * 分录事件名称
     */
	 private String entryName;
	    /**
	     * 科目号
	     */
	    private String sbjNo;
	    /**
	     * 借方科目名称
	     */
	    private String sbjName;
	    private String createUser;

	    private String updateUser;

	    private Date createTime;

	    private Date modifyTime;
	//------------------------------ 接口输入参数 end ------------------------------

	
	//------------------------------ 接口输出参数 begin ------------------------------



	public String getAcntPartNo() {
		return acntPartNo;
	}


	public void setAcntPartNo(String acntPartNo) {
		this.acntPartNo = acntPartNo;
	}


	public String getEntryCode() {
		return entryCode;
	}


	public void setEntryCode(String entryCode) {
		this.entryCode = entryCode;
	}


	public String getEntryName() {
		return entryName;
	}


	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}


	public String getEntryDirec() {
		return entryDirec;
	}


	public void setEntryDirec(String entryDirec) {
		this.entryDirec = entryDirec;
	}


	public String getSbjNo() {
		return sbjNo;
	}


	public void setSbjNo(String sbjNo) {
		this.sbjNo = sbjNo;
	}


	public String getSbjName() {
		return sbjName;
	}


	public void setSbjName(String sbjName) {
		this.sbjName = sbjName;
	}


	public String getCreateUser() {
		return createUser;
	}


	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}


	public String getUpdateUser() {
		return updateUser;
	}


	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Date getModifyTime() {
		return modifyTime;
	}


	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}


	
	

}
