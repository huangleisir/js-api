package com.jst.prodution.cashdesk.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class CashDeskSignEditBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String userId;						//会员ID（主键）	
	private String userType;					//会员类型：B.商户 C.个人
	private String state;						//会员状态：0，开启 1，禁止
	private String merchantNo;					//商户号
	private String opperType;					//delete:删除，add ：添加 ，update:更新  select
	private int count;					//查询记录数
	private String productCode;      //产品码
	private String productName;      //产品名称
	private String channelCode;      //渠道编码
	private String sourceFrom;      // 源平台
	private String signDate;          //签约日期
	private String unsignDate;        //解约日期

//	private Integer state;          //状态
//	private List<CashDeskSignBBean> cashDeskSignBBeanList;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getOpperType() {
		return opperType;
	}
	public void setOpperType(String opperType) {
		this.opperType = opperType;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getSignDate() {
		return signDate;
	}
	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}
	public String getUnsignDate() {
		return unsignDate;
	}
	public void setUnsignDate(String unsignDate) {
		this.unsignDate = unsignDate;
	}
	
}