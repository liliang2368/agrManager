package com.ly.agrManader.web.management.api;
import com.ly.agrManader.server.Interface.IpursuerBusiv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.util.BusinessException;
import com.ly.agrManader.web.management.request.pursuerRequest;
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
@Api(value = "", tags = "经营部采购合同拟定")
@RestController
public class PurchaseControle {
    private static final Logger logger = LoggerFactory.getLogger(PurchaseControle.class);
    @Autowired
    private IpursuerBusiv ipursuerBusiv;
    @ApiOperation(value = "农产品采购", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/addPurchase")
    public BaseResponse<Integer> addPurchase(@RequestBody pursuerRequest request) {
        logger.info("PurchaseControle#addPurchase request:{}", "");
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try {
            response=ipursuerBusiv.insertPurchase(request);
        } catch (BusinessException | SystemException e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("PurchaseControle#addPurchase 发生业务或系统错误：{}" + e.getMessage(), e);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("PurchaseControle#addPurchase 发生错误：{}" + e.getMessage(), e);
        }
        return response;
    }


    @ApiOperation(value = "销售部进行农产品进行质检", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/addPurchaseQuality")
    public BaseResponse<Integer> addPurchaseQuality(@RequestBody pursuerRequest request) {
        logger.info("PurchaseControle#addPurchase request:{}", "");
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try {
            response=ipursuerBusiv.uodatePurchase(request);
        } catch (BusinessException | SystemException e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("PurchaseControle#addPurchase 发生业务或系统错误：{}" + e.getMessage(), e);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BusinessConstants.BUSI_FAILURE_CODE);
            response.setResultMessage(BusinessConstants.BUSI_FAILURE_MESSAGE);
            logger.error("PurchaseControle#addPurchase 发生错误：{}" + e.getMessage(), e);
        }
        return response;
    }
}
