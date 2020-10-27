package com.ly.agrManader.dao.bo;

import java.util.Date;

public class Preprice {
    private Integer preproductid;

    private Integer commodityid;

    private String measurementmethod;

    private Double tradeprice;

    private String wholesalername;

    private Double marketprice;

    private String marketname;

    private Date time;

    private Date inputtime;

    public Integer getPreproductid() {
        return preproductid;
    }

    public void setPreproductid(Integer preproductid) {
        this.preproductid = preproductid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getMeasurementmethod() {
        return measurementmethod;
    }

    public void setMeasurementmethod(String measurementmethod) {
        this.measurementmethod = measurementmethod;
    }

    public Double getTradeprice() {
        return tradeprice;
    }

    public void setTradeprice(Double tradeprice) {
        this.tradeprice = tradeprice;
    }

    public String getWholesalername() {
        return wholesalername;
    }

    public void setWholesalername(String wholesalername) {
        this.wholesalername = wholesalername;
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public String getMarketname() {
        return marketname;
    }

    public void setMarketname(String marketname) {
        this.marketname = marketname;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getInputtime() {
        return inputtime;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

}