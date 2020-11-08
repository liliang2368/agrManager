package com.ly.agrManader.server.Interface;

import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.web.management.request.SalesPriceRequest;

import java.util.List;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/27 12:15 上午
 */

public interface SalesPriceBusiv {

    void addrSalesPriceThisCommodityDetails(SalesPriceRequest request);

    BaseResponse<Integer> examineSalesPriceThisCommodityDetails(SalesPriceRequest request);

    BaseResponse<Integer> executeSalesPriceSalesPriceThisCommodityDetails(SalesPriceRequest request);

    BaseResponse<List<SalesPriceRequest>> selectSalesPriceSalesPriceAllCommodityDetails(SalesPriceRequest request);

}
