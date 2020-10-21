package com.ly.agrManader.dao.bo;

public class Commodity {
    private Integer commodityid;

    private Integer agriculturalproductsid;

    private String commodityname;

    private String measurementmethod;

    private String storagemethod;

    private Integer qualityguaranteeperiod;

    private Integer minstock;

    private Integer stock;

    private Integer maxstock;

    private Integer recommendstock;

    private Double price;

    private Integer grade;

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

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
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

    public Integer getQualityguaranteeperiod() {
        return qualityguaranteeperiod;
    }

    public void setQualityguaranteeperiod(Integer qualityguaranteeperiod) {
        this.qualityguaranteeperiod = qualityguaranteeperiod;
    }

    public Integer getMinstock() {
        return minstock;
    }

    public void setMinstock(Integer minstock) {
        this.minstock = minstock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getMaxstock() {
        return maxstock;
    }

    public void setMaxstock(Integer maxstock) {
        this.maxstock = maxstock;
    }

    public Integer getRecommendstock() {
        return recommendstock;
    }

    public void setRecommendstock(Integer recommendstock) {
        this.recommendstock = recommendstock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}