package com.example.product_wedsite.repo;

import com.example.product_wedsite.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface IProductRepository extends JpaRepository<Product,String> {
    Product findBycodeProduct(String codeProduct);

    @Query(value = "select * from product",nativeQuery = true)
    Page<Product> findAllWithPage(PageRequest pageRequest);
}
