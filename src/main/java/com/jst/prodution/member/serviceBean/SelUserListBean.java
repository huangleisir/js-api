package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.model.UserBase;

public class SelUserListBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private String userId;					//会员id
	private String userName;				//会员名称
	private String mobile;					//手机号
	private String userType;				//用户类型
	private String status;					//状态
	private String cerno;					//证件号
	private String merchantNo;				//商户号
	private String certification;          //认证方式：1.快捷认证 2.打款认证 3.关联认证 4.其他认证
	private List<UserBase> userList;		//用户列表
	
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCerno() {
		return cerno;
	}
	public void setCerno(String cerno) {
		this.cerno = cerno;
	}
	public List<UserBase> getUserList() {
		return userList;
	}
	public void setUserList(List<UserBase> userList) {
		this.userList = userList;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
    /**
     * @return the certification
     */
    public String getCertification() {
        return certification;
    }
    /**
     * @param certification the certification to set
     */
    public void setCertification(String certification) {
        this.certification = certification;
    }
	
}
