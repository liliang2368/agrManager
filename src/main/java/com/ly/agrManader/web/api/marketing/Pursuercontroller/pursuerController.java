package com.ly.agrManader.web.api.marketing.Pursuercontroller;

import com.ly.agrManader.server.Interface.IpursuerBusiv;
import com.ly.agrManader.util.*;
import com.ly.agrManader.web.api.marketing.request.pursuerRequest;
import com.ly.agrManader.web.api.marketing.vo.pursuerVO;
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

import java.security.Principal;

@Api(value = "/api/pursuer", tags = "营销部门采购订单")
@RestController
@RequestMapping("/api/pursuer")
public class pursuerController {
    private static final Logger logger = LoggerFactory.getLogger(pursuerController.class);

    @Autowired
    private IpursuerBusiv ipursuerBusiv;


    @ApiOperation(value = "营销部门采购订单查询接口", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/pageQueryCheckDtlRpt")
    public BaseResponse<pageResult<pursuerVO>> pageQueryCheckBillDetailRpt(@RequestBody pursuerRequest request) {

        logger.info("pursuerController#pageQueryCheckBillDetailRpt request:{}", "");
        BaseResponse<pageResult<pursuerVO>> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try{
            //验证一下查询时间是否为空 CheckBillDetailDevelopRptRequest
     //       CommValidate.validate();
            return ipursuerBusiv.pageQueryPurchse(request);
        }catch (BusinessException | SystemException e) {
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
