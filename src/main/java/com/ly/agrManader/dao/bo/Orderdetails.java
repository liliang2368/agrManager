package com.ly.agrManader.dao.bo;

public class Orderdetails {
    private Integer detailsid;

    private Integer contractid;

    private String product;

    private Integer number;

    private Double unitprice;

    public Integer getDetailsid() {
        return detailsid;
    }

    public void setDetailsid(Integer detailsid) {
        this.detailsid = detailsid;
    }

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }
}