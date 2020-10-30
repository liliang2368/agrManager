package com.ly.agrManader.dao.bo;

public class Contractnegotiation {
    private Integer contractid;

    private String customerdemand;

    private Integer state;

    private Double range;

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public String getCustomerdemand() {
        return customerdemand;
    }

    public void setCustomerdemand(String customerdemand) {
        this.customerdemand = customerdemand;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getRange() {
        return range;
    }

    public void setRange(Double range) {
        this.range = range;
    }
}