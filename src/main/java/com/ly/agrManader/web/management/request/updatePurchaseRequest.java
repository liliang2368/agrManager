package com.ly.agrManader.web.management.request;

public class updatePurchaseRequest {
    private  Integer quaityState;
    private String purchaseState;
    private Integer purchaseId;

    public updatePurchaseRequest() {
    }

    public updatePurchaseRequest(Integer quaityState, String  purchaseState, Integer purchaseId) {
        this.quaityState = quaityState;
        this.purchaseState = purchaseState;
        this.purchaseId = purchaseId;
    }

    public Integer getQuaityState() {
        return quaityState;
    }

    public void setQuaityState(Integer quaityState) {
        this.quaityState = quaityState;
    }

    public String getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(String  purchaseState) {
        this.purchaseState = purchaseState;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }
}
