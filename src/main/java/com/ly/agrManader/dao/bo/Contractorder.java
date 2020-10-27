package com.ly.agrManader.dao.bo;

import java.util.Date;

public class Contractorder {
    private Integer contractId;

    private Integer examine;

    private Integer preamount;

    private Integer finamount;

    private Integer paymentstate;

    private Integer qualitystate;

    private Integer warehous;

    private Integer orderprocess;

    private Integer customerid;

    private Date time;

    public Integer getContractid() {
        return contractId;
    }

    public void setContractid(Integer contractid) {
        this.contractId = contractid;
    }

    public Integer getExamine() {
        return examine;
    }

    public void setExamine(Integer examine) {
        this.examine = examine;
    }

    public Integer getPreamount() {
        return preamount;
    }

    public void setPreamount(Integer preamount) {
        this.preamount = preamount;
    }

    public Integer getFinamount() {
        return finamount;
    }

    public void setFinamount(Integer finamount) {
        this.finamount = finamount;
    }

    public Integer getPaymentstate() {
        return paymentstate;
    }

    public void setPaymentstate(Integer paymentstate) {
        this.paymentstate = paymentstate;
    }

    public Integer getQualitystate() {
        return qualitystate;
    }

    public void setQualitystate(Integer qualitystate) {
        this.qualitystate = qualitystate;
    }

    public Integer getWarehous() {
        return warehous;
    }

    public void setWarehous(Integer warehous) {
        this.warehous = warehous;
    }

    public Integer getOrderprocess() {
        return orderprocess;
    }

    public void setOrderprocess(Integer orderprocess) {
        this.orderprocess = orderprocess;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Contractorder{" +
                "contractid=" + contractId +
                ", examine=" + examine +
                ", preamount=" + preamount +
                ", finamount=" + finamount +
                ", paymentstate=" + paymentstate +
                ", qualitystate=" + qualitystate +
                ", warehous=" + warehous +
                ", orderprocess=" + orderprocess +
                ", customerid=" + customerid +
                ", time=" + time +
                '}';
    }
}