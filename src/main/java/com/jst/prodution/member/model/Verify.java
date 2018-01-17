package com.jst.prodution.member.model;

import com.jst.prodution.base.bean.BaseBean;

/** 
* @ClassName: Verify 
* @Description: TODO(验证码信息表) 
* @author  
* @date 2014-10-26 下午12:04:12 
*  
*/
public class Verify extends BaseBean{

	// Fields
	private static final long serialVersionUID = 1L;
	private String ver_id;     
	private String ver_type;   
	private String random;     
	private String instim;     
	private String timeout;    
	private String ver_adm;    
	private String ver_tran_no;
	private String service_type;
	
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	/**
	 * @return the ver_id
	 */
	public String getVer_id() {
		return ver_id;
	}
	/**
	 * @param ver_id the ver_id to set
	 */
	public void setVer_id(String ver_id) {
		this.ver_id = ver_id;
	}
	/**
	 * @return the ver_type
	 */
	public String getVer_type() {
		return ver_type;
	}
	/**
	 * @param ver_type the ver_type to set
	 */
	public void setVer_type(String ver_type) {
		this.ver_type = ver_type;
	}
	/**
	 * @return the random
	 */
	public String getRandom() {
		return random;
	}
	/**
	 * @param random the random to set
	 */
	public void setRandom(String random) {
		this.random = random;
	}
	/**
	 * @return the instim
	 */
	public String getInstim() {
		return instim;
	}
	/**
	 * @param instim the instim to set
	 */
	public void setInstim(String instim) {
		this.instim = instim;
	}
	/**
	 * @return the timeout
	 */
	public String getTimeout() {
		return timeout;
	}
	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	/**
	 * @return the ver_adm
	 */
	public String getVer_adm() {
		return ver_adm;
	}
	/**
	 * @param ver_adm the ver_adm to set
	 */
	public void setVer_adm(String ver_adm) {
		this.ver_adm = ver_adm;
	}
	/**
	 * @return the ver_tran_no
	 */
	public String getVer_tran_no() {
		return ver_tran_no;
	}
	/**
	 * @param ver_tran_no the ver_tran_no to set
	 */
	public void setVer_tran_no(String ver_tran_no) {
		this.ver_tran_no = ver_tran_no;
	}
	/**
	 * @param ver_id
	 * @param ver_type
	 * @param random
	 * @param instim
	 * @param timeout
	 * @param ver_adm
	 * @param ver_tran_no
	 */
	public Verify(String ver_id, String ver_type, String random,
			String instim, String timeout, String ver_adm, String ver_tran_no) {
		this.ver_id = ver_id;
		this.ver_type = ver_type;
		this.random = random;
		this.instim = instim;
		this.timeout = timeout;
		this.ver_adm = ver_adm;
		this.ver_tran_no = ver_tran_no;
	}
	
	/**
	 * 
	 */
	public Verify() {
	}

}