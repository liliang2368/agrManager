package com.ly.agrManader.dao.bo;

import java.math.BigDecimal;

public class Commodity {
    private Integer commodityid;

    private Integer agriculturalproductsid;

    private String commodityname;

    private String measurementmethod;

    private String storagemethodstoragemethod;

    private String qualityguaranteeperiod;

    private Integer minstock;

    private Integer stock;

    private Integer maxstock;

    private String recommendstock;

    private BigDecimal price;

    private String grade;

    private BigDecimal costprice;

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

    public String getStoragemethodstoragemethod() {
        return storagemethodstoragemethod;
    }

    public void setStoragemethodstoragemethod(String storagemethodstoragemethod) {
        this.storagemethodstoragemethod = storagemethodstoragemethod;
    }

    public String getQualityguaranteeperiod() {
        return qualityguaranteeperiod;
    }

    public void setQualityguaranteeperiod(String qualityguaranteeperiod) {
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

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }
}