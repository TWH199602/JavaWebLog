package service.impl;

import club.banyuan.dao.util.DataSourceUtil;
import dao.impl.OrderDao;
import dao.impl.OrderDaoImpl;
import pojo.Order;
import pojo.OrderDetail;

import java.sql.Connection;
import java.util.List;

public class OrderServiceImpl implements OrderService {
//    @Override
//    public List<Product> getProductByKeyWords(String keyWords) throws Exception {
//        Connection conn = DataSourceUtil.openConnection();
//        ProductDao productDao = new club.banyuan.dao.impl.ProductDaoImpl(conn);
//        List<Product> productList = productDao.getProductByKeyWords(keyWords);
//        DataSourceUtil.closeConnection(conn);
//        return productList;
//    }
//
//    @Override
//    public Product getProductById(int id) throws Exception {
//        Connection conn = DataSourceUtil.openConnection();
//        ProductDao productDao = new club.banyuan.dao.impl.ProductDaoImpl(conn);
//        Product product = productDao.getProductById(id);
//        DataSourceUtil.closeConnection(conn);
//        return product;
//    }
    @Override
    public Order createOrder(Order order, List<OrderDetail> orderDetailList) throws Exception {
//                先调用OrderDao,生成订单，获取订单id
//                赋值给订单详情OrderDetail
//                调用OrderDetailDao，向订单详情表中，插入订单详情
        Connection conn = DataSourceUtil.openConnection();
        OrderDao orderDao = new OrderDaoImpl(conn);
        OrderDetail
//        executeInsert


        DataSourceUtil.closeConnection(conn);
        return order;
    }
}
