package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Contractquotation;
import com.ly.agrManader.dao.bo.ContractquotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractquotationMapper {
    long countByExample(ContractquotationExample example);

    int deleteByExample(ContractquotationExample example);

    int deleteByPrimaryKey(Integer contractid);

    int insert(Contractquotation record);

    int insertSelective(Contractquotation record);

    List<Contractquotation> selectByExample(ContractquotationExample example);

    Contractquotation selectByPrimaryKey(Integer contractid);

    int updateByExampleSelective(@Param("record") Contractquotation record, @Param("example") ContractquotationExample example);

    int updateByExample(@Param("record") Contractquotation record, @Param("example") ContractquotationExample example);

    int updateByPrimaryKeySelective(Contractquotation record);

    int updateByPrimaryKey(Contractquotation record);
}