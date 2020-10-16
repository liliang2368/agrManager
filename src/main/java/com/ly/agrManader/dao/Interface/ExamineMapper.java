package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Examine;
import com.ly.agrManader.dao.bo.ExamineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamineMapper {
    long countByExample(ExamineExample example);

    int deleteByExample(ExamineExample example);

    int deleteByPrimaryKey(Integer examineId);

    int insert(Examine record);

    int insertSelective(Examine record);

    List<Examine> selectByExample(ExamineExample example);

    Examine selectByPrimaryKey(Integer examineId);

    int updateByExampleSelective(@Param("record") Examine record, @Param("example") ExamineExample example);

    int updateByExample(@Param("record") Examine record, @Param("example") ExamineExample example);

    int updateByPrimaryKeySelective(Examine record);

    int updateByPrimaryKey(Examine record);
}