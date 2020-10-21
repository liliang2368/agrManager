package com.ly.agrManader.dao.Interface;

import com.ly.agrManader.dao.bo.Orderdetails;
import com.ly.agrManader.dao.bo.OrderdetailsExample;
import com.ly.agrManader.dao.bo.OrderdetailsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailsMapper {
    long countByExample(OrderdetailsExample example);

    int deleteByExample(OrderdetailsExample example);

    int deleteByPrimaryKey(OrderdetailsKey key);

    int insert(Orderdetails record);

    int insertSelective(Orderdetails record);

    List<Orderdetails> selectByExample(OrderdetailsExample example);

    Orderdetails selectByPrimaryKey(OrderdetailsKey key);

    int updateByExampleSelective(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    int updateByExample(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    int updateByPrimaryKeySelective(Orderdetails record);

    int updateByPrimaryKey(Orderdetails record);
}