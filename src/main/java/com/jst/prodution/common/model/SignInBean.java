package com.jst.prodution.common.model;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * @author cq
 *
 */
public class SignInBean extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 员工姓名
	 */
	private String name;
	/**
	 * 工号
	 */
	private String jobNum;
	/**
	 * 手机号
	 */
	private String phoneNum;
	/**
	 * 最新更新时间
	 */
	private String updateTime;
	/**
	 * 是否领奖0否1是
	 */
	private String isReceiveGift;
	/**
	 * 礼品码
	 */
	private String giftCode;
	/**
     * 是否签到 0否1是
     */
    private String isSign;
    
    private String code;
    @Override
    public String toString() {
        return "SignInBean [id=" + id + ", name=" + name + ", jobNum=" + jobNum + ", phoneNum=" + phoneNum
                + ", updateTime=" + updateTime + ", isReceiveGift=" + isReceiveGift + ", giftCode=" + giftCode + "]";
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJobNum() {
        return jobNum;
    }
    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    public String getIsReceiveGift() {
        return isReceiveGift;
    }
    public void setIsReceiveGift(String isReceiveGift) {
        this.isReceiveGift = isReceiveGift;
    }
    public String getGiftCode() {
        return giftCode;
    }
    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public String getIsSign() {
        return isSign;
    }
    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

	
	
	
	

}
