package com.example.repo;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class Dao implements  IDao{
    static Map<String, Product> mapProducts = new HashMap<>();
    static {
        Product product1 = new Product("PD-001","Noodle","acecook","2 year");
        Product product2 = new Product("PD-002","Chocolate","snickers","1 year");
        Product product3 = new Product("PD-003","Pho","vifon","1 year");
        Product product4 = new Product("PD-004","Sandwich","codegym","6 month");
        Product product5 = new Product("PD-005","Redbull","Redbull","1 year");
        mapProducts.put(product1.getCodeProduct(),product1);
        mapProducts.put(product2.getCodeProduct(),product2);
        mapProducts.put(product3.getCodeProduct(),product3);
        mapProducts.put(product4.getCodeProduct(),product4);
        mapProducts.put(product5.getCodeProduct(),product5);
    }

    @Override
    public Map<String, Product> getData() {
        return mapProducts;
    }

    @Override
    public void save(Product product) {
      mapProducts.put(product.getCodeProduct(), product);
    }

    @Override
    public void delete(String codeProduct) {
        mapProducts.remove(codeProduct);
    }


    @Override
    public Product findByCode(String codeProduct) {
       return mapProducts.get(codeProduct);
    }
}
