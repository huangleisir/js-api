/**
 * author:汤广海
 * 2016年10月11日
 * 上午10:43:02
 */
package com.jst.prodution.util;

import org.slf4j.LoggerFactory;

/**
 * @author Administrator
 *
 */
public class ILogger {
	private String logMode = "";
	private String errorMode;
	private org.slf4j.Logger logger = null;

	private static final String LOGGER_FORMAT_STR = "【{}】：{}";
	private static final String LOGGER_FORMAT_STR2 = "【{}】：";

	public ILogger(String logMode, Class<?> logClass) {
		this.logMode = logMode;
		this.errorMode = "【" + this.logMode + "】:";
		this.logger = LoggerFactory.getLogger(logClass);
	}

	public void debug(Object logMsg) {
		this.logger.debug(LOGGER_FORMAT_STR, this.logMode, logMsg);
	}

	public void debug(Object logMsg, Object... args) {
		this.logger.debug(LOGGER_FORMAT_STR2 + logMsg, getParams(args));
	}

	public void info(Object logMsg) {
		this.logger.info(LOGGER_FORMAT_STR, this.logMode, logMsg);
	}

	public void info(Object logMsg, Object... args) {
//		StringBuilder builder = new StringBuilder(LOGGER_FORMAT_STR2);
//		builder.append(logMsg);
//		this.logger.info("logMsg=" + builder.toString());
//		this.logger.info(builder.toString(), getParams(args));
		this.logger.info(LOGGER_FORMAT_STR2 + logMsg, getParams(args));
	}

	public void warn(Object logMsg) {
		this.logger.warn(LOGGER_FORMAT_STR, this.logMode, logMsg);
	}

	public void warn(Object logMsg, Object... args) {
		this.logger.warn(LOGGER_FORMAT_STR2 + logMsg, getParams(args));
	}

	public void warn(Object logMsg, Throwable t) {
		this.logger.warn(LOGGER_FORMAT_STR, this.logMode, logMsg, t);
	}

	public void warn(Object logMsg, Exception e) {
		this.logger.warn(this.errorMode + logMsg, e);
	}

	public void error(Object logMsg) {
		this.logger.error(this.errorMode + logMsg);
	}

	public void error(Object logMsg, Object... args) {
		this.logger.error(LOGGER_FORMAT_STR2 + logMsg, getParams(args));
	}

	public void error(Object logMsg, Throwable t) {
		this.logger.error(this.errorMode + logMsg, t);
	}

	public void error(Object logMsg, Exception e) {
		this.logger.error(this.errorMode + logMsg, e);
	}

	public boolean isDebugEnabled() {
		return this.logger.isDebugEnabled();
	}
	
	private Object[] getParams(Object... args) {
		Object[] objects = new Object[args.length + 1];
		objects[0] = this.logMode;
		System.arraycopy(args, 0, objects, 1, args.length);
		return objects;
	}
}
