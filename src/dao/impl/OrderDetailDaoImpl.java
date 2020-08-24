package dao.impl;

import dao.util.OrderDetailDao;
import pojo.OrderDetail;

import java.sql.Connection;
import java.sql.ResultSet;

public class OrderDetailDaoImpl extends BaseDaoImpl implements OrderDetailDao {
    public OrderDetailDaoImpl(Connection connection) {
        super(connection);
    }

    @Override
    public Object tableToClass(ResultSet rs) throws Exception {
        return null;
    }

    @Override
    public OrderDetail getOrderDetailByOrdId(int id) throws Exception {
        return null;
    }

    @Override
    public OrderDetail addOrderDetail(OrderDetail orderDetail) {
        return null;
    }
}
