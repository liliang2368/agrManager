package com.ly.agrManader.dao.bo;

import java.math.BigDecimal;

public class Purchase {
    private Integer purchaseId;

    private String purchaseProduce;

    private String purchaseProduceCode;

    private String purchaseState;

    private BigDecimal purchaseProducePrice;

    private Integer typeId;

    private Integer supplierId;

    private Integer quaityState;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseProduce() {
        return purchaseProduce;
    }

    public void setPurchaseProduce(String purchaseProduce) {
        this.purchaseProduce = purchaseProduce;
    }

    public String getPurchaseProduceCode() {
        return purchaseProduceCode;
    }

    public void setPurchaseProduceCode(String purchaseProduceCode) {
        this.purchaseProduceCode = purchaseProduceCode;
    }

    public String getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(String purchaseState) {
        this.purchaseState = purchaseState;
    }

    public BigDecimal getPurchaseProducePrice() {
        return purchaseProducePrice;
    }

    public void setPurchaseProducePrice(BigDecimal purchaseProducePrice) {
        this.purchaseProducePrice = purchaseProducePrice;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getQuaityState() {
        return quaityState;
    }

    public void setQuaityState(Integer quaityState) {
        this.quaityState = quaityState;
    }
}