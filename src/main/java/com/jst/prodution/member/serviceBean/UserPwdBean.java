/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.member.serviceBean  
 * @ClassName: UserPwdBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月16日 下午4:20:12 
 * @version V1.0 
 

 */
public class UserPwdBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userId;      //会员号
    private String passwordType;    //密码类型
    private String password;        //密码
 
    /**
     * @return the passwordType
     */
    public String getPasswordType() {
        return passwordType;
    }
    /**
     * @param passwordType the passwordType to set
     */
    public void setPasswordType(String passwordType) {
        this.passwordType = passwordType;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
