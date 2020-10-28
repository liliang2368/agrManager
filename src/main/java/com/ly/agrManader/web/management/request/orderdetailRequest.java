package com.ly.agrManader.web.management.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/22 12:36 上午
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "订单详细商品请求对象", description = "订单详细商品")
public class orderdetailRequest {

    @ApiModelProperty(value = "合同外键", name = "contractid")
    private Integer contractid;

    @ApiModelProperty(value = "商品编号", name = "product")
    private Integer product;

    @ApiModelProperty(value = "数量", name = "number")
    private Integer number;

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
