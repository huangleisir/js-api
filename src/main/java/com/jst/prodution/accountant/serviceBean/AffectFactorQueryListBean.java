package com.jst.prodution.accountant.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 影响因素配置查询
 * @author tudq
 * @date 2016年10月24日
 */
public class AffectFactorQueryListBean extends BaseBean {

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
	     * 上级科目号
	     */
	    private String upSbjNo;
	    /**
	     * 上级科目名称
	     */
	    private String upSbjName;
	    /**
	     * 影响因数1
	     */
	    private String facor1;
	    /**
	     * 影响因数2
	     */
	    private String facor2;
	    /**
	     * 子科目编码
	     */
	    private String subSbjNo;
	    /**
	     * 子科目名称
	     */
	    private String subSbjName;
	    private String createUser;

	    private String updateUser;

	    private Date createTime;

	    private Date modifyTime;
	//------------------------------ 接口输入参数 end ------------------------------

	
	//------------------------------ 接口输出参数 begin ------------------------------
	private List<AffectFactorDetailBean> list;


	public String getAcntPartNo() {
		return acntPartNo;
	}


	public void setAcntPartNo(String acntPartNo) {
		this.acntPartNo = acntPartNo;
	}


	public String getUpSbjNo() {
		return upSbjNo;
	}


	public void setUpSbjNo(String upSbjNo) {
		this.upSbjNo = upSbjNo;
	}


	public String getUpSbjName() {
		return upSbjName;
	}


	public void setUpSbjName(String upSbjName) {
		this.upSbjName = upSbjName;
	}


	public String getFacor1() {
		return facor1;
	}


	public void setFacor1(String facor1) {
		this.facor1 = facor1;
	}


	public String getFacor2() {
		return facor2;
	}


	public void setFacor2(String facor2) {
		this.facor2 = facor2;
	}


	public String getSubSbjNo() {
		return subSbjNo;
	}


	public void setSubSbjNo(String subSbjNo) {
		this.subSbjNo = subSbjNo;
	}


	public String getSubSbjName() {
		return subSbjName;
	}


	public void setSubSbjName(String subSbjName) {
		this.subSbjName = subSbjName;
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


	public List<AffectFactorDetailBean> getList() {
		return list;
	}


	public void setList(List<AffectFactorDetailBean> list) {
		this.list = list;
	}




	

}
