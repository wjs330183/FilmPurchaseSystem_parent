package com.ioe.dao;

import com.ioe.entity.OrderHead;

import org.apache.ibatis.annotations.Param;
import java.util.*;

/**
* 描述：
* @author wangjs
* @date 2018-04-19
*/
public interface OrderHeadDao {

    int save(@Param("entity")OrderHead entity);

    int saveBatch(@Param("entities")List<OrderHead> entities);

    int update(@Param("entity")OrderHead entity);

    List<OrderHead> getById (@Param("id")String id);

    int deleteById (String id, @Param("operator")String operator);



    /**
    * index:t_cjlu_orderhead ==> OrderHead_ID_UNIQUE
    */
    List<OrderHead> getByOrderheadId (String orderheadId);

}
