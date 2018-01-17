package com.jst.prodution.jsyun.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class WhiteList extends BaseBean{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 编号
     */
    private Integer id;

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 编号
     * @return id 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 编号
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户编号
     * @return user_id 用户编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户编号
     * @param userId 用户编号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 电话号码
     * @return phone 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 电话号码
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}