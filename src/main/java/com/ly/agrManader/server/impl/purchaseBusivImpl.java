package com.ly.agrManader.server.impl;

import com.ly.agrManader.dao.Interface.PurchaseMapper;
import com.ly.agrManader.dao.bo.Purchase;
import com.ly.agrManader.dao.bo.PurchaseExample;
import com.ly.agrManader.server.Interface.IpurchaseBusiv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.web.api.marketing.request.purchaseRequest;
import com.ly.agrManader.web.api.marketing.request.updatePurchaseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class purchaseBusivImpl implements IpurchaseBusiv {

    @Autowired
    private PurchaseMapper purchaseMapper;




    @Override
    public BaseResponse<Integer> insertIpurchaseBusiv(purchaseRequest request) {
//参数校验
        if(request==null)
        {
           // throw new RuntimeException("您输入的参数不正确请重新输入");
            return new BaseResponse<Integer>(false, BusinessConstants.BUSI_SUCCESS_CODE,BusinessConstants.BUSI_FAILURE_MESSAGE);

        }
        Purchase record=new Purchase();
        record.setPurchaseId(request.getPurchaseId());
        record.setPurchaseProduce(request.getPurchaseProduce());
        //此处标记 request对象不完整
        record.setPurchaseProduceCode(request.getPurchaseProduceCode());
        record.setPurchaseProducePrice(request.getPurchaseProducePrice());
        record.setPurchaseState(request.getPurchaseState());
        record.setQuaityState(request.getQuaityState());
        record.setSupplierId(request.getSupplierId());
        record.setTypeId(request.getTypeId());
        int insert = purchaseMapper.insert(record);

        return new BaseResponse<Integer>(true,BusinessConstants.BUSI_SUCCESS_CODE,BusinessConstants.BUSI_SUCCESS_MESSAGE,insert);






    }

    @Override
    public BaseResponse<Integer> updateIpurchaseBusiv(updatePurchaseRequest updatePurchaseRequest) {
        if(updatePurchaseRequest==null) {
            return new BaseResponse<Integer>(false, BusinessConstants.BUSI_SUCCESS_CODE,BusinessConstants.BUSI_FAILURE_MESSAGE);
        }
      else  if(updatePurchaseRequest.getQuaityState()!=null)
        {
            PurchaseExample examples = new PurchaseExample();
            PurchaseExample.Criteria criteria1 = examples.createCriteria();
            criteria1.andPurchaseIdEqualTo(updatePurchaseRequest.getPurchaseId());
            Purchase record = new Purchase();
            record.setQuaityState(updatePurchaseRequest.getQuaityState());
            //只需要更新数量即可 注意数量是那个数据库的数量加上新增的数量

            int i = purchaseMapper.updateByExample(record, examples);
            return  new BaseResponse<Integer>(true,BusinessConstants.BUSI_SUCCESS_CODE,BusinessConstants.BUSI_SUCCESS_MESSAGE,i);
        }
       else if(updatePurchaseRequest.getPurchaseState()!=null)
        {

            PurchaseExample examples = new PurchaseExample();
            PurchaseExample.Criteria criteria1 = examples.createCriteria();
            criteria1.andPurchaseIdEqualTo(updatePurchaseRequest.getPurchaseId());
            Purchase record = new Purchase();
            record.setPurchaseState(updatePurchaseRequest.getPurchaseState());
            //只需要更新数量即可 注意数量是那个数据库的数量加上新增的数量

            int i = purchaseMapper.updateByExample(record, examples);
            return  new BaseResponse<Integer>(true,BusinessConstants.BUSI_SUCCESS_CODE,BusinessConstants.BUSI_SUCCESS_MESSAGE,i);
        }


        return  new BaseResponse<Integer>(false,BusinessConstants.BUSI_SUCCESS_CODE,BusinessConstants.BUSI_FAILURE_MESSAGE);

    }
}
