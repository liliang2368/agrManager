package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.BugDts;
import com.ly.agrManader.dao.bo.BugDtsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BugDtsMapper {
    long countByExample(BugDtsExample example);

    int deleteByExample(BugDtsExample example);

    int deleteByPrimaryKey(String bugId);

    int insert(BugDts record);

    int insertSelective(BugDts record);

    List<BugDts> selectByExample(BugDtsExample example);

    BugDts selectByPrimaryKey(String bugId);

    int updateByExampleSelective(@Param("record") BugDts record, @Param("example") BugDtsExample example);

    int updateByExample(@Param("record") BugDts record, @Param("example") BugDtsExample example);

    int updateByPrimaryKeySelective(BugDts record);

    int updateByPrimaryKey(BugDts record);
}