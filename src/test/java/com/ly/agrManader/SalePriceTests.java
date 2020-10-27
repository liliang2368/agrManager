package com.ly.agrManader;

import com.ly.agrManader.dao.Interface.ContractorderMapper;
import com.ly.agrManader.server.Interface.SalesPriceBusiv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.web.api.marketing.request.SalesPriceRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/27 11:04 下午
 */

public class SalePriceTests {
    /**
     * 测试销售定价插入
     */


    @Autowired
    SalesPriceBusiv salesPriceBusiv;

    @Test
    void testAddcontractQuotation() {
        SalesPriceRequest request = new SalesPriceRequest();
        request.setCustomerdemand("需求5无");
        request.setSolution("解决不了");
        request.setFinprice(35.0);
        request.setStats(0);
        request.setMarketname("老李超市");
        request.setMeasurementmethod("称重");
        request.setMarketprice(56.0);
        request.setInputtime(new Date());

        request.setTradeprice(57.0);
        request.setWholesalername("中华大超市");

        salesPriceBusiv.addrSalesPriceThisCommodityDetails(request);
    }

    /**
     * 测试销售审核
     */
    @Test
    void testexamineSalesPriceThisCommodityDetails() {
        SalesPriceRequest request = new SalesPriceRequest();
        request.setContractid(1);
        request.setStats(1);
        salesPriceBusiv.examineSalesPriceThisCommodityDetails(request);
    }

    /**
     * 测试执行
     */
    @Test
    void testExecuteSalesPriceSalesPriceThisCommodityDetails() {
        SalesPriceRequest request = new SalesPriceRequest();
        request.setContractid(1);
        request.setStats(3);
        salesPriceBusiv.examineSalesPriceThisCommodityDetails(request);
    }

    /**
     * 测试查询所有
     */
    @Test
    void testselectSalesPriceSalesPriceAllCommodityDetails() {
        SalesPriceRequest request = new SalesPriceRequest();
        request.setStats(0);
        BaseResponse<List<SalesPriceRequest>> baseResponse = salesPriceBusiv.selectSalesPriceSalesPriceAllCommodityDetails(request);
        List<SalesPriceRequest> result = (List<SalesPriceRequest>) baseResponse.getInfo();
        System.out.println(result);
    }

    /**
     * 测试查询单批
     */
    @Test
    void testselectSalesPriceSalesPriceAllCommodityDetailsType() {
        SalesPriceRequest request = new SalesPriceRequest();
        salesPriceBusiv.examineSalesPriceThisCommodityDetails(request);
    }
}
