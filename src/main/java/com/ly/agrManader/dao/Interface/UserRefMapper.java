package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.UserRef;
import com.ly.agrManader.dao.bo.UserRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRefMapper {
    long countByExample(UserRefExample example);

    int deleteByExample(UserRefExample example);

    int insert(UserRef record);

    int insertSelective(UserRef record);

    List<UserRef> selectByExample(UserRefExample example);

    int updateByExampleSelective(@Param("record") UserRef record, @Param("example") UserRefExample example);

    int updateByExample(@Param("record") UserRef record, @Param("example") UserRefExample example);
}