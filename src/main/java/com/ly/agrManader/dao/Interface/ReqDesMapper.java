package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.ReqDes;
import com.ly.agrManader.dao.bo.ReqDesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReqDesMapper {
    long countByExample(ReqDesExample example);

    int deleteByExample(ReqDesExample example);

    int deleteByPrimaryKey(Integer desId);

    int insert(ReqDes record);

    int insertSelective(ReqDes record);

    List<ReqDes> selectByExample(ReqDesExample example);

    ReqDes selectByPrimaryKey(Integer desId);

    int updateByExampleSelective(@Param("record") ReqDes record, @Param("example") ReqDesExample example);

    int updateByExample(@Param("record") ReqDes record, @Param("example") ReqDesExample example);

    int updateByPrimaryKeySelective(ReqDes record);

    int updateByPrimaryKey(ReqDes record);
}