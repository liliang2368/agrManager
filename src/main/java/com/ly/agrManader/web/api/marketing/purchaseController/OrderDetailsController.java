package com.ly.agrManader.web.api.marketing.purchaseController;

import com.ly.agrManader.server.Interface.OrderDetailBusiv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.util.BusinessException;
import com.ly.agrManader.web.api.marketing.request.orderdetailRequest;
import com.ly.agrManader.web.api.marketing.request.updatePurchaseRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.omg.CORBA.SystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/api/purchase", tags = "采购订单")
@RestController
@RequestMapping("/api/purchase")
public class OrderDetailsController {

    @Autowired
    private OrderDetailBusiv orderDetailBusiv;

    private static final Logger logger = LoggerFactory.getLogger(OrderDetailsController.class);

    @ApiOperation(value = "新增采购商品单", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/insertpurchase")
    public BaseResponse<Integer> insertpurchaset(@RequestBody orderdetailRequest request) {
        logger.info("purchaseController#insertpurchaset request:{}", "");
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try {
            return orderDetailBusiv.insertThisCommodityToOrderDetails(request);
        } catch (BusinessException | SystemException e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("StoreSaleDevelopRptController#saveStoreSaleDevelopRptByStoresCodes 发生业务或系统错误：{}" + e.getMessage(), e);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("StoreSaleDevelopRptController#saveStoreSaleDevelopRptByStoresCodes 发生错误：{}" + e.getMessage(), e);
        }
        return response;

    }

    @ApiOperation(value = "修改采购商品单", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/updatepurchase")
    public BaseResponse<Integer> updatepurchaset(@RequestBody orderdetailRequest request) {
        logger.info("purchaseController#updatepurchaset request:{}", "");
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try {
            return orderDetailBusiv.updateThisCommodityToOrderDetails(request);
        } catch (BusinessException | SystemException e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("StoreSaleDevelopRptController#saveStoreSaleDevelopRptByStoresCodes 发生业务或系统错误：{}" + e.getMessage(), e);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("StoreSaleDevelopRptController#saveStoreSaleDevelopRptByStoresCodes 发生错误：{}" + e.getMessage(), e);
        }
        return response;

    }

    @ApiOperation(value = "删除采购商品单", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/updatepurchase")
    public BaseResponse<Integer> deletepurchaset(@RequestBody orderdetailRequest request) {
        logger.info("purchaseController#updatepurchaset request:{}", "");
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try {
            return orderDetailBusiv.deleteThisCommodityToOrderDetails(request);
        } catch (BusinessException | SystemException e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("StoreSaleDevelopRptController#saveStoreSaleDevelopRptByStoresCodes 发生业务或系统错误：{}" + e.getMessage(), e);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("StoreSaleDevelopRptController#saveStoreSaleDevelopRptByStoresCodes 发生错误：{}" + e.getMessage(), e);
        }
        return response;

    }


}
