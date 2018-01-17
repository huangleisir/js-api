package com.jst.prodution.cashdesk.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.cashdesk.listBean.CashDeskSignBBean;

public class CashDeskSignCListBean extends BaseBean {
	private static final long serialVersionUID = 1L;

    private String memberId; //会员号

    private String productCode;//支付分类产品编码
    
    private String productName;//支付产品名称

    private String channelCode; //具体可见渠道表

    private String sourceFrom;//业务来源，1-APP，2-OMS

    private String signDateStartTime;//签约日期

    private String signDateEndTime;//解约日期

    private String unsignDate;//解约日期

    private String state;//0-启用，1-禁用

	private List<CashDeskSignBBean> cashDeskSignBBeanList;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }
    
	public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
    }
    
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSignDateStartTime() {
		return signDateStartTime;
	}
	
	public void setSignDateStartTime(String signDateStartTime) {
		this.signDateStartTime = signDateStartTime;
	}

	public String getSignDateEndTime() {
		return signDateEndTime;
	}

	public void setSignDateEndTime(String signDateEndTime) {
		this.signDateEndTime = signDateEndTime;
	}


	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<CashDeskSignBBean> getCashDeskSignBBeanList() {
		return cashDeskSignBBeanList;
	}

	public void setCashDeskSignBBeanList(List<CashDeskSignBBean> cashDeskSignBBeanList) {
		this.cashDeskSignBBeanList = cashDeskSignBBeanList;
	}

	public String getUnsignDate() {
		return unsignDate;
	}

	public void setUnsignDate(String unsignDate) {
		this.unsignDate = unsignDate;
	}
	
}