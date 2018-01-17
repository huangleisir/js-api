package com.jst.prodution.base.service;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.util.DateUtil;
import com.jst.prodution.utils.exception.JstException;

/**
 * spring service 的抽象类
 * 集中处理业务抛出的异常
 * @author jfLi
 *
 */
public abstract class AbstractDubboBaseService implements BaseService{
	
	protected Logger  log = LoggerFactory.getLogger(getClass());
	private static final String SYS_ERR_CONTENT = "系统异常";
	
	public BaseBean action(BaseBean input) {
		BaseBean output = null;
		Date startDate = new Date();
		try {
			log.info("=================【name={},startTime={}】入参：：：{}",
					getClass().getName(),
					DateUtil.getDateTimeMillStr(startDate),
					JSON.toJSONString(input));
			output = process(input);
			/**
			 * modefy by chenlong 20170712 output 内含失败信息
			 * 注释重置output 返回信息
			 */
			if(output.getResType()!=null && !output.getResType().equals(BaseBean.RES_TYPE_NORMAL)){
			 
			}else{
			    output.setRes(BaseBean.RES_CODE_SUCCESS, BaseBean.RES_TYPE_NORMAL, BaseBean.MSGCONTENT_SUCCESS);   
            }
			
			return output;
		} catch(JstException e) {
			log.error(getClass().getName() + "应用异常" + JSON.toJSONString(input), e);
//			throw e;
			output = input;
			output.setRes(e.getMessageCode(), e.getResType(), e.getMessageContent(), e.getMessage());
			return output;
		} catch(Exception e) {
			log.error(getClass().getName() + "系统异常" + JSON.toJSONString(input), e);
//			throw new JstException(getSysResCode(), BaseBean.RES_TYPE_SYS_ERR, SYS_ERR_CONTENT, e);
			output = input;
			output.setRes(BaseBean.RES_TYPE_SYS_ERR, BaseBean.RES_TYPE_SYS_ERR, SYS_ERR_CONTENT, e.getMessage());
			return output;
		} finally {
			Date endDate = new Date();
			log.info("=================【name={}, endTime={}, costTime={}】出参：：：{}",
					getClass().getName(),
					DateUtil.getDateTimeMillStr(new Date()),
					DateUtil.getCostTime(startDate, endDate),
					JSON.toJSONString(output));
		}
	}
	
	/**
	 * 处理业务逻辑（基本检查已完成）
	 * @param input
	 * @return
	 * @throws JstException
	 */
	public abstract BaseBean process(BaseBean input);
	
}
