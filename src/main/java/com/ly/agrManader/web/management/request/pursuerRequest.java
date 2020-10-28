package com.ly.agrManader.web.management.request;

import com.ly.agrManader.util.PageArg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "采购报表请求对象", description = "采购报表请求对象")
public class pursuerRequest {
    @ApiModelProperty(value = "采购商品规格", name = "specification")
    private String specification;

    @ApiModelProperty(value = "采购主键", name = "purchaseId")
    private Integer purchaseId;

    @ApiModelProperty(value = "采购商品", name = "purchaseProduce")
    private String purchaseProduce;

    @ApiModelProperty(value = "采购状态", name = "purchaseState")
    private String purchaseState;

    @ApiModelProperty(value = "商品类型", name = "purchaseState")
    private Integer typeId;

    @ApiModelProperty(value = "供货商", name = "supplierId")
    private Integer supplierId;

    @ApiModelProperty(value = "是否质检", name = "supplierId")
    private Integer quaityState;

    @ApiModelProperty(value = "采购合同", name = "contractPicture")
    private String contractPicture;

    @ApiModelProperty(value = "采购商品编码", name = "contractPicture")
    private String purchaseCode;

    @ApiModelProperty(value = "采购商品数量", name = "purchaseNum")
    private Integer purchaseNum;

    private PageArg page;

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public PageArg getPage() {
        return page;
    }

    public void setPage(PageArg page) {
        this.page = page;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public void setPurchaseProduce(String purchaseProduce) {
        this.purchaseProduce = purchaseProduce;
    }

    public void setPurchaseState(String purchaseState) {
        this.purchaseState = purchaseState;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public void setQuaityState(Integer quaityState) {
        this.quaityState = quaityState;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public String getPurchaseProduce() {
        return purchaseProduce;
    }

    public String getPurchaseState() {
        return purchaseState;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public Integer getQuaityState() {
        return quaityState;
    }

    public void setContractPicture(String contractPicture) {
        this.contractPicture = contractPicture;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getSpecification() {
        return specification;
    }

    public String getContractPicture() {
        return contractPicture;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }
}
