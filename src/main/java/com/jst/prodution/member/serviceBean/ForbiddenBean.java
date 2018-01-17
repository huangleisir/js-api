package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员禁用/解禁
 * @author liang
 *
 */
public class ForbiddenBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String userId;  		// 会员ID
	private String creator;			//操作者
	private String remark;			//禁用描述
	private String channel;			//禁用来源
	private String flag;     		//2:禁用  3:解禁   
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

}
