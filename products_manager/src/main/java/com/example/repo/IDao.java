package com.example.repo;

import com.example.model.Product;

import java.util.HashMap;
import java.util.Map;

public interface IDao {
    Map<String, Product> getData();
    void save(Product product);
    void delete(String codeProduct);
    Product findByCode(String codeProduct);

}
