package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Inwarehouse;
import com.ly.agrManader.dao.bo.InwarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InwarehouseMapper {
    long countByExample(InwarehouseExample example);

    int deleteByExample(InwarehouseExample example);

    int deleteByPrimaryKey(Integer warehouseid);

    int insert(Inwarehouse record);

    int insertSelective(Inwarehouse record);

    List<Inwarehouse> selectByExample(InwarehouseExample example);

    Inwarehouse selectByPrimaryKey(Integer warehouseid);

    int updateByExampleSelective(@Param("record") Inwarehouse record, @Param("example") InwarehouseExample example);

    int updateByExample(@Param("record") Inwarehouse record, @Param("example") InwarehouseExample example);

    int updateByPrimaryKeySelective(Inwarehouse record);

    int updateByPrimaryKey(Inwarehouse record);
}