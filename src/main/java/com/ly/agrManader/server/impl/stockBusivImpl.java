package com.ly.agrManader.server.impl;

import com.ly.agrManader.dao.Interface.PurchaseMapper;
import com.ly.agrManader.dao.Interface.StockMapper;
import com.ly.agrManader.dao.bo.Purchase;
import com.ly.agrManader.dao.bo.PurchaseExample;
import com.ly.agrManader.dao.bo.Stock;
import com.ly.agrManader.server.Interface.IstockBusiv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.web.exception.ServiceException;
import com.ly.agrManader.web.management.request.StockRequest;
import com.ly.agrManader.web.management.request.pursuerRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class stockBusivImpl implements IstockBusiv {

    @Autowired
    private StockMapper stockMapper;

    @Autowired
    private PurchaseMapper purchaseMapper;


    @Override
    public BaseResponse<Integer> updatePurchase(StockRequest request) {
        return null;
    }

    @Override
    public BaseResponse<Integer> insertPurchase(StockRequest request) {
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        //销售部将库存添加到库存
        // 先要查看商品的质检状态 是否进行了质检
        PurchaseExample example=new PurchaseExample();
        PurchaseExample.Criteria criteria=example.createCriteria();
        if(request.getStockProductCode() == null ){
            throw new ServiceException("商品编码不能为空");
        }
        criteria.andPurchasecodeEqualTo(request.getStockProductCode());

        List<Purchase> list=purchaseMapper.selectByExample(example);
        if(list.get(0).getQuaitystate() != "2"){
            throw new ServiceException("请先对产品进行质量检测");
        }
        Stock stock=new Stock();
        BeanUtils.copyProperties(stock,request);//复制属性
        Integer result=stockMapper.insert(stock);
        response.setResult(result);
        return response;
    }
}
