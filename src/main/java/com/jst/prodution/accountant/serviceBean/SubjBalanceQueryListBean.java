package com.jst.prodution.accountant.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 科目余额查询
 * @author tudq
 * @date 2016年10月24日
 */
public class SubjBalanceQueryListBean extends BaseBean {

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
	/**余额方向
	 */
	private String sbjBalanceDirec;
	/**发生额方向控制
	 */
	private String sbjTranDirec;
	/**叶子科目可设置入账方式
	 */
	private String leafChargeFlg;
	/**科目挂销账标志
	 */
	private String hangFlg;
	/**余额
	 */
    private Long balance;
	/**借方笔数
	 */
    private Long dNum;
	/**借方发生额
	 */
    private Long dAmount;
	/**贷方笔数
	 */
    private Long cNum;
	/**贷方发生额
	 */
    private Long cAmount;
	/**上日余额
	 */
    private Long lastBalance;
	/**上日借方笔数
	 */
    private Long lastDNum;
	/**上日借方发生额
	 */
    private Long lastDAmount;
    /**
     * 上日贷方笔数
     */
    private Long lastCNum;
    /**
     * 上日贷方发生额
     */
    private Long lastCAmount;
    /**
     * 上次变动会计日期
     */
    private Integer lastChangeDate;
    
    private Integer acntDate;
    /**
     * 创建 人员
     */
    private String createUser;
    /**
     * 修改人员
     */
    private String updateUser;
    /**
     *创建 时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;
    
    
	//------------------------------ 接口输入参数 end ------------------------------

	
	//------------------------------ 接口输出参数 begin ------------------------------
	private List<SubjBalanceDetailBean> list;


	
	
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


	public Long getBalance() {
		return balance;
	}


	public void setBalance(Long balance) {
		this.balance = balance;
	}


	public Long getdNum() {
		return dNum;
	}


	public void setdNum(Long dNum) {
		this.dNum = dNum;
	}


	public Long getdAmount() {
		return dAmount;
	}


	public void setdAmount(Long dAmount) {
		this.dAmount = dAmount;
	}


	public Long getcNum() {
		return cNum;
	}


	public void setcNum(Long cNum) {
		this.cNum = cNum;
	}


	public Long getcAmount() {
		return cAmount;
	}


	public void setcAmount(Long cAmount) {
		this.cAmount = cAmount;
	}


	public Long getLastBalance() {
		return lastBalance;
	}


	public void setLastBalance(Long lastBalance) {
		this.lastBalance = lastBalance;
	}


	public Long getLastDNum() {
		return lastDNum;
	}


	public void setLastDNum(Long lastDNum) {
		this.lastDNum = lastDNum;
	}


	public Long getLastDAmount() {
		return lastDAmount;
	}


	public void setLastDAmount(Long lastDAmount) {
		this.lastDAmount = lastDAmount;
	}


	public Long getLastCNum() {
		return lastCNum;
	}


	public void setLastCNum(Long lastCNum) {
		this.lastCNum = lastCNum;
	}


	public Long getLastCAmount() {
		return lastCAmount;
	}


	public void setLastCAmount(Long lastCAmount) {
		this.lastCAmount = lastCAmount;
	}


	public Integer getLastChangeDate() {
		return lastChangeDate;
	}


	public void setLastChangeDate(Integer lastChangeDate) {
		this.lastChangeDate = lastChangeDate;
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


	public List<SubjBalanceDetailBean> getList() {
		return list;
	}


	public void setList(List<SubjBalanceDetailBean> list) {
		this.list = list;
	}


    /**
     * @return the acntDate
     */
    public Integer getAcntDate() {
        return acntDate;
    }


    /**
     * @param acntDate the acntDate to set
     */
    public void setAcntDate(Integer acntDate) {
        this.acntDate = acntDate;
    }


	
	//------------------------------ 接口输出参数 end ------------------------------
    
	

}
