package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
 * 绑定捷顺通卡查询bean
 * 
 *
 */
public class SelJstCardBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户id
	 */
	private String userId;   
	/**
	 * 捷顺通卡  
	 */
	private List<JstCardBean>  jstCardBean;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<JstCardBean> getJstCardBean() {
		return jstCardBean;
	}
	public void setJstCardBean(List<JstCardBean> jstCardBean) {
		this.jstCardBean = jstCardBean;
	}
    
	
} 
