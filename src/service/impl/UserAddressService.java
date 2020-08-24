package service.impl;

import pojo.UserAddress;

import java.util.List;

public interface UserAddressService {
        public List<UserAddress> getUserAddressByUserId(int userId) throws Exception;
    }

