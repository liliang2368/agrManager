package com.ly.agrManader.dao.bo;

public class Stock {
    private Integer stockId;

    private String stockProduct;

    private Integer stockNum;

    private String stockState;

    private String producePhoto;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(String stockProduct) {
        this.stockProduct = stockProduct;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public String getStockState() {
        return stockState;
    }

    public void setStockState(String stockState) {
        this.stockState = stockState;
    }

    public String getProducePhoto() {
        return producePhoto;
    }

    public void setProducePhoto(String producePhoto) {
        this.producePhoto = producePhoto;
    }
}