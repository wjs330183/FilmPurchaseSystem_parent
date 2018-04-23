package com.ioe.entity;

import java.sql.Date;

public class OrderHead extends BaseEntity{
    /**
     * 订单ID
     */
    private String orderHeadId;
    /**
     * 下单时间
     */
    private Date orderHeadBuyDate;
    /**
     * 用户ID
     */
    private String customerId;


    public String getOrderHeadId() {
        return orderHeadId;
    }

    public void setOrderHeadId(String orderHeadId) {
        this.orderHeadId = orderHeadId;
    }

    public Date getOrderHeadBuyDate() {
        return orderHeadBuyDate;
    }

    public void setOrderHeadBuyDate(Date orderHeadBuyDate) {
        this.orderHeadBuyDate = orderHeadBuyDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

}
