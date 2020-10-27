package com.ly.agrManader.server.impl;

import com.ly.agrManader.server.Interface.OrderDetailBusiv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.web.api.marketing.request.orderdetailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/22 12:41 上午
 */
@Service
public class OrderDetailBusivImpl implements OrderDetailBusiv {

    @Autowired
    OrderdetailsMapper orderdetailsMapper;

    @Override
    public BaseResponse<Integer> insertThisCommodityToOrderDetails(orderdetailRequest request) {
        Orderdetails orderdetails = new Orderdetails();
        orderdetails.setContractid(request.getContractid());
        orderdetails.setProduct(request.getProduct());
        orderdetails.setNumber(request.getNumber());
        int insert = orderdetailsMapper.insert(orderdetails);
        return new BaseResponse<Integer>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE, insert);
    }

    @Override
    public BaseResponse<Integer> deleteThisCommodityToOrderDetails(orderdetailRequest request) {

        OrderdetailsExample example = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = example.createCriteria();
        criteria.andContractidEqualTo(request.getContractid());
        criteria.andProductEqualTo(request.getProduct());
        int deleteThisCommodity = orderdetailsMapper.deleteByExample(example);
        return new BaseResponse<Integer>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE, deleteThisCommodity);

    }

    @Override
    public BaseResponse<Integer> deleteContractToOrderDetails(orderdetailRequest request) {
        OrderdetailsExample example = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = example.createCriteria();
        criteria.andContractidEqualTo(request.getContractid());
        int deleteContractT = orderdetailsMapper.deleteByExample(example);
        return new BaseResponse<Integer>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE, deleteContractT);
    }

    @Override
    public BaseResponse<Integer> updateThisCommodityToOrderDetails(orderdetailRequest request) {
        Orderdetails orderdetails = new Orderdetails();
        orderdetails.setContractid(request.getContractid());
        orderdetails.setProduct(request.getProduct());
        orderdetails.setNumber(request.getNumber());
        OrderdetailsExample example = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = example.createCriteria();
        criteria.andContractidEqualTo(request.getContractid());
        criteria.andProductEqualTo(request.getProduct());
        int updateThisCommodity = orderdetailsMapper.updateByExampleSelective(orderdetails, example);
        return new BaseResponse<Integer>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE, updateThisCommodity);
    }
}
