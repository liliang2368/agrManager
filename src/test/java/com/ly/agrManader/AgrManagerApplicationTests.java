package com.ly.agrManader;

import com.ly.agrManader.dao.Interface.ContractorderMapper;
import com.ly.agrManader.dao.Interface.ContractquotationMapper;
import com.ly.agrManader.dao.bo.Contractorder;
import com.ly.agrManader.server.Interface.SalesPriceBusiv;
import com.ly.agrManader.web.management.request.SalesPriceRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
class AgrManagerApplicationTests {


    @Autowired
    ContractorderMapper contractorderMapper;

    @Autowired
    SalesPriceBusiv salesPriceBusiv;


    @Test
    void contextLoads() {
    }

    /**
     * 测试销售定价插入
     */
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
        request.setStats(1);
        List<SalesPriceRequest> Result = (List<SalesPriceRequest>) salesPriceBusiv.selectSalesPriceSalesPriceAllCommodityDetails(request).getResult();
        if (Result != null) {
            System.out.println(Result.toString());
        }
    }

    /**
     * 测试查询单批
     */
    @Test
    void testselectSalesPriceSalesPriceAllCommodityDetailsType() {
        SalesPriceRequest request = new SalesPriceRequest();
        request.setContractid(1);

        salesPriceBusiv.examineSalesPriceThisCommodityDetails(request);
    }
}
