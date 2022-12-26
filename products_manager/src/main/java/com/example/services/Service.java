package com.example.services;

import com.example.model.Product;
import com.example.repo.IDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@org.springframework.stereotype.Service
public class Service implements IServices{

    @Autowired
    IDao dao;
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
