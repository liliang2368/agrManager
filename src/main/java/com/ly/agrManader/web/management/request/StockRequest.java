package com.ly.agrManader.web.management.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "库存请求对象", description = "库存请求对象")
public class StockRequest {

    @ApiModelProperty(value = "库存ID", name = "specification")
    private Integer stockId;

    @ApiModelProperty(value = "商品名称", name = "specification")
    private String stockProduct;

    @ApiModelProperty(value = "商品名称ID", name = "specification")
    private String stockProductCode;

    @ApiModelProperty(value = "商品库存数量", name = "specification")
    private Integer stockNum;

    @ApiModelProperty(value = "商品库存状态", name = "specification")
    private String stockState;

    @ApiModelProperty(value = "商品图片", name = "specification")
    private String producePhoto;

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public void setStockProduct(String stockProduct) {
        this.stockProduct = stockProduct;
    }

    public void setStockProductCode(String stockProductCode) {
        this.stockProductCode = stockProductCode;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public void setStockState(String stockState) {
        this.stockState = stockState;
    }

    public void setProducePhoto(String producePhoto) {
        this.producePhoto = producePhoto;
    }

    public Integer getStockId() {
        return stockId;
    }

    public String getStockProduct() {
        return stockProduct;
    }

    public String getStockProductCode() {
        return stockProductCode;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public String getStockState() {
        return stockState;
    }

    public String getProducePhoto() {
        return producePhoto;
    }
}
