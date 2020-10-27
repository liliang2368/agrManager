package com.ly.agrManader.web.api.marketing.request;

import java.util.Date;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/23 3:23 下午
 */

public class ContractRequest {
    private Integer contractid;

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
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
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
}
