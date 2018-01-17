package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.listbean.SelUsersInfoListBean;


/**
 * 会员状态查询
 * @author liang
 *
 */
public class SelUsersInfoBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String userId;  			//会员ID
	private String flag;  //
	private String  acctLevel;//账户等级  临时户：  0，一类账户：1，二类账户  2，三类账户  3 
	private List<SelUsersInfoListBean> selUsersInfoListBeans; //用户信息列表
	public String getUserId() {
		return userId;
	}
	public void setUserId(String usrLgName) {
		this.userId = usrLgName;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public String getAcctLevel() {
		return acctLevel;
	}
	public void setAcctLevel(String acctLevel) {
		this.acctLevel = acctLevel;
	}
	public List<SelUsersInfoListBean> getSelUsersInfoListBeans() {
		return selUsersInfoListBeans;
	}
	public void setSelUsersInfoListBeans(List<SelUsersInfoListBean> selUsersInfoListBeans) {
		this.selUsersInfoListBeans = selUsersInfoListBeans;
	}
}
