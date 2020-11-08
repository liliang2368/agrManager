package com.ly.agrManader.dao.bo;

import java.util.Date;

public class Purchase {
    private Integer purchaseid;

    private String purchasename;

    private String purchasecode;

    private Integer purchasenum;

    private Integer supplierid;

    private String specification;

    private Date purchasetime;

    private String contractpicture;

    private String quaitystate;

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getPurchasename() {
        return purchasename;
    }

    public void setPurchasename(String purchasename) {
        this.purchasename = purchasename;
    }

    public String getPurchasecode() {
        return purchasecode;
    }

    public void setPurchasecode(String purchasecode) {
        this.purchasecode = purchasecode;
    }

    public Integer getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(Integer purchasenum) {
        this.purchasenum = purchasenum;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Date getPurchasetime() {
        return purchasetime;
    }

    public void setPurchasetime(Date purchasetime) {
        this.purchasetime = purchasetime;
    }

    public String getContractpicture() {
        return contractpicture;
    }

    public void setContractpicture(String contractpicture) {
        this.contractpicture = contractpicture;
    }

    public String getQuaitystate() {
        return quaitystate;
    }

    public void setQuaitystate(String quaitystate) {
        this.quaitystate = quaitystate;
    }
}