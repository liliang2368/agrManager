package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Readtimeinfo;
import com.ly.agrManader.dao.bo.ReadtimeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadtimeinfoMapper {
    long countByExample(ReadtimeinfoExample example);

    int deleteByExample(ReadtimeinfoExample example);

    int deleteByPrimaryKey(Integer realId
资讯
realtimeId);

    int insert(Readtimeinfo record);

    int insertSelective(Readtimeinfo record);

    List<Readtimeinfo> selectByExample(ReadtimeinfoExample example);

    Readtimeinfo selectByPrimaryKey(Integer realId
资讯
realtimeId);

    int updateByExampleSelective(@Param("record") Readtimeinfo record, @Param("example") ReadtimeinfoExample example);

    int updateByExample(@Param("record") Readtimeinfo record, @Param("example") ReadtimeinfoExample example);

    int updateByPrimaryKeySelective(Readtimeinfo record);

    int updateByPrimaryKey(Readtimeinfo record);
}