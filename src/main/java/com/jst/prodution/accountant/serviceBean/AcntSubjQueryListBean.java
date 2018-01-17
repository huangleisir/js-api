package com.jst.prodution.accountant.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 会计科目查询
 * @author tudq
 * @date 2016年10月24日
 */
public class AcntSubjQueryListBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	//------------------------------ 接口输入参数 begin ------------------------------
	 /**
      * 会计主体
      */
     private String acntPartNo;

     /**
      * 科目号
      */
      private String sbjNo;

      /**
      * 中文名称
     */
	  private String sbjName;
	    /**
	     * 科目性质（科目类型）1-资产类科目、2-负债类科目、3-资产负债共同类科目、4-所有者权益类科目、5-损益类科目、6-表外类科目(备用)、7-或资产类科目、8-或有负债类科目
	     */
	    private String sbjNature;
	    /**
	     * 科目级别1-一级科目、 2-二级科目、3-三级科目
	     */
	    private String sbjLevel;
	    /**
	     * 上级科目号
	     */
	    private String upSbjNo;
	    /**
	     * 余额方向D-借方、C-贷方
	     */
	    private String sbjBalanceDirec;
	    /**
	     * 发生额方向控制B-可借可贷、D-可借、C-可贷
	     */
	    private String sbjTranDirec;
	    /**
	     * 是否叶子科目Y-是，N-否
	     */
	    private String leafFlg;
	    /**
	     * 叶子科目可设置入账方式1-实时入余额，2-批量入余额
	     */
	    private String leafChargeFlg;
	    /**
	     * 科目挂销账标志1-是，2-否
	     */
	    private String hangFlg;
	   
	    /**
	     * 创建用户
	     */
	    private String createUser;
	    /**
	     * 更新用户
	     */
	    private String updateUser;
	    /**
	     * 新增时间
	     */
	    private Date createTime;
	    /**
	     * 最后更新时间
	     */
	    private Date modifyTime;
	//------------------------------ 接口输入参数 end ------------------------------

	
	//------------------------------ 接口输出参数 begin ------------------------------
	private List<AcntSubjDetailBean> list;


	public String getAcntPartNo() {
		return acntPartNo;
	}


	public void setAcntPartNo(String acntPartNo) {
		this.acntPartNo = acntPartNo;
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


	public String getSbjNature() {
		return sbjNature;
	}


	public void setSbjNature(String sbjNature) {
		this.sbjNature = sbjNature;
	}


	public String getSbjLevel() {
		return sbjLevel;
	}


	public void setSbjLevel(String sbjLevel) {
		this.sbjLevel = sbjLevel;
	}


	public String getUpSbjNo() {
		return upSbjNo;
	}


	public void setUpSbjNo(String upSbjNo) {
		this.upSbjNo = upSbjNo;
	}


	public String getSbjBalanceDirec() {
		return sbjBalanceDirec;
	}


	public void setSbjBalanceDirec(String sbjBalanceDirec) {
		this.sbjBalanceDirec = sbjBalanceDirec;
	}


	public String getSbjTranDirec() {
		return sbjTranDirec;
	}


	public void setSbjTranDirec(String sbjTranDirec) {
		this.sbjTranDirec = sbjTranDirec;
	}


	public String getLeafFlg() {
		return leafFlg;
	}


	public void setLeafFlg(String leafFlg) {
		this.leafFlg = leafFlg;
	}


	public String getLeafChargeFlg() {
		return leafChargeFlg;
	}


	public void setLeafChargeFlg(String leafChargeFlg) {
		this.leafChargeFlg = leafChargeFlg;
	}


	public String getHangFlg() {
		return hangFlg;
	}


	public void setHangFlg(String hangFlg) {
		this.hangFlg = hangFlg;
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


	public List<AcntSubjDetailBean> getList() {
		return list;
	}


	public void setList(List<AcntSubjDetailBean> list) {
		this.list = list;
	}




}
