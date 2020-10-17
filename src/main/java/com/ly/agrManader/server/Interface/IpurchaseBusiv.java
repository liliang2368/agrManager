package com.ly.agrManader.server.Interface;

import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.web.api.marketing.request.purchaseRequest;
import com.ly.agrManader.web.api.marketing.request.pursuerRequest;
import com.ly.agrManader.web.api.marketing.request.updatePurchaseRequest;

public interface IpurchaseBusiv {
    BaseResponse<Integer> insertIpurchaseBusiv(purchaseRequest request);


    BaseResponse<Integer> updateIpurchaseBusiv(updatePurchaseRequest updatePurchaseRequest);
}
