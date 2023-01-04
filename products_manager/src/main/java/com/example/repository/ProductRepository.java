package com.example.repo;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> getData() {
        List<Product> productList = BaseRepositoryProduct.entityManager.createQuery("select p from Product p", Product.class).getResultList();
        return productList;
    }

    @Override
    public void save(Product product, boolean isEdit) {
        if (isEdit) {
            BaseRepositoryProduct.entityManager.getTransaction().begin();
            BaseRepositoryProduct.entityManager.merge(product);
            BaseRepositoryProduct.entityManager.getTransaction().commit();
        } else {
            BaseRepositoryProduct.entityManager.getTransaction().begin();
            BaseRepositoryProduct.entityManager.persist(product);
            BaseRepositoryProduct.entityManager.getTransaction().commit();
        }

    }


    @Override
    public void delete(Product product) {
        BaseRepositoryProduct.entityManager.getTransaction().begin();
        BaseRepositoryProduct.entityManager.remove(product);
        BaseRepositoryProduct.entityManager.getTransaction().commit();
    }


    @Override
    public Product findByCode(String codeProduct) {
        Product p = BaseRepositoryProduct.entityManager.createQuery("select c from Product c where c.codeProduct = ?1", Product.class).setParameter(1, codeProduct).getSingleResult();
        return p;
    }
}
