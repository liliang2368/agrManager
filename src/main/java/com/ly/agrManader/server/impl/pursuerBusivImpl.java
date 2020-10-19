package com.ly.agrManader.server.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ly.agrManader.dao.bo.Purchase;
import com.ly.agrManader.dao.bo.PurchaseExample;
import com.ly.agrManader.server.Interface.IpursuerBusiv;
import com.ly.agrManader.util.*;
import com.ly.agrManader.web.api.marketing.request.pursuerRequest;
import com.ly.agrManader.web.api.marketing.vo.pursuerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class pursuerBusivImpl implements IpursuerBusiv {
    @Autowired
    private PurchaseMapper purchaseMapper;

    /**
     * 分页查询采购订单表
     * @param request
     * @return
     */
    @Override
    public BaseResponse<pageResult<pursuerVO>> pageQueryPurchse(pursuerRequest request) {
        BaseResponse<pageResult<pursuerVO>> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE,BusinessConstants.BUSI_SUCCESS_MESSAGE);
        pageResult<Purchase> pageResult = new pageResult<>();
        PageArg pageArg = request.getPage();
        PurchaseExample example =new PurchaseExample();
        PurchaseExample.Criteria criteria=example.createCriteria();
        //采购商品
        if(StringUtil.isNotBlank(request.getPurchaseProduce())){
            criteria.andPurchaseProduceLike("%"+request.getPurchaseProduce()+"%");
        }
        if(StringUtil.isNotBlank(request.getPurchaseState())){
            criteria.andPurchaseStateEqualTo(request.getPurchaseProduce());
        }
        //是否质检
        if(request.getQuaityState() != 0){
            criteria.andPurchaseStateEqualTo(request.getPurchaseProduce());
        }
        //商品主键
        if(request.getPurchaseId() != 0){
            criteria.andPurchaseIdEqualTo(request.getPurchaseId());
        }
        //供货商
        if(request.getSupplierId() != 0){
            criteria.andSupplierIdEqualTo(request.getSupplierId());
        }
        List<Purchase> list=null;
        try {
            PageHelper.startPage(request.getPage().getPageNum(), request.getPage().getPageSize());
            list=purchaseMapper.selectByExample(example);
        }finally{
            PageHelper.clearPage();
        }
        pageResult.setResult(list);
        pageResult.setPageNum(request.getPage().getPageNum());
        pageResult.setPageSize(request.getPage().getPageSize());
        pageResult.setCount(((Page<Purchase>) list).getTotal());//获取总数
        pageResult.setSuccess(true);
        response.setResult(pageResult);
        return response;
    }
}
