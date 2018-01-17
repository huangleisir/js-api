package com.jst.prodution.park.serviceBean;

import java.io.Serializable;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 类名: MerchantInfoSynchro</br>
 * 作者: linyuanq
 * 描述: 同步到捷羿的信息模版 
 * 创建时间: 2017年4月24日下午3:53:53
 * 版权及版本: Copyright(C)2017 jst版权所有
 */
public class MerchantInfoSynchro extends BaseBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mchntsId; //商户ID
	private String mchntsNo;  //商户号
	private String mchntsName; //商户名称
	private String mchntMail;  //商户注册邮箱
	private String mchntPhone;  //商户注册手机号
	private String mchntType; //商户类型
	private String busiNo;  //营业执照号
	private String busisTime;  //营业执照有效期（开始）
	private String busieTime;  //营业执照有效期（结束）
	private String instCode;  //组织机构代码
	private String legalName;  //法人姓名
	private String legalcrtNo;  //法人身份证号
	private String mac; //报文通讯mac 必填
	private String operType; //操作类型 ：1 增、2 改、3 删
	
	
	public String getMchntsId() {
		return mchntsId;
	}
	public void setMchntsId(String mchntsId) {
		this.mchntsId = mchntsId;
	}
	public String getMchntsNo() {
		return mchntsNo;
	}
	public void setMchntsNo(String mchntsNo) {
		this.mchntsNo = mchntsNo;
	}
	public String getMchntsName() {
		return mchntsName;
	}
	public void setMchntsName(String mchntsName) {
		this.mchntsName = mchntsName;
	}
	public String getMchntMail() {
		return mchntMail;
	}
	public void setMchntMail(String mchntMail) {
		this.mchntMail = mchntMail;
	}
	public String getMchntPhone() {
		return mchntPhone;
	}
	public void setMchntPhone(String mchntPhone) {
		this.mchntPhone = mchntPhone;
	}
	public String getMchntType() {
		return mchntType;
	}
	public void setMchntType(String mchntType) {
		this.mchntType = mchntType;
	}
	public String getBusiNo() {
		return busiNo;
	}
	public void setBusiNo(String busiNo) {
		this.busiNo = busiNo;
	}
	public String getBusisTime() {
		return busisTime;
	}
	public void setBusisTime(String busisTime) {
		this.busisTime = busisTime;
	}
	public String getBusieTime() {
		return busieTime;
	}
	public void setBusieTime(String busieTime) {
		this.busieTime = busieTime;
	}
	public String getInstCode() {
		return instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getLegalcrtNo() {
		return legalcrtNo;
	}
	public void setLegalcrtNo(String legalcrtNo) {
		this.legalcrtNo = legalcrtNo;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	/**
	 * 方法名: getOperType
	 * 描述: 操作类型 ：1 增、2 改、3 删
	 * @return
	 * 作者: linyuanq
	 * 创建时间: 2017年4月24日下午4:17:43
	 */
	public String getOperType() {
		return operType;
	}
	/**
	 * 方法名: getOperType
	 * 描述: 操作类型 ：1 增、2 改、3 删
	 * @return
	 * 作者: linyuanq
	 * 创建时间: 2017年4月24日下午4:17:43
	 */
	public void setOperType(String operType) {
		this.operType = operType;
	}
}
