package com.jst.prodution.common.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.common.model.UBankCodeModel;

public class UBankCodeBean extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String id;          //银行编码
    private String name;        //名称
    private String upid;            //银行类别编码
    private String code;        //地区编码
	private List<UBankCodeModel> ubank;
	public List<UBankCodeModel> getUbank() {
		return ubank;
	}
	public void setUbank(List<UBankCodeModel> ubank) {
		this.ubank = ubank;
	}
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the upid
     */
    public String getUpid() {
        return upid;
    }
    /**
     * @param upid the upid to set
     */
    public void setUpid(String upid) {
        this.upid = upid;
    }
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }
    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
	
}
