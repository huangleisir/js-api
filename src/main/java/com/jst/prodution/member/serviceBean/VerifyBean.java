package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 验证码类
 * @author liang
 *
 */
public class VerifyBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String serialNo;  //流水 SERIAL_NO
	private String userId;  //userId
	private String frozenType;// //1.冻结 2.禁用
	private String frozenStatus;////1、正常 2、异常
	public VerifyBean(){
		super();
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFrozenType() {
		return frozenType;
	}
	public void setFrozenType(String frozenType) {
		this.frozenType = frozenType;
	}

	public String getFrozenStatus() {
		return frozenStatus;
	}
	public void setFrozenStatus(String frozenStatus) {
		this.frozenStatus = frozenStatus;
	}
	public VerifyBean(String serialNo,String userId, String frozenType, String frozenStatus) {
		super();
		this.serialNo = serialNo;
		this.userId = userId;
		this.frozenType = frozenType;
		this.frozenStatus = frozenStatus;
	}
}
