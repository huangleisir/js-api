package com.jst.prodution.merchant.model;

import java.util.List;

public class MerchantPayConf extends MerchantPayConfKey implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String seqQueue;

    private String isAllRight;
    
    private String preSeq;
    
    private List<MerchantPayProductModel> merchantPayProduct;
    
   	public List<MerchantPayProductModel> getMerchantPayProduct() {
   		return merchantPayProduct;
   	}

   	public void setMerchantPayProduct(List<MerchantPayProductModel> merchantPayProduct) {
   		this.merchantPayProduct = merchantPayProduct;
   	}
	public String getSeqQueue() {
        return seqQueue;
    }

    public void setSeqQueue(String seqQueue) {
        this.seqQueue = seqQueue == null ? null : seqQueue.trim();
    }

    public String getIsAllRight() {
        return isAllRight;
    }

    public void setIsAllRight(String isAllRight) {
        this.isAllRight = isAllRight == null ? null : isAllRight.trim();
    }

    /**
     * @return the preSeq
     */
    public String getPreSeq() {
        return preSeq;
    }

    /**
     * @param preSeq the preSeq to set
     */
    public void setPreSeq(String preSeq) {
        this.preSeq = preSeq;
    }
}