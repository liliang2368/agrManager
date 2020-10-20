package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Cooperate;
import com.ly.agrManader.dao.bo.CooperateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CooperateMapper {
    long countByExample(CooperateExample example);

    int deleteByExample(CooperateExample example);

    int deleteByPrimaryKey(Integer cooperativeid);

    int insert(Cooperate record);

    int insertSelective(Cooperate record);

    List<Cooperate> selectByExample(CooperateExample example);

    Cooperate selectByPrimaryKey(Integer cooperativeid);

    int updateByExampleSelective(@Param("record") Cooperate record, @Param("example") CooperateExample example);

    int updateByExample(@Param("record") Cooperate record, @Param("example") CooperateExample example);

    int updateByPrimaryKeySelective(Cooperate record);

    int updateByPrimaryKey(Cooperate record);
}