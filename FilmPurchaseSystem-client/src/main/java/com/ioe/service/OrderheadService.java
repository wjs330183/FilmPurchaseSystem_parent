package com.ioe.service;

import com.ioe.common.domain.DataResult;
import com.ioe.common.domain.ListResult;
import com.ioe.common.domain.PageResult;
import com.ioe.entity.Orderhead;
import java.util.*;
import java.math.BigDecimal;

/**
* 描述： 服务实现层接口
* @author wangjs
* @date 2018-04-19
*/
public interface OrderheadService {


    /**
    * 单个保存
    * @param orderheadId 订单ID
	* @param orderheadBuydate 下单时间
	* @param customerId 用户ID
	
    * @param operator 操作者编号
    */
     DataResult<String>saveOrderhead(String orderheadId, Date orderheadBuydate, String customerId,  String operator);

    /**
    * 批量保存
    * @param orderheadJson 对象集合 Json 字符串
    * @param operator 操作者编号
    */
    DataResult<Boolean> saveOrderheadBatch(String orderheadJson, String operator);

    /**
    * 根据id获取对象
    * @param id 
    */
    ListResult<Orderhead> getOrderheadById (String id, int availData);

    /**
    * 根据id删除对象
    * @param id 
    */
    DataResult<Integer> deleteOrderheadById(String id, String operator);



    /**
    * 更新对象
    * @param id 
	* @param orderheadId 订单ID
	* @param orderheadBuydate 下单时间
	* @param customerId 用户ID
	
    * @param operator 操作者编号
    */
    DataResult<Boolean> updateOrderhead(String id, String orderheadId, Date orderheadBuydate, String customerId, String operator);

    /**
    * 根据orderheadId查询记录
    *
        * @param orderheadId 订单ID
	
    */
    ListResult<Orderhead> getOrderheadByOrderheadId (String orderheadId, int availData);

}