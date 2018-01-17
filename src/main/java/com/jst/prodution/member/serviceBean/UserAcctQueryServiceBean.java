package com.jst.prodution.member.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.model.AccountInfo;

/**
 * 账户查询结果bean
 * @author Administrator
 *
 */
public class UserAcctQueryServiceBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String userId;			//会员ID
	private String acctName;		//会员名称
	private String acctId;             //用户账户号      
	private String acctType;		//账户类型 01基本户  02余额户
	private String status;			//账户状态：01有效 02无效
	List<AccountInfo> acctList;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<AccountInfo> getAcctList() {
		return acctList;
	}
	public void setAcctList(List<AccountInfo> acctList) {
		this.acctList = acctList;
	}
    /**
     * @return the acctId
     */
    public String getAcctId() {
        return acctId;
    }
    /**
     * @param acctId the acctId to set
     */
    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }
	
}
