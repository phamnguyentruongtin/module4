package com.example.services;

import com.example.model.Product;
import com.example.repo.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@org.springframework.stereotype.Service
public class ProductServices implements IProductServices {

    @Autowired
    IProductRepository dao;
    @Override
    public Map<String, Product> getData() {
        return dao.getData();
    }

    @Override
    public void save(Product product) {
        dao.save(product);
    }

    @Override
    public void delete(String codeProduct) {
        dao.delete(codeProduct);
    }

    @Override
    public Product findByCode(String codeProduct) {
        return dao.findByCode(codeProduct);
    }
}
