package com.example.services;

import com.example.model.Product;

import java.util.Map;

public interface IServices {
    Map<String, Product> getData();
    void save(Product product);
    void delete(String codeProduct);
    Product findByCode(String codeProduct);

}
