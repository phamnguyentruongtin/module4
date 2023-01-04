package com.example.services;

import com.example.model.Product;
import com.example.repo.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class ProductServices implements IProductServices {

    @Autowired
    IProductRepository dao;
    @Override
    public List<Product> getData() {
        List<Product> list;
        return list = dao.getData();
    }

    @Override
    public void save(Product product,boolean isEdit) {
        dao.save(product, isEdit);
    }

    @Override
    public void delete(Product product) {
        dao.delete(product);
    }

    @Override
    public Product findByCode(String codeProduct) {
        return dao.findByCode(codeProduct);
    }
}
