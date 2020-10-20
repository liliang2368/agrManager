package com.ly.agrManader.dao.bo;

public class Contractquotation {
    private Integer contractid;

    private String customerdemand;

    private String solution;

    private Double finprice;

    private Integer stats;

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

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Double getFinprice() {
        return finprice;
    }

    public void setFinprice(Double finprice) {
        this.finprice = finprice;
    }

    public Integer getStats() {
        return stats;
    }

    public void setStats(Integer stats) {
        this.stats = stats;
    }
}