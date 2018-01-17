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
public abstract class AbstractBaseQueryService implements BaseService{
	
	protected Logger  log = LoggerFactory.getLogger(getClass());
	private static final String SYS_ERR_CONTENT = "系统异常";
	
	public BaseBean action(BaseBean input) {
		BaseBean output = null;
		Date startDate = new Date();
		try{
			log.info("=================【name={},startTime={}】入参：：：{}",
					getClass().getName(),
					DateUtil.getDateTimeMillStr(startDate),
					JSON.toJSONString(input));
			checkParams(input);
			output = process(input);
			output.setRes(BaseBean.RES_CODE_SUCCESS, BaseBean.RES_TYPE_NORMAL, BaseBean.MSGCONTENT_SUCCESS);
			return output;
		} catch(JstException e){
			log.error("=================【" + getClass().getName() + "】应用异常：：：", e);
//			throw e;
			output = input;
			output.setRes(e.getMessageCode(), e.getResType(), e.getMessageContent());
			return output;
		} catch(Exception e){
			log.error("=================【" + getClass().getName() + "】系统异常：：：", e);
//			throw new JstException(getSysResCode(), BaseBean.RES_TYPE_SYS_ERR, SYS_ERR_CONTENT);
			output = input;
			output.setRes(getSysResCode(), BaseBean.RES_TYPE_SYS_ERR, SYS_ERR_CONTENT, e.getMessage());
			return output;
		}
	}
	
	/**
	 * 检查基本参数
	 * 如果检查不成功必须采用抛出异常形式，eg：throw new JstException(Constant.RET_CODE_PARAM_IS_NULL, "交易流水不能为空");
	 * @param input
	 * @throws JstException
	 */
	public abstract void checkParams(BaseBean input);

	/**
	 * 处理业务逻辑（基本检查已完成）
	 * @param input
	 * @return
	 * @throws JstException
	 */
	public abstract BaseBean process(BaseBean input);
	
	/**
	 * process()抛出非JstException时的ResCode，用于错误定位,要求所有服务都不相同
	 * @return
	 */
	protected abstract String getSysResCode();
	
	
	
//	private static volatile IdWorker jdId = null;
//
//	public IdWorker getThawId(long workerId) {
//		if (jdId == null) {
//			synchronized (IdWorker.class) {
//				if (jdId == null) {
//					jdId = new IdWorker(workerId);
//				}
//			}
//		}
//		return jdId;
//	}
}
