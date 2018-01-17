package com.jst.prodution.merchant.dubbo.service;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.model.UserBase;

/**
 * 校验手机号注册重复性
 * @author huanglei
 *
 */
public interface CheckMobileIsRegisteredService {
	
	BaseBean checkMobileIsRegistered(UserBase userBase);

}
