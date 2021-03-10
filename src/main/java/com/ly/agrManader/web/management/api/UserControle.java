package com.ly.agrManader.web.management.api;

import com.ly.agrManader.dao.bo.UserRef;
import com.ly.agrManader.server.Interface.userRelBusisv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.web.management.request.UserRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="用户模块",tags= {"登陆","控制层"})
public class UserControle {

    @Autowired
    private userRelBusisv userRelBusisc;

    @ApiOperation(value = "模拟用户登陆", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/login")
    public BaseResponse<UserRef> getproduct(UserRequest userRequest)
    {
        BaseResponse<UserRef> response = new BaseResponse<UserRef>(true,BusinessConstants.BUSI_SUCCESS_CODE,BusinessConstants.BUSI_SUCCESS_MESSAGE);
        try{
            response=userRelBusisc.login(userRequest);
        }catch (Exception e){

        }
        return response;
    }






}
