package com.springboot.api.service.Impl;

import com.springboot.api.data.dao.ProductDAO;
import com.springboot.api.data.dto.ProductDTO;
import com.springboot.api.data.dto.ProductResponseDTO;
import com.springboot.api.data.entity.Product;
import com.springboot.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO){
        this.productDAO = productDAO;
    }

    // getProduct() 메서드 구현
    @Override
    public ProductResponseDTO getProduct(Long number){
        Product product = productDAO.selectProduct(number);

        return new ProductResponseDTO(product.getNumber(), product.getName(), product.getPrice(), product.getStock());
    }

    @Override
    public ProductResponseDTO saveProduct(ProductDTO productDTO){
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setStock(productDTO.getStock());
        product.setCreatedAt(LocalDateTime.now());
        product.setUpdatedAt(LocalDateTime.now());

        Product savedProduct = productDAO.insertProduct(product);

        return new ProductResponseDTO(savedProduct.getNumber(), savedProduct.getName(), savedProduct.getPrice(), savedProduct.getStock());
    }

    @Override
    public ProductResponseDTO changeProductName(Long number, String name) throws Exception {
        Product changedProduct = productDAO.updateProductName(number, name);

        return new ProductResponseDTO(changedProduct.getNumber(), changedProduct.getName(), changedProduct.getPrice(), changedProduct.getStock());
    }

    @Override
    public void deleteProduct(Long number) throws Exception {
        productDAO.deleteProduct(number);
    }
}