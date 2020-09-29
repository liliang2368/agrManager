package com.ly.agrManader.dao.bo;

import java.math.BigDecimal;

public class Agrproduce {
    private Integer produceId;

    private String produceName;

    private BigDecimal price;

    private String picture;

    private Integer num;

    private String produceAddr;

    private String produceType;

    public Integer getProduceId() {
        return produceId;
    }

    public void setProduceId(Integer produceId) {
        this.produceId = produceId;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getProduceAddr() {
        return produceAddr;
    }

    public void setProduceAddr(String produceAddr) {
        this.produceAddr = produceAddr;
    }

    public String getProduceType() {
        return produceType;
    }

    public void setProduceType(String produceType) {
        this.produceType = produceType;
    }
}