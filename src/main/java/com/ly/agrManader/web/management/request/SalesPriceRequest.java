package com.ly.agrManader.web.management.request;

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

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public void setCustomerdemand(String customerdemand) {
        this.customerdemand = customerdemand;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public void setFinprice(Double finprice) {
        this.finprice = finprice;
    }

    public void setStats(Integer stats) {
        this.stats = stats;
    }

    public void setPreproductid(Integer preproductid) {
        this.preproductid = preproductid;
    }

    public void setMeasurementmethod(String measurementmethod) {
        this.measurementmethod = measurementmethod;
    }

    public void setTradeprice(Double tradeprice) {
        this.tradeprice = tradeprice;
    }

    public void setWholesalername(String wholesalername) {
        this.wholesalername = wholesalername;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public void setMarketname(String marketname) {
        this.marketname = marketname;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

    public Integer getContractid() {
        return contractid;
    }

    public String getCustomerdemand() {
        return customerdemand;
    }

    public String getSolution() {
        return solution;
    }

    public Double getFinprice() {
        return finprice;
    }

    public Integer getStats() {
        return stats;
    }

    public Integer getPreproductid() {
        return preproductid;
    }

    public String getMeasurementmethod() {
        return measurementmethod;
    }

    public Double getTradeprice() {
        return tradeprice;
    }

    public String getWholesalername() {
        return wholesalername;
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public String getMarketname() {
        return marketname;
    }

    public Date getTime() {
        return time;
    }

    public Date getInputtime() {
        return inputtime;
    }
}
