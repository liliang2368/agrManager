package com.ly.agrManader.server.impl;

import com.ly.agrManader.dao.bo.*;
import com.ly.agrManader.server.Interface.SalesPriceBusiv;
import com.ly.agrManader.util.BaseResponse;
import com.ly.agrManader.util.BusinessConstants;
import com.ly.agrManader.web.management.request.SalesPriceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author jiangzhiwen
 * @version 1.0
 * @date 2020/10/27 12:24 上午
 */
@Service
public class SalesPriceBusivImpl implements SalesPriceBusiv {

    /**
     * @param request 包含了销售定价的需要录入的所有信息，其中包含了
     * @return
     */

    @Autowired
    private ContractquotationMapper contractquotationMapper;

    @Autowired
    private CommodityMapper commodityMapper;

    @Autowired
    private PrepriceMapper prepriceMapper;

    /**
     * 提交销售定价合同 等待审核
     *
     * @param request
     * @return 1录入成功，0失败
     */
    @Override
    public BaseResponse<Integer> addrSalesPriceThisCommodityDetails(SalesPriceRequest request) {

        Contractquotation getMaxcontractQuotation = contractquotationMapper.selectMaxContractid();
        int maxId;
        if (getMaxcontractQuotation != null) {
            maxId = getMaxcontractQuotation.getContractid() + 1;
        } else {
            maxId = 1;
        }

        //销售定价所有的信息
        Date date=new Date();
        Preprice preprice = new Preprice();
        preprice.setPreproductid(maxId);
        preprice.setInputtime(request.getInputtime());
        preprice.setMarketname(request.getMarketname());
        preprice.setMarketprice(request.getMarketprice());
        preprice.setMeasurementmethod(request.getMeasurementmethod());
        preprice.setTime(date);
        preprice.setWholesalername(request.getWholesalername());
        preprice.setTradeprice(request.getTradeprice());
        //-------缺少商品设置

        int insertprepriceResult = prepriceMapper.insert(preprice);

        //定义销售定价的 所有的流程控制
        Contractquotation contractquotation = new Contractquotation();
        contractquotation.setContractid(maxId);
        contractquotation.setCustomerdemand(request.getCustomerdemand());
        contractquotation.setSolution(request.getSolution());
        contractquotation.setFinprice(request.getFinprice());
        contractquotation.setStats(0);
        int insertcontractquotationResult = contractquotationMapper.insert(contractquotation);
        if (preprice.getPreproductid().equals(contractquotation.getContractid())) {
            return new BaseResponse<Integer>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE, 1);
        }


        return new BaseResponse<Integer>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE, 0,1);

    }


    /**
     * @param request
     * @return
     */
    @Override
    public BaseResponse<Integer> examineSalesPriceThisCommodityDetails(SalesPriceRequest request) {
        Contractquotation contractquotation = new Contractquotation();
        contractquotation.setStats(request.getStats());
        //修改业务
        ContractquotationExample contractquotationExample = new ContractquotationExample();
        ContractquotationExample.Criteria criteria = contractquotationExample.createCriteria();
        criteria.andContractidEqualTo(request.getContractid());

        int reslut = contractquotationMapper.updateByExampleSelective(contractquotation, contractquotationExample);
        return new BaseResponse<Integer>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE, reslut);
    }

    /**
     * 修改执行 修改销售定价
     *
     * @param request
     * @return
     */
    @Override
    public BaseResponse<Integer> executeSalesPriceSalesPriceThisCommodityDetails(SalesPriceRequest request) {
        //修改订单为已经执行
        Contractquotation contractquotation = new Contractquotation();
        contractquotation.setStats(request.getStats());
        ContractquotationExample contractquotationExample = new ContractquotationExample();
        ContractquotationExample.Criteria criteria = contractquotationExample.createCriteria();
        criteria.andContractidEqualTo(request.getContractid());
        int contractQuotationReslut = contractquotationMapper.updateByExampleSelective(contractquotation, contractquotationExample);
        contractquotation = contractquotationMapper.selectByPrimaryKey(request.getContractid());
        //执行定价
        Commodity commodity = new Commodity();
        //-----待确定的商品ID
        commodity.setCommodityid(12);
        commodity.setPrice(contractquotation.getFinprice());
        int resultFinprice = commodityMapper.updateByPrimaryKey(commodity);

        return new BaseResponse<Integer>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE, resultFinprice);
    }

    /**
     * 根据用户登录的状态，可以显示出查询的信息
     *
     * @param request
     * @return
     */
    @Override
    public BaseResponse<List<SalesPriceRequest>> selectSalesPriceSalesPriceAllCommodityDetails(SalesPriceRequest request) {
        List<SalesPriceRequest> result = contractquotationMapper.selectSalesPriceSalesPriceAllCommodityDetails(request);
        System.err.println(result);
        return new BaseResponse<List<SalesPriceRequest>>(true, BusinessConstants.BUSI_SUCCESS_CODE, BusinessConstants.BUSI_SUCCESS_MESSAGE, 1,result);
    }
}
