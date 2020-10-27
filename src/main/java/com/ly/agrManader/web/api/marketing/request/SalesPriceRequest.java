package com.ly.agrManader.web.api.marketing.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/26 7:14 下午
 */
@ToString
@Setter
@Getter
public class SalesPriceRequest {


    /**
     * 市场调研审核和需求
     */
    @ApiModelProperty(value = "销售定价ID", name = "contractid")
    private Integer contractid;

    @ApiModelProperty(value = "客户需求", name = "customerdemand")
    private String customerdemand;

    @ApiModelProperty(value = "解决方案", name = "solution")
    private String solution;

    @ApiModelProperty(value = "定价", name = "finprice")
    private Double finprice;

    @ApiModelProperty(value = "审核状态", name = "stats")
    private Integer stats;

    /**
     * 调研到的信息
     */
    @ApiModelProperty(value = "市场调研ID", name = "preproductid")
    private Integer preproductid;

    @ApiModelProperty(value = "计量方式", name = "measurementmethod")
    private String measurementmethod;

    @ApiModelProperty(value = "市场批发商价格", name = "tradeprice")
    private Double tradeprice;

    @ApiModelProperty(value = "批发商名称", name = "wholesalername")
    private String wholesalername;

    @ApiModelProperty(value = "农贸市场价格", name = "marketprice")
    private Double marketprice;

    @ApiModelProperty(value = "农贸市场名字", name = "marketprice")
    private String marketname;

    @ApiModelProperty(value = "调研时间", name = "time")
    private Date time;

    @ApiModelProperty(value = "录入时间", name = "inputtime")
    private Date inputtime;


}
