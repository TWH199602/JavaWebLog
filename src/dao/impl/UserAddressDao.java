package dao.impl;

import dao.IBaseDao;
import pojo.UserAddress;

import java.util.List;

public interface UserAddressDao extends IBaseDao {
    public List<UserAddress> getUserAddressByUserId(int userId) throws Exception;
}
