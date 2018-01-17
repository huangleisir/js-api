package com.jst.prodution.member.serviceBean;

import java.io.Serializable;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @Description 会员鉴权信息列表
 * @author caojianhua
 * @date 2017/2/14
 *
 */
public class MemberAuthListBean extends BaseBean implements Serializable{
	private String userId;		//会员id
	private String userName;	//会员名称
	private List<MemberAuthInfoBean> authList; //鉴权列表
	
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
	public List<MemberAuthInfoBean> getAuthList() {
		return authList;
	}
	public void setAuthList(List<MemberAuthInfoBean> authList) {
		this.authList = authList;
	}
}
