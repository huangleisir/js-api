package com.jst.prodution.base.service;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.utils.exception.JstException;

public interface BaseService {
	/**
	 * 处理业务逻辑（基本检查已完成）
	 * @param input
	 * @return
	 * @throws JstException
	 */
	public BaseBean action(BaseBean input);
}
