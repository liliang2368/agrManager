package com.ly.agrManader.server.impl;

import com.ly.agrManader.dao.Interface.PurchaseMapper;
import com.ly.agrManader.dao.bo.Purchase;
import com.ly.agrManader.server.Interface.IpursuerBusiv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.util.pageResult;
import com.ly.agrManader.web.management.request.pursuerRequest;
import com.ly.agrManader.web.management.vo.pursuerVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class pursuerBusivImpl implements IpursuerBusiv {
    private static final Logger logger = LoggerFactory.getLogger(pursuerBusivImpl.class);


    @Autowired
    private PurchaseMapper purchaseMapper;



    @Override
    public BaseResponse<pageResult<pursuerVO>> pageQueryPurchse(pursuerRequest request) {


        return null;
    }

    @Override
    public BaseResponse<Integer> insertPurchase(pursuerRequest request) {
        //默认响应成功
        BaseResponse<Integer> response = new BaseResponse<>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE);
        Date date=new Date();
        Purchase purchase=new Purchase();
        purchase.setSupplierId(request.getSupplierId());//供货商ID
        purchase.setContractPicture(request.getContractPicture());//采购合同图片
        purchase.setPurchaseCode(request.getPurchaseCode());//采购商品编码
        purchase.setPurchaseName(request.getPurchaseProduce());//采购产品名称
        purchase.setPurchaseNum(request.getPurchaseNum());//采购产品数量
        purchase.setPurchaseTime(date);//采购时间
        purchase.setSpecification(request.getSpecification());//采购商品规格
        //TODO:加入是否进行了质检
        try {
            Integer i = purchaseMapper.insert(purchase);
            response.setResult(i);
            response.setInfo("插入数据成功");
        }catch (Exception e){
            logger.info(e.getMessage());
        }
        //
        return response;
    }
}
