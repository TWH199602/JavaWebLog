package dao.impl;

import pojo.Order;

import java.util.List;

public interface OrderDao {
    List<Order> getOrderDetailByOrdId(int id) throws Exception;
}
