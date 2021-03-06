package dao;

import club.banyuan.dao.IBaseDao;
import club.banyuan.pojo.User;

public interface UserDao extends IBaseDao {
    public User getUserByUserNameAndPwd(String username,String password) throws Exception;
    public User addUser(User user);
}
