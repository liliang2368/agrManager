package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Agrtype;
import com.ly.agrManader.dao.bo.AgrtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgrtypeMapper {
    long countByExample(AgrtypeExample example);

    int deleteByExample(AgrtypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Agrtype record);

    int insertSelective(Agrtype record);

    List<Agrtype> selectByExample(AgrtypeExample example);

    Agrtype selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Agrtype record, @Param("example") AgrtypeExample example);

    int updateByExample(@Param("record") Agrtype record, @Param("example") AgrtypeExample example);

    int updateByPrimaryKeySelective(Agrtype record);

    int updateByPrimaryKey(Agrtype record);
}