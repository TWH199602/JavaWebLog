package dao.util;

import dao.IBaseDao;
import pojo.OrderDetail;

public interface OrderDetailDao extends IBaseDao {
    OrderDetail getOrderDetailByOrdId(int id) throws Exception;
    OrderDetail addOrderDetail(OrderDetail orderDetail);
}
