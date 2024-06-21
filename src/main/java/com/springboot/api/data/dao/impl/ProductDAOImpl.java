package com.springboot.api.data.dao.impl;

import com.springboot.api.data.dao.ProductDAO;
import com.springboot.api.data.entity.Product;
import com.springboot.api.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    //Product 엔티티를 데이터베이스에 저장하는 기능 수행
    @Override
    public Product insertProduct(Product product){
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    //조회
    @Override
    public Product selectProduct(Long number){
        Product selectProduct = productRepository.getById(number);
        return selectProduct;
    }

    @Override
    public Product updateProductName(Long number, String name) throws Exception {
        return null;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {

    }
}
