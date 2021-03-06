package banyuan.service;

import club.banyuan.pojo.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProductByKeyWords(String keyWords) throws Exception;

    public pojo.Product getProductById(int id) throws Exception;
}
