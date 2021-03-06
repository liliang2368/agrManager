package com.ly.agrManader.server.impl;

import com.ly.agrManader.dao.Interface.UserRefMapper;
import com.ly.agrManader.dao.bo.UserRef;
import com.ly.agrManader.dao.bo.UserRefExample;
import com.ly.agrManader.server.Interface.userRelBusisv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.web.management.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userRelBus implements userRelBusisv {

    @Autowired
    private UserRefMapper userRefMapper;

    @Override
    public BaseResponse<UserRef> login(UserRequest userRequest) {
        BaseResponse<UserRef> response = new BaseResponse<UserRef>(true, BusinessConstants.BUSI_SUCCESS_CODE,BusinessConstants.BUSI_SUCCESS_MESSAGE);
        UserRefExample example = new UserRefExample();
        UserRefExample.Criteria criteria =example.createCriteria();
        //输入用户和密码
        criteria.andPasswordEqualTo(userRequest.getPassWord());
        criteria.andUsernameEqualTo(userRequest.getUserName());
        List<UserRef> userRef=userRefMapper.selectByExample(example);
        response.setResult(userRef.get(0));
        return response;
    }
}
