package com.jst.prodution.member.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员状态查询
 * @author liang
 *
 */
public class UpdPasswordBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String userId;  //流水 SERIAL_NO
	private String usrLgName;  //流水 SERIAL_NO
	private String usrPwd; // 原密码
	private String nUsrPwd;// 新密码	
	private String passwordType;//密码类型1：登录2支付	
	private String modityTime;//修改时间
	private String errorTime;//指定周期内首次错误的时间用于实现指定时间段内连续登录错误, 锁定客户 
	private String creatTime;//创建 时间
	private String errorCount;// 输错次数
	private String instime;//最近一次密码输错时间
	private String timeout;//有效时间
	private String errorTimeW;//指定周期内首次错误的时间用于实现指定时间段内连续登录错误, 锁定客户 （时间 差）
	private String instimeW;//最近一次密码输错时间差
	private Date currentTime;		//当前页
	public String getUsrLgName() {
		return usrLgName;
	}
	public void setUsrLgName(String usrLgName) {
		this.usrLgName = usrLgName;
	}
	public String getUsrPwd() {
		return usrPwd;
	}
	public void setUsrPwd(String usrPwd) {
		this.usrPwd = usrPwd;
	}
	public String getnUsrPwd() {
		return nUsrPwd;
	}
	public void setnUsrPwd(String nUsrpwd) {
		this.nUsrPwd = nUsrpwd;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswordType() {
		return passwordType;
	}
	public void setPasswordType(String passwordType) {
		this.passwordType = passwordType;
	}
	public String getModityTime() {
		return modityTime;
	}
	public void setModityTime(String modityTime) {
		this.modityTime = modityTime;
	}
	public String getErrorTime() {
		return errorTime;
	}
	public void setErrorTime(String errorTime) {
		this.errorTime = errorTime;
	}
	public String getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}
	public String getInstime() {
		return instime;
	}
	public void setInstime(String instime) {
		this.instime = instime;
	}
	public String getTimeout() {
		return timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	public String getErrorCount() {
		return errorCount;
	}
	public void setErrorCount(String errorCount) {
		this.errorCount = errorCount;
	}
	public String getErrorTimeW() {
		return errorTimeW;
	}
	public void setErrorTimeW(String errorTimeW) {
		this.errorTimeW = errorTimeW;
	}
	public String getInstimeW() {
		return instimeW;
	}
	public void setInstimeW(String instimeW) {
		this.instimeW = instimeW;
	}
	public Date getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}
	
}
