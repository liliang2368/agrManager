package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Produce;
import com.ly.agrManader.dao.bo.ProduceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceMapper {
    long countByExample(ProduceExample example);

    int deleteByExample(ProduceExample example);

    int deleteByPrimaryKey(Integer produceId);

    int insert(Produce record);

    int insertSelective(Produce record);

    List<Produce> selectByExample(ProduceExample example);

    Produce selectByPrimaryKey(Integer produceId);

    int updateByExampleSelective(@Param("record") Produce record, @Param("example") ProduceExample example);

    int updateByExample(@Param("record") Produce record, @Param("example") ProduceExample example);

    int updateByPrimaryKeySelective(Produce record);

    int updateByPrimaryKey(Produce record);
}