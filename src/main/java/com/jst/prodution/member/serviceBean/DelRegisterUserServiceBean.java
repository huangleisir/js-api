package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 删除会员用户
 * @author Administrator
 *
 */
public class DelRegisterUserServiceBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String userId;

	public DelRegisterUserServiceBean(){

	}
	
	public DelRegisterUserServiceBean(String userId){
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
