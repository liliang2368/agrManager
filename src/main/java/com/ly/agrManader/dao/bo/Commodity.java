package com.ly.agrManader.dao.bo;

import java.math.BigDecimal;

public class Commodity {
    private Integer commodityid;

    private Integer agriculturalproductsid;

    private String measurementmethod;

    private String storagemethod;

    private String qualityguaranteeperiod;

    private String minstock;

    private String stock;

    private String maxstock;

    private String recommendstock;

    private BigDecimal price;

    private String grade;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getAgriculturalproductsid() {
        return agriculturalproductsid;
    }

    public void setAgriculturalproductsid(Integer agriculturalproductsid) {
        this.agriculturalproductsid = agriculturalproductsid;
    }

    public String getMeasurementmethod() {
        return measurementmethod;
    }

    public void setMeasurementmethod(String measurementmethod) {
        this.measurementmethod = measurementmethod;
    }

    public String getStoragemethod() {
        return storagemethod;
    }

    public void setStoragemethod(String storagemethod) {
        this.storagemethod = storagemethod;
    }

    public String getQualityguaranteeperiod() {
        return qualityguaranteeperiod;
    }

    public void setQualityguaranteeperiod(String qualityguaranteeperiod) {
        this.qualityguaranteeperiod = qualityguaranteeperiod;
    }

    public String getMinstock() {
        return minstock;
    }

    public void setMinstock(String minstock) {
        this.minstock = minstock;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getMaxstock() {
        return maxstock;
    }

    public void setMaxstock(String maxstock) {
        this.maxstock = maxstock;
    }

    public String getRecommendstock() {
        return recommendstock;
    }

    public void setRecommendstock(String recommendstock) {
        this.recommendstock = recommendstock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}