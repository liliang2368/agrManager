package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Contractnegotiation;
import com.ly.agrManader.dao.bo.ContractnegotiationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractnegotiationMapper {
    long countByExample(ContractnegotiationExample example);

    int deleteByExample(ContractnegotiationExample example);

    int deleteByPrimaryKey(Integer contractid);

    int insert(Contractnegotiation record);

    int insertSelective(Contractnegotiation record);

    List<Contractnegotiation> selectByExample(ContractnegotiationExample example);

    Contractnegotiation selectByPrimaryKey(Integer contractid);

    int updateByExampleSelective(@Param("record") Contractnegotiation record, @Param("example") ContractnegotiationExample example);

    int updateByExample(@Param("record") Contractnegotiation record, @Param("example") ContractnegotiationExample example);

    int updateByPrimaryKeySelective(Contractnegotiation record);

    int updateByPrimaryKey(Contractnegotiation record);
}