package com.ly.agrManader.server.Interface;

import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.pageResult;
import com.ly.agrManader.web.management.request.pursuerRequest;
import com.ly.agrManader.web.management.vo.pursuerVO;

public interface IpursuerBusiv {

    public BaseResponse<pageResult<pursuerVO>> pageQueryPurchse(pursuerRequest request);
    BaseResponse<Integer> uodatePurchase(pursuerRequest request);
    BaseResponse<Integer> insertPurchase(pursuerRequest request);
}
