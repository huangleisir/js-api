package com.jst.prodution.merchant.serviceBean;

import java.util.List;
import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

public class CardAccountBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	
	private String jstMerchantId;//卡系统商户号
	private String txnChannel;//支付渠道
	private List<CardAccountRecordBean>  cardAccountRecordList;
	
	public String getJstMerchantId() {
		return jstMerchantId;
	}
	public void setJstMerchantId(String jstMerchantId) {
		this.jstMerchantId = jstMerchantId;
	}
    public String getTxnChannel() {
        return txnChannel;
    }
    public void setTxnChannel(String txnChannel) {
        this.txnChannel = txnChannel;
    }
    public List<CardAccountRecordBean> getCardAccountRecordList() {
        return cardAccountRecordList;
    }
    public void setCardAccountRecordList(List<CardAccountRecordBean> cardAccountRecordList) {
        this.cardAccountRecordList = cardAccountRecordList;
    }
    @Override
    public String toString() {
        return "CardAccountBean [jstMerchantId=" + jstMerchantId + ", cardAccountRecordList=" + cardAccountRecordList
                + "]";
    }
	
    
}
