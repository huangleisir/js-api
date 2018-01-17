package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantBank;
import com.jst.prodution.merchant.model.MerchantBase;
import com.jst.prodution.merchant.model.MerchantImage;
import com.jst.prodution.merchant.model.MerchantMenu;
import com.jst.prodution.merchant.model.MerchantMenuCtrl;
import com.jst.prodution.merchant.model.MerchantPayConf;
import com.jst.prodution.merchant.model.MerchantSettlement;
import com.jst.prodution.merchant.model.MerchantSettlementConf;

/**
 * 查询单个商户信息bean
 * @author 吴安辉
 *
 */
public class QuerySingleMerchantBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	
	private String id;									//商户ID
	private String merchanId;                                 //商户号
	private String imageFlag;							//是否要查询图片：1是
	private String imageType;							//图片类型：1 LOGO 2营业执照 3 法人证件照 4商务人员证件照
	private String imageState;							//图片状态：1正在使用 2未使用
	private String bankFlag;							//是否要查询银行卡：1是
	private String bankType;							//认证类型：1待认证  2已认证  3已作废
	private String bankState;							//银行卡状态：1 正在使用 2未使用
	private String settleFlag;							//是否要查询结算信息：1是
	private String settleType;							//结算类型：1结算
	private String settleState;							//结算状态：1 正在使用 2未使用
	private String payConfFlag;                            //是否查询产品 1是
	private MerchantBase base;							//基本信息
	private List<MerchantImage> imageList;				//图片信息列表
	private List<MerchantBank> bankList;				//银行信息列表
	private List<MerchantSettlement> settlementList;	//结算列表
	private List<MerchantSettlementConf> merchantSettlementConfList;     //商户结算相关
	private List<MerchantPayConf> merchantPayConf;
	private List<MerchantMenu> merchantMenuList;	//商户权限管理树
	private String upMerchantId;	//上级商户号
	
	public List<MerchantPayConf> getMerchantPayConf() {
		return merchantPayConf;
	}
	public void setMerchantPayConf(List<MerchantPayConf> merchantPayConf) {
		this.merchantPayConf = merchantPayConf;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImageFlag() {
		return imageFlag;
	}
	public void setImageFlag(String imageFlag) {
		this.imageFlag = imageFlag;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getImageState() {
		return imageState;
	}
	public void setImageState(String imageState) {
		this.imageState = imageState;
	}
	public String getBankFlag() {
		return bankFlag;
	}
	public void setBankFlag(String bankFlag) {
		this.bankFlag = bankFlag;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getBankState() {
		return bankState;
	}
	public void setBankState(String bankState) {
		this.bankState = bankState;
	}
	public String getSettleFlag() {
		return settleFlag;
	}
	public void setSettleFlag(String settleFlag) {
		this.settleFlag = settleFlag;
	}
	public String getSettleType() {
		return settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}
	public String getSettleState() {
		return settleState;
	}
	public void setSettleState(String settleState) {
		this.settleState = settleState;
	}
	public MerchantBase getBase() {
		return base;
	}
	public void setBase(MerchantBase base) {
		this.base = base;
	}
	public List<MerchantImage> getImageList() {
		return imageList;
	}
	public void setImageList(List<MerchantImage> imageList) {
		this.imageList = imageList;
	}
	public List<MerchantBank> getBankList() {
		return bankList;
	}
	public void setBankList(List<MerchantBank> bankList) {
		this.bankList = bankList;
	}
	public List<MerchantSettlement> getSettlementList() {
		return settlementList;
	}
	public void setSettlementList(List<MerchantSettlement> settlementList) {
		this.settlementList = settlementList;
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
    public String getPayConfFlag() {
        return payConfFlag;
    }
    public void setPayConfFlag(String payConfFlag) {
        this.payConfFlag = payConfFlag;
    }
    public String getMerchanId() {
        return merchanId;
    }
    public void setMerchanId(String merchanId) {
        this.merchanId = merchanId;
    }
	public List<MerchantMenu> getMerchantMenuList() {
		return merchantMenuList;
	}
	public void setMerchantMenuList(List<MerchantMenu> merchantMenuList) {
		this.merchantMenuList = merchantMenuList;
	}
	public String getUpMerchantId() {
		return upMerchantId;
	}
	public void setUpMerchantId(String upMerchantId) {
		this.upMerchantId = upMerchantId;
	}

}
