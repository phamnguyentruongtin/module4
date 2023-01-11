package com.example.product_wedsite.services;

import com.example.product_wedsite.model.Product;
import com.example.product_wedsite.repo.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices implements IProductServices {

    @Autowired
    IProductRepository dao;
    @Override
    public List<Product> getData() {
        List<Product> list;
        return list = dao.findAll();
    }

    @Override
    public void save(Product product) {
        dao.save(product);
    }

    @Override
    public void delete(Product product) {
        dao.delete(product);
    }

    @Override
    public Product findByCode(String codeProduct) {
        return dao.findBycodeProduct(codeProduct);
    }

    @Override
    public Page<Product> findAllWithPage(PageRequest pageRequest) {
        return dao.findAllWithPage(pageRequest);
    }
}
