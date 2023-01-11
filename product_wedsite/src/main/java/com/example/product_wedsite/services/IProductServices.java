package com.example.product_wedsite.services;

import com.example.product_wedsite.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IProductServices {
    List<Product> getData();
    void save(Product product);
    void delete(Product product);
    Product findByCode(String codeProduct);

    Page<Product> findAllWithPage(PageRequest pageRequest);

}
