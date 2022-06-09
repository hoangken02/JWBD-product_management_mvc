package com.kenit.productmvc.service;

import com.kenit.productmvc.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product customer);

    void remove(int id);
}
