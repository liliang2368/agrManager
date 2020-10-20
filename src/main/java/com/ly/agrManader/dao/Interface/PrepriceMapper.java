package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Preprice;
import com.ly.agrManader.dao.bo.PrepriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrepriceMapper {
    long countByExample(PrepriceExample example);

    int deleteByExample(PrepriceExample example);

    int deleteByPrimaryKey(Integer preproductid);

    int insert(Preprice record);

    int insertSelective(Preprice record);

    List<Preprice> selectByExample(PrepriceExample example);

    Preprice selectByPrimaryKey(Integer preproductid);

    int updateByExampleSelective(@Param("record") Preprice record, @Param("example") PrepriceExample example);

    int updateByExample(@Param("record") Preprice record, @Param("example") PrepriceExample example);

    int updateByPrimaryKeySelective(Preprice record);

    int updateByPrimaryKey(Preprice record);
}