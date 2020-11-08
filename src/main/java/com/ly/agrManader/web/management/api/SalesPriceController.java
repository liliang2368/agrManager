package com.ly.agrManader.web.management.api;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/26 6:18 下午
 */


import com.ly.agrManader.server.impl.SalesPriceBusivImpl;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.util.BusinessException;
import com.ly.agrManader.web.management.request.SalesPriceRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.omg.CORBA.SystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 客户需求
 * 市场调研
 * 主要给市场调研员提供最近行情信息录入界面，主要包括农产品名称、计量方式、批发市场单价、批发市场名称、农贸市场单价、农贸市场名称、调研时间、调研人员信息、信息录入时间等信息的维护;
 * 价格方案
 * 审核
 * 确定价格
 * 执行
 * 备案
 * 状态：初始化0 经理审核 1 审核不通过为2  执行 3
 */
@Api(value = "/api/CheckBillDtl", tags = "销售定价")
@RestController
public class SalesPriceController {

    @Autowired
    private SalesPriceBusivImpl salesPriceBusiv;

    private static final Logger logger = LoggerFactory.getLogger(SalesPriceController.class);

    @ApiOperation(value = "添加销售定价", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/addSalesPrice")
    public BaseResponse<Integer> addSalesPrice(@RequestBody SalesPriceRequest request) {
        logger.info("SalesPriceController#addSalesPrice request:{}", "");
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try {
//            return salesPriceBusiv.addrSalesPriceThisCommodityDetails(request);
        } catch (BusinessException | SystemException e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("SalesPriceController#addSalesPrice 发生业务或系统错误：{}" + e.getMessage(), e);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("SalesPriceController#addSalesPrice 发生错误：{}" + e.getMessage(), e);
        }
        return response;
    }

    @ApiOperation(value = "经理审核销售定价", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/examineSalesPrice")
    public BaseResponse<Integer> examineSalesPrice(@RequestBody SalesPriceRequest request) {
        logger.info("SalesPriceController#examineSalesPrice request:{}", "");
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try {


            return salesPriceBusiv.examineSalesPriceThisCommodityDetails(request);

        } catch (BusinessException | SystemException e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("SalesPriceController#examineSalesPrice 发生业务或系统错误：{}" + e.getMessage(), e);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("SalesPriceController#examineSalesPrice 发生错误：{}" + e.getMessage(), e);
        }
        return response;
    }

    @ApiOperation(value = "执行销售定价", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/executeSalesPrice")
    public BaseResponse<Integer> executeSalesPrice(@RequestBody SalesPriceRequest request) {

        logger.info("SalesPriceController#executeSalesPrice request:{}", "");
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try {

            return salesPriceBusiv.executeSalesPriceSalesPriceThisCommodityDetails(request);

        } catch (BusinessException | SystemException e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("SalesPriceController#executeSalesPrice 发生业务或系统错误：{}" + e.getMessage(), e);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("SalesPriceController#executeSalesPrice 发生错误：{}" + e.getMessage(), e);
        }
        return response;
    }

    @ApiOperation(value = "查询销售定价详情", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/selectAllSalesPrice")
    public BaseResponse<List<SalesPriceRequest>> selectAllSalesPrice(@RequestBody SalesPriceRequest request) {

        logger.info("SalesPriceController#selectAllSalesPrice request:{}", "");
        BaseResponse<List<SalesPriceRequest>> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try {
            return salesPriceBusiv.selectSalesPriceSalesPriceAllCommodityDetails(request);
        } catch (BusinessException | SystemException e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("SalesPriceController#selectAllSalesPrice 发生业务或系统错误：{}" + e.getMessage(), e);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("SalesPriceController#selectAllSalesPrice 发生错误：{}" + e.getMessage(), e);
        }
        return response;
    }


}
