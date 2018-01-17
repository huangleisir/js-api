package com.jst.prodution.util;

import java.math.BigDecimal;

public class BigDecimalUtil {
	
	/**
	 * 
	 * @Title: toBigDecimal   
	 * @Description:保留两位小数  
	 * @param: @param num
	 * @param: @return      
	 * @return: BigDecimal      
	 * @throws
	 */
	public static BigDecimal toBigDecimal(Long num){
		BigDecimal tranAmtBigDec = new BigDecimal(num);  
	    BigDecimal d100 = new BigDecimal(100);  
	    BigDecimal fee = tranAmtBigDec.divide(d100,2,2);//小数点2位  
		return fee;
	}
}
