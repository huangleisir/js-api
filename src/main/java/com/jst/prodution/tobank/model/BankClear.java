package com.jst.prodution.tobank.model;

public class BankClear implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private String clearNo;

    private String clearType;

    private String clearBankName;

    private String clearBankSname;

    public String getClearNo() {
        return clearNo;
    }

    public void setClearNo(String clearNo) {
        this.clearNo = clearNo == null ? null : clearNo.trim();
    }

    public String getClearType() {
        return clearType;
    }

    public void setClearType(String clearType) {
        this.clearType = clearType == null ? null : clearType.trim();
    }

    public String getClearBankName() {
        return clearBankName;
    }

    public void setClearBankName(String clearBankName) {
        this.clearBankName = clearBankName == null ? null : clearBankName.trim();
    }

    public String getClearBankSname() {
        return clearBankSname;
    }

    public void setClearBankSname(String clearBankSname) {
        this.clearBankSname = clearBankSname == null ? null : clearBankSname.trim();
    }
}