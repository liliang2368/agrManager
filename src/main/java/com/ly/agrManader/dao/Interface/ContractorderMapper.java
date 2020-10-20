package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Contractorder;
import com.ly.agrManader.dao.bo.ContractorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractorderMapper {
    long countByExample(ContractorderExample example);

    int deleteByExample(ContractorderExample example);

    int deleteByPrimaryKey(Integer contractid);

    int insert(Contractorder record);

    int insertSelective(Contractorder record);

    List<Contractorder> selectByExample(ContractorderExample example);

    Contractorder selectByPrimaryKey(Integer contractid);

    int updateByExampleSelective(@Param("record") Contractorder record, @Param("example") ContractorderExample example);

    int updateByExample(@Param("record") Contractorder record, @Param("example") ContractorderExample example);

    int updateByPrimaryKeySelective(Contractorder record);

    int updateByPrimaryKey(Contractorder record);
}