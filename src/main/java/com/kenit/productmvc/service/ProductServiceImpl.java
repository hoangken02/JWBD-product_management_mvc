package com.kenit.productmvc.service;

import com.kenit.productmvc.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"ball02",1200));
        products.put(2,new Product(2,"ball1",1200));
        products.put(3,new Product(3,"ball2",1200));
        products.put(4,new Product(4,"ball3",1200));
        products.put(5,new Product(5,"ball4",1200));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        products.put(id,customer);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
