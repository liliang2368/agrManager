package com.ly.agrManader.web.api.marketing.request;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/22 12:36 上午
 */

public class orderdetailRequest {
    private Integer contractid;

    private Integer product;

    private Integer number;

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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
