package com.ly.agrManader.web.api.marketing.purchaseController;

import com.ly.agrManader.server.Interface.ContractorderBusiv;
import com.ly.agrManader.server.Interface.OrderDetailBusiv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.util.BusinessException;
import com.ly.agrManader.web.api.marketing.request.orderdetailRequest;
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

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/22 9:47 上午
 */
@Api(value = "/api/Contract", tags = "合同管理")
@RestController
@RequestMapping("/api/Contract")
public class ContractController {
    @Autowired
    private ContractorderBusiv contractorderBusiv;

    private static final Logger logger = LoggerFactory.getLogger(ContractController.class);

    @ApiOperation(value = "新增合同", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/insertContract")
    public BaseResponse<Integer> insertContract(@RequestBody orderdetailRequest request) {
        logger.info("ContractController#insertContract request:{}", "");


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

}
