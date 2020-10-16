package com.ly.agrManader.dao.bo;

import java.math.BigDecimal;

public class Produce {
    private Integer produceId;

    private Integer supplierId;

    private String produceCode;

    private String produceName;

    private BigDecimal producePrice;

    private String producePriceOridry;

    private String produceInfo;

    private String producePircture;

    private String produceState;

    public Integer getProduceId() {
        return produceId;
    }

    public void setProduceId(Integer produceId) {
        this.produceId = produceId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getProduceCode() {
        return produceCode;
    }

    public void setProduceCode(String produceCode) {
        this.produceCode = produceCode;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }

    public BigDecimal getProducePrice() {
        return producePrice;
    }

    public void setProducePrice(BigDecimal producePrice) {
        this.producePrice = producePrice;
    }

    public String getProducePriceOridry() {
        return producePriceOridry;
    }

    public void setProducePriceOridry(String producePriceOridry) {
        this.producePriceOridry = producePriceOridry;
    }

    public String getProduceInfo() {
        return produceInfo;
    }

    public void setProduceInfo(String produceInfo) {
        this.produceInfo = produceInfo;
    }

    public String getProducePircture() {
        return producePircture;
    }

    public void setProducePircture(String producePircture) {
        this.producePircture = producePircture;
    }

    public String getProduceState() {
        return produceState;
    }

    public void setProduceState(String produceState) {
        this.produceState = produceState;
    }
}