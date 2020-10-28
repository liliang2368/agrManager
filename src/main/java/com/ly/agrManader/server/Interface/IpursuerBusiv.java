package com.ly.agrManader.server.Interface;


import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.pageResult;
import com.ly.agrManader.web.management.request.pursuerRequest;
import com.ly.agrManader.web.management.vo.pursuerVO;

public interface IpursuerBusiv {

    /**
     * 分页查询采购合同
     * @param request
     * @return
     */
    BaseResponse<pageResult<pursuerVO>> pageQueryPurchse(pursuerRequest request);


    /**
     * 新增采购合同
     * @param request
     * @return
     */
    BaseResponse<Integer> insertPurchase(pursuerRequest request);


}
