package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 校检支付密码 
 * @author junfu_yuan
 * @date 2016年9月28日
 */
public class CheckPayPwdBean extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7723859351475918689L;
	
	private String userId; // 用户账户
	private String payPwd; // 支付密码

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPayPwd() {
		return payPwd;
	}

	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}

}
