package com.ly.agrManader.dao.bo;

public class Orderdetails extends OrderdetailsKey {
    private Integer contractid;

    private Integer product;

    private Double unitprice;

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }
}