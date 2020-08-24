package service.impl;

import banyuan.dao.util.DataSourceUtil;
import dao.impl.UserAddressDao;
import dao.impl.UserAddressDaoImpl;
import pojo.UserAddress;

import java.sql.Connection;
import java.util.List;

public class UserAddressServiceImpl implements UserAddressService.UserAddressService {
    @Override
    public List<UserAddress> getUserAddressByUserId(int userId) throws Exception {
        Connection conn = DataSourceUtil.openConnection();
        UserAddressDao userAddressDao = new UserAddressDaoImpl(conn);
        List<UserAddress> userAddressList = userAddressDao.getUserAddressByUserId(userId);

        DataSourceUtil.closeConnection(conn);

        return userAddressList;
    }
}
