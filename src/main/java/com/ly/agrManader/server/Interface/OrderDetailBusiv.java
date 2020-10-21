package com.ly.agrManader.server.Interface;

import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.web.api.marketing.request.orderdetailRequest;
import com.ly.agrManader.web.api.marketing.request.purchaseRequest;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/22 12:39 上午
 */

public interface OrderDetailBusiv {

    BaseResponse<Integer> insertThisCommodityToOrderDetails(orderdetailRequest request);

    BaseResponse<Integer> deleteThisCommodityToOrderDetails(orderdetailRequest request);

    BaseResponse<Integer> deleteContractToOrderDetails(orderdetailRequest request);

    BaseResponse<Integer> updateThisCommodityToOrderDetails(orderdetailRequest request);


}

