
package com.jst.prodution.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

/**
 * 
 * 
 * @Package: com.tomtop.framework.common.utils  
 * @ClassName: SystemPropUtil 
 * @Description:  读取系统属性配置文件类 
 *
 * @author: lixin 
 * @date: 2016年8月24日 下午7:00:17 
 * @version V1.0
 */
public class SystemPropUtil {

//	private static final String WORK_PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//	private static final String SYSTEMPROP_PATH = WORK_PATH + "config" + File.separator + "system.properties";
	public static Map<Object, Object> systemPropMap = new HashMap<Object,Object>();
	
	static {
		if(systemPropMap.isEmpty()){
			try {
				systemPropMap = PropertiesLoaderUtils.loadAllProperties("config/system.properties");
//				Resource resource = new FileSystemResource(SYSTEMPROP_PATH);//获取绝对路径
//				systemPropMap = PropertiesLoaderUtils.loadProperties(resource);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 获取 数字型 值
	 * @param key
	 * @return
	 */
	public static Integer getIntValue(String key){

		String  value = getStringValue(key);
			if (!"" .equals(value)){
				return  Integer.parseInt(value);
			
			
		}

		return null;
	}
	
	/**
	 * 获取 字符串型值
	 * @param key
	 * @return
	 */
	public static String getStringValue(String key){
		
		if(systemPropMap.containsKey(key)){
			Object value = systemPropMap.get(key);
			if (null != value){
				return (String)systemPropMap.get(key);
			}
			
		}
		return "";
	}
	
	

}