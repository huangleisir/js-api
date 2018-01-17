package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantBank;
import com.jst.prodution.merchant.model.MerchantBase;
import com.jst.prodution.merchant.model.MerchantImage;
import com.jst.prodution.merchant.model.MerchantPayConf;
import com.jst.prodution.merchant.model.MerchantPayProduct;
import com.jst.prodution.merchant.model.MerchantSettlement;
import com.jst.prodution.merchant.model.MerchantSettlementConf;

/**
 * 商户注册申请（修改）bean
 * @author 吴安辉
 *
 */
public class MerchApplyBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
    private String payPassWord;             //支付密码
    private String passWord;                //登录密码
    
	private MerchantBase merchantBase;					//商户基本信息
	
	private MerchantBank merchantBank;					//商户开户银行
	
	private List<MerchantImage> merchantImageList;		//商户图片相关	
	
	private MerchantSettlement merchantSettlement;		//商户结算相关
	
	private List<MerchantSettlementConf> merchantSettlementConfList;     //商户结算相关
	
	private List<MerchantPayConf> merchantPayConfList;         //支付权限
	
	private List<MerchantPayProduct> merchantPayProductList;//支付产品

	public MerchantBase getMerchantBase() {
		return merchantBase;
	}

	public void setMerchantBase(MerchantBase merchantBase) {
		this.merchantBase = merchantBase;
	}

	public MerchantBank getMerchantBank() {
		return merchantBank;
	}

	public void setMerchantBank(MerchantBank merchantBank) {
		this.merchantBank = merchantBank;
	}

	public List<MerchantImage> getMerchantImageList() {
		return merchantImageList;
	}

	public void setMerchantImageList(List<MerchantImage> merchantImageList) {
		this.merchantImageList = merchantImageList;
	}

	public MerchantSettlement getMerchantSettlement() {
		return merchantSettlement;
	}

	public void setMerchantSettlement(MerchantSettlement merchantSettlement) {
		this.merchantSettlement = merchantSettlement;
	}

    /**
     * @return the merchantSettlementConfList
     */
    public List<MerchantSettlementConf> getMerchantSettlementConfList() {
        return merchantSettlementConfList;
    }

    /**
     * @param merchantSettlementConfList the merchantSettlementConfList to set
     */
    public void setMerchantSettlementConfList(List<MerchantSettlementConf> merchantSettlementConfList) {
        this.merchantSettlementConfList = merchantSettlementConfList;
    }

    /**
     * @return the merchantPayConfList
     */
    public List<MerchantPayConf> getMerchantPayConfList() {
        return merchantPayConfList;
    }

    /**
     * @param merchantPayConfList the merchantPayConfList to set
     */
    public void setMerchantPayConfList(List<MerchantPayConf> merchantPayConfList) {
        this.merchantPayConfList = merchantPayConfList;
    }

    /**
     * @return the merchantPayProductList
     */
    public List<MerchantPayProduct> getMerchantPayProductList() {
        return merchantPayProductList;
    }

    /**
     * @param merchantPayProductList the merchantPayProductList to set
     */
    public void setMerchantPayProductList(List<MerchantPayProduct> merchantPayProductList) {
        this.merchantPayProductList = merchantPayProductList;
    }

    /**
     * @return the payPassWord
     */
    public String getPayPassWord() {
        return payPassWord;
    }

    /**
     * @param payPassWord the payPassWord to set
     */
    public void setPayPassWord(String payPassWord) {
        this.payPassWord = payPassWord;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
