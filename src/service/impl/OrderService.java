package service.impl;

import pojo.Order;
import pojo.OrderDetail;

import java.sql.SQLException;
import java.util.List;

public interface OrderService {
    public Order createOrder(Order order, List<OrderDetail> orderDetailList) throws Exception;
}
