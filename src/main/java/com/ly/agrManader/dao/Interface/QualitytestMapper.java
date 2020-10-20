package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Qualitytest;
import com.ly.agrManader.dao.bo.QualitytestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QualitytestMapper {
    long countByExample(QualitytestExample example);

    int deleteByExample(QualitytestExample example);

    int deleteByPrimaryKey(Integer contractid);

    int insert(Qualitytest record);

    int insertSelective(Qualitytest record);

    List<Qualitytest> selectByExample(QualitytestExample example);

    Qualitytest selectByPrimaryKey(Integer contractid);

    int updateByExampleSelective(@Param("record") Qualitytest record, @Param("example") QualitytestExample example);

    int updateByExample(@Param("record") Qualitytest record, @Param("example") QualitytestExample example);

    int updateByPrimaryKeySelective(Qualitytest record);

    int updateByPrimaryKey(Qualitytest record);
}