package com.example.repo;

import com.example.model.Product;

import java.util.List;
import java.util.Map;

public interface IProductRepository {
    List<Product> getData();
    void save(Product product,boolean isEdit);
    void delete(Product product);
    Product findByCode(String codeProduct);

}
