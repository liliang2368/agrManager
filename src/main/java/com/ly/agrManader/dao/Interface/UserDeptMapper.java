package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.UserDept;
import com.ly.agrManader.dao.bo.UserDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDeptMapper {
    long countByExample(UserDeptExample example);

    int deleteByExample(UserDeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDept record);

    int insertSelective(UserDept record);

    List<UserDept> selectByExample(UserDeptExample example);

    UserDept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDept record, @Param("example") UserDeptExample example);

    int updateByExample(@Param("record") UserDept record, @Param("example") UserDeptExample example);

    int updateByPrimaryKeySelective(UserDept record);

    int updateByPrimaryKey(UserDept record);
}