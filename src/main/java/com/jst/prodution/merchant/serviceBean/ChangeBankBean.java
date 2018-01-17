package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 修改打款认证银行Bean
 * @author 吴安辉
 *
 */
public class ChangeBankBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String listId;					//清单ID
	private String bankName;				//银行名称
	private String bankCode;				//银行编号
	private String openProvince;			//开户省
	private String openCity;				//开户市
	private String openBranbank;			//开户支行名称
	private String bankCardNo;				//修改的银行卡号
	private String pbocPayno;             //联行支付行行号
    private String bankPbocCode;        

    private String openCityCode;
    private String isDefault;           //1-默认,0-不是默认

    private String verifyFlag;          //0--未鉴权,1--已鉴权
	public String getListId() {
		return listId;
	}
	public void setListId(String listId) {
		this.listId = listId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getOpenProvince() {
		return openProvince;
	}
	public void setOpenProvince(String openProvince) {
		this.openProvince = openProvince;
	}
	public String getOpenCity() {
		return openCity;
	}
	public void setOpenCity(String openCity) {
		this.openCity = openCity;
	}
	public String getOpenBranbank() {
		return openBranbank;
	}
	public void setOpenBranbank(String openBranbank) {
		this.openBranbank = openBranbank;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
    /**
     * @return the pbocPayno
     */
    public String getPbocPayno() {
        return pbocPayno;
    }
    /**
     * @param pbocPayno the pbocPayno to set
     */
    public void setPbocPayno(String pbocPayno) {
        this.pbocPayno = pbocPayno;
    }
    public String getBankPbocCode() {
        return bankPbocCode;
    }
    public void setBankPbocCode(String bankPbocCode) {
        this.bankPbocCode = bankPbocCode;
    }
    public String getOpenCityCode() {
        return openCityCode;
    }
    public void setOpenCityCode(String openCityCode) {
        this.openCityCode = openCityCode;
    }
    public String getIsDefault() {
        return isDefault;
    }
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
    public String getVerifyFlag() {
        return verifyFlag;
    }
    public void setVerifyFlag(String verifyFlag) {
        this.verifyFlag = verifyFlag;
    }
}
