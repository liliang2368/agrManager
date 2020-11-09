package com.ly.agrManader.server.Interface;

import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.web.management.request.StockRequest;
import com.ly.agrManader.web.management.request.pursuerRequest;

public interface IstockBusiv {

    /**
     * 更新库存状态
     * @param request
     * @return
     */
    public BaseResponse<Integer> updatePurchase(StockRequest request);


    /**
     * 插入库存状态
     * @param request
     * @return
     */
    BaseResponse<Integer> insertPurchase(StockRequest request);
}
