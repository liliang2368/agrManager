package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Agrproduce;
import com.ly.agrManader.dao.bo.AgrproduceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgrproduceMapper {
    long countByExample(AgrproduceExample example);

    int deleteByExample(AgrproduceExample example);

    int deleteByPrimaryKey(Integer produceId);

    int insert(Agrproduce record);

    int insertSelective(Agrproduce record);

    List<Agrproduce> selectByExample(AgrproduceExample example);

    Agrproduce selectByPrimaryKey(Integer produceId);

    int updateByExampleSelective(@Param("record") Agrproduce record, @Param("example") AgrproduceExample example);

    int updateByExample(@Param("record") Agrproduce record, @Param("example") AgrproduceExample example);

    int updateByPrimaryKeySelective(Agrproduce record);

    int updateByPrimaryKey(Agrproduce record);
}