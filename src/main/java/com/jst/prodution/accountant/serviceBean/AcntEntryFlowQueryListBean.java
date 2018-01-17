package com.jst.prodution.accountant.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 会计分录流水查询
 * @author tudq
 * @date 2016年10月24日
 */
public class AcntEntryFlowQueryListBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//------------------------------ 接口输入参数 begin ------------------------------
	    /**
	     * 会计系统日期
	     */
	   private Integer acntDate; 
	/**
        * 会计流水号
        */
	   private String acntNo;
	    /**
	     * 系统来源
	     */
	    private String sysFrom;
	    /**
	     * 交易流水号
	     */
	    private String busNo;
	    /**
	     * 支付流水号
	     */
	    private String payNo;
	    /**
	     * 会计日期
	     */
	    private Integer busTransDate;
	    /**
	     * 会计主体
	     */
	    private String acntPartNo;
	    /**
	     * 业务类型
	     */
	    private String busTranType;
	    /**
	     * 分录事件码
	     */
	    private String entryCode;
	    /**
	     * 分录事件名称
	     */
	    private String entryName;
	    /**
	     * 序号
	     */
	    private Short seq;
	    /**
	     * 科目号
	     */
	    private String sbjNo;
	    /**
	     * 科目名称
	     */
	    private String sbjName;
	    /**
	     * 发生方向
	     */
	    private String entryDirec;
	    /**
	     * 交易金额
	     */
	    private Long tranAmount;
	    /**
	     * 是否已入账
	     */
	    private String acntFlg;
	    /**
	     * 被冲销标志
	     */
	    private String writeoffFlag;
	    /**
	     * 关联流水号（关联流水号）
	     */
	    private String linkTranId;
	    /**
	     * 备注
	     */
	    private String remark;
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
	private List<AcntEntryFlowDetailBean> list;


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


    public String getAcntNo() {
		return acntNo;
	}


	public void setAcntNo(String acntNo) {
		this.acntNo = acntNo;
	}


	public String getSysFrom() {
		return sysFrom;
	}


	public void setSysFrom(String sysFrom) {
		this.sysFrom = sysFrom;
	}


	public String getBusNo() {
		return busNo;
	}


	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}


	public String getPayNo() {
		return payNo;
	}


	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}


	public Integer getBusTransDate() {
		return busTransDate;
	}


	public void setBusTransDate(Integer busTransDate) {
		this.busTransDate = busTransDate;
	}


	public String getAcntPartNo() {
		return acntPartNo;
	}


	public void setAcntPartNo(String acntPartNo) {
		this.acntPartNo = acntPartNo;
	}


	public String getBusTranType() {
		return busTranType;
	}


	public void setBusTranType(String busTranType) {
		this.busTranType = busTranType;
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


	public Short getSeq() {
		return seq;
	}


	public void setSeq(Short seq) {
		this.seq = seq;
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


	public String getEntryDirec() {
		return entryDirec;
	}


	public void setEntryDirec(String entryDirec) {
		this.entryDirec = entryDirec;
	}


	public Long getTranAmount() {
		return tranAmount;
	}


	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}


	public String getAcntFlg() {
		return acntFlg;
	}


	public void setAcntFlg(String acntFlg) {
		this.acntFlg = acntFlg;
	}


	public String getWriteoffFlag() {
		return writeoffFlag;
	}


	public void setWriteoffFlag(String writeoffFlag) {
		this.writeoffFlag = writeoffFlag;
	}


	public String getLinkTranId() {
		return linkTranId;
	}


	public void setLinkTranId(String linkTranId) {
		this.linkTranId = linkTranId;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
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


	public List<AcntEntryFlowDetailBean> getList() {
		return list;
	}


	public void setList(List<AcntEntryFlowDetailBean> list) {
		this.list = list;
	}




}
