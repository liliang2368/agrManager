package com.ly.agrManader.server.Interface;

import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.pageResult;
import com.ly.agrManader.web.api.marketing.request.pursuerRequest;
import com.ly.agrManader.web.api.marketing.vo.pursuerVO;

public interface IpursuerBusiv {
    BaseResponse<pageResult<pursuerVO>> pageQueryPurchse(pursuerRequest request);


}
