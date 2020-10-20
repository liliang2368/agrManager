package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Workorder;
import com.ly.agrManader.dao.bo.WorkorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkorderMapper {
    long countByExample(WorkorderExample example);

    int deleteByExample(WorkorderExample example);

    int deleteByPrimaryKey(Integer workorderid);

    int insert(Workorder record);

    int insertSelective(Workorder record);

    List<Workorder> selectByExample(WorkorderExample example);

    Workorder selectByPrimaryKey(Integer workorderid);

    int updateByExampleSelective(@Param("record") Workorder record, @Param("example") WorkorderExample example);

    int updateByExample(@Param("record") Workorder record, @Param("example") WorkorderExample example);

    int updateByPrimaryKeySelective(Workorder record);

    int updateByPrimaryKey(Workorder record);
}