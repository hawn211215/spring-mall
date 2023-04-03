package com.miles.springmall.dao;
import com.miles.springmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
