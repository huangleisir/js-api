package com.jst.prodution.util;

import com.jst.prodution.constants.ApiConstants;

public class StringUtils {
	
	/**
	 * @desc 参数的前后加%
	 * @author junfu_yuan
	 * @date 2016年10月9日
	 * @param value
	 * @return
	 */
	public static String addLikeParam(String value) {
		if (org.apache.commons.lang3.StringUtils.isBlank(value)) {
			return value;
		}
		return new StringBuilder(ApiConstants.PERSENT).append(value).append(ApiConstants.PERSENT).toString();
	}

	/**
	 * @desc 返回操作人
	 * 	为空返回99
	 * @author junfu_yuan
	 * @date 2016年10月14日
	 * @param operUser
	 * @return
	 */
	public static String getOperUser(String operUser) {
		if (org.apache.commons.lang3.StringUtils.isNotBlank(operUser)) {
			return operUser;
		}
		return ApiConstants.SYSTEM_OPER_USER;
	}
	
	/**
	 * 检查
	 * @param subString
	 * @return
	 */
	public static boolean isContainIllegalityStr(String originalStr, String[] subStrings){
		if(org.apache.commons.lang3.StringUtils.isBlank(originalStr)){
			return false;
		}
		if(subStrings == null){
			subStrings = ApiConstants.ILLEGALITYSTR;
		}
		for (String subStr : subStrings) {
			if(originalStr.contains(subStr)){
				return true;
			}
		}
		return false;
	}
}
