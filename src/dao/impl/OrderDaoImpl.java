package dao.impl;

import pojo.Order;

import javax.persistence.Id;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class OrderDaoImpl extends BaseDaoImpl implements OrderDao {
    public OrderDaoImpl(Connection conn){
        super(conn);
    }
    @Override
    public List<Order> getOrderById(String Id) throws Exception {
        Order order = null;
        String sql = "select * from order where id = ?";
        Object[] param = new Object[]{Id};
        ResultSet rs = this.executeQuery(sql,param);
        while (rs.next()){
            order = (Order) tableToClass(rs);
        }
        closeResource(rs);
        return (List<Order>) order;
    }

    @Override
    public Object tableToClass(ResultSet rs) throws Exception {
//        private Integer id;
//        private Integer userId;
//        private String loginName;
//        private String userAddress;
//        private Date createTime;
//        private double cost;
//        private String serialNumber;
//        return product;
        Order order = new Order();
        order.setId(rs.getInt(1));
        order.setUserId(rs.getInt(2));
        order.setLoginName(rs.getString(3));
        order.setUserAddress(rs.getString(4));
        order.setCreateTime(rs.getTime(5));
        order.setCost(rs.getDouble(6));
        order.setSerialNumber(rs.getString(7));
        return order;
    }

    @Override
    public List<Order> getOrderDetailByOrdId(int id) throws Exception {
        public List<Order> getOrderDetailByOrdId(){
            Order order = null;
            String sql = "select * from order where id = ?";
            Object[] param = new Object[]{id};
            ResultSet rs = this.executeQuery(sql,param);
            while (rs.next()){
                order = (Order) tableToClass(rs);
            }
            closeResource(rs);
            return (List<Order>) order;
        }
    }
}
