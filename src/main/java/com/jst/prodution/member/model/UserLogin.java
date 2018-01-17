package com.jst.prodution.member.model;

/**
 * 
* @ClassName: 
* @Description: 会员密码实体
* @author liaozr 
* @date 2016-07-23 下午3:35:36 
*
 */
@SuppressWarnings("serial")
public class UserLogin implements java.io.Serializable {
	private String userId;				//会员ID
	private String passwordType;		//密码类型：1,登录密码  2.支付密码 3.手势密码
	private String password;			//密码（加密）
	private String errorCount;			//错误次数
	private String errorTime;			//首次错误时间
	private String createTime;			//创建时间
	private String modifyTime;			//修改时间
	private String instim;				//最近一次密码输错时间
	private String timeout;				//超时时间
	private String salt;                //加密盐值
	private String status;                //加密盐值
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getErrorCount() {
		return errorCount;
	}
	public void setErrorCount(String errorCount) {
		this.errorCount = errorCount;
	}
	public String getErrorTime() {
		return errorTime;
	}
	public void setErrorTime(String errorTime) {
		this.errorTime = errorTime;
	}
	public String getInstim() {
		return instim;
	}
	public void setInstim(String instim) {
		this.instim = instim;
	}
	public String getTimeout() {
		return timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	 
}