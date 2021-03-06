package com.ly.agrManader.server.Interface;

import com.ly.agrManader.dao.bo.UserRef;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.web.management.request.UserRequest;

public interface userRelBusisv {


    BaseResponse<UserRef> login(UserRequest userRequest);
}
