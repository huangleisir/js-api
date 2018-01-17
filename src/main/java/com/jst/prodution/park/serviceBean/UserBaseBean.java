package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class UserBaseBean extends BaseBean{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 会员账户编号
     */
    private String userId;

    /**
     * 会员类型：B.商户 C.个人
     */
    private String userType;

    /**
     * 登录（注册）手机号
     */
    private String mobile;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户注册渠道：1.APP 2.WEB 3.OMS 4.API
     */
    private String regChannel;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;

    /**
     * 
     */
    private String appId;

    /**
     * 
     */
    private String thirdUserId;

    private List<UserBaseBean> userList;
    
    
    public List<UserBaseBean> getUserList() {
		return userList;
	}

	public void setUserList(List<UserBaseBean> userList) {
		this.userList = userList;
	}

	/**
     * 会员账户编号
     * @return user_id 会员账户编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 会员账户编号
     * @param userId 会员账户编号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 会员类型：B.商户 C.个人
     * @return user_type 会员类型：B.商户 C.个人
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 会员类型：B.商户 C.个人
     * @param userType 会员类型：B.商户 C.个人
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 登录（注册）手机号
     * @return mobile 登录（注册）手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 登录（注册）手机号
     * @param mobile 登录（注册）手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 用户姓名
     * @return user_name 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户姓名
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 用户注册渠道：1.APP 2.WEB 3.OMS 4.API
     * @return reg_channel 用户注册渠道：1.APP 2.WEB 3.OMS 4.API
     */
    public String getRegChannel() {
        return regChannel;
    }

    /**
     * 用户注册渠道：1.APP 2.WEB 3.OMS 4.API
     * @param regChannel 用户注册渠道：1.APP 2.WEB 3.OMS 4.API
     */
    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 
     * @return app_id 
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 
     * @param appId 
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 
     * @return third_user_id 
     */
    public String getThirdUserId() {
        return thirdUserId;
    }

    /**
     * 
     * @param thirdUserId 
     */
    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }
}