package dao;

import club.banyuan.dao.IBaseDao;
import club.banyuan.pojo.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao extends IBaseDao {
    public List<Product> getProductByKeyWords(String keyWords) throws Exception;
}
