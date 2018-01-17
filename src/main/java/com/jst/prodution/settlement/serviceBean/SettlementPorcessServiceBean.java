/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.settlement.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.settlement.serviceBean  
 * @ClassName: SettlementPorcessServiceBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年6月14日 下午8:53:42 
 * @version V1.0 
 

 */
public class SettlementPorcessServiceBean extends BaseBean {
        /**
     * 
     */
    private static final long serialVersionUID = 1L;

         private  String payAcctType;  //账户类型(01-基本户,02-待结算账户,03-备付金账户,04-待清算账户, 05-代扣长款户,06-代付长款户,07-代扣短款户,08-代付短款户,09-贷款收款户,10-贷款付款户)

        private String tranSeq;
    
        private String settType;
    
        private Integer settlementDate;
        
        private Long settAmount;
                
        private String outMchmemId;

        private String inMchmemId;
       
        private String inBankCard;
    
        private String inBankcardName;
    
        private String inBankName;
    
        private String inBankCode;
    
        private String inCcpcCode;
    
        private String inBankBranch;
                
        private String remark;

	    public SettlementPorcessServiceBean() {
	    }
	    public String getPayAcctType() {
	        return payAcctType;
	    }
	
	    public void setPayAcctType(String payAcctType) {
	        this.payAcctType = payAcctType;
	    }
	    public String getSettType() {
            return settType;
        }

        public void setSettType(String settType) {
            this.settType = settType;
        }

        public Integer getSettlementDate() {
            return settlementDate;
        }

        public void setSettlementDate(Integer settlementDate) {
            this.settlementDate = settlementDate;
        }

        public Long getSettAmount() {
            return settAmount;
        }

        public void setSettAmount(Long settAmount) {
            this.settAmount = settAmount;
        }

        public String getOutMchmemId() {
            return outMchmemId;
        }

        public void setOutMchmemId(String outMchmemId) {
            this.outMchmemId = outMchmemId;
        }

        public String getInMchmemId() {
            return inMchmemId;
        }

        public void setInMchmemId(String inMchmemId) {
            this.inMchmemId = inMchmemId;
        }

        public String getInBankCard() {
            return inBankCard;
        }

        public void setInBankCard(String inBankCard) {
            this.inBankCard = inBankCard;
        }

        public String getInBankcardName() {
            return inBankcardName;
        }

        public void setInBankcardName(String inBankcardName) {
            this.inBankcardName = inBankcardName;
        }

        public String getInBankName() {
            return inBankName;
        }

        public void setInBankName(String inBankName) {
            this.inBankName = inBankName;
        }

        public String getInBankCode() {
            return inBankCode;
        }

        public void setInBankCode(String inBankCode) {
            this.inBankCode = inBankCode;
        }

        public String getInCcpcCode() {
            return inCcpcCode;
        }

        public void setInCcpcCode(String inCcpcCode) {
            this.inCcpcCode = inCcpcCode;
        }

        public String getInBankBranch() {
            return inBankBranch;
        }

        public void setInBankBranch(String inBankBranch) {
            this.inBankBranch = inBankBranch;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTranSeq() {
            return tranSeq;
        }

        public void setTranSeq(String tranSeq) {
            this.tranSeq = tranSeq;
        }
}
