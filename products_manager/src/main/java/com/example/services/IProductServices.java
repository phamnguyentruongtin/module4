package com.example.services;

import com.example.model.Product;

import java.util.List;
import java.util.Map;

public interface IProductServices {
    List<Product> getData();
    void save(Product product,boolean isEdit);
    void delete(Product product);
    Product findByCode(String codeProduct);

}
