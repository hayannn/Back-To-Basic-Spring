package com.springboot.api.service.Impl;

import com.springboot.api.data.dao.ProductDAO;
import com.springboot.api.data.dto.ProductDTO;
import com.springboot.api.data.dto.ProductResponseDTO;
import com.springboot.api.data.entity.Product;
import com.springboot.api.service.ProductService;
import org.apache.catalina.authenticator.SavedRequest;
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

        ProductResponseDTO productResponseDto = new ProductResponseDTO();
        productResponseDto.setNumber(product.getNumber());
        productResponseDto.setName(product.getName());
        productResponseDto.setPrice(product.getPrice());
        productResponseDto.setStock(product.getStock());

        return productResponseDto;
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

        productResponseDTO.setNumber(SavedRequest.getNumber());
        productResponseDTO.setName(SavedRequest.getName());
        productResponseDTO.setPrice(SavedRequest.getPrice());
        productResponseDTO.setStock(SavedRequest.getStock());

        return productResponseDTO;
    }

    @Override
    public ProductResponseDTO changeProductName(Long number, String name) throws Exception {
        Product changedProduct = productDAO.updateProductName(number, name);

        ProductResponseDTO productResponseDTO = new ProductResponseDTO();

        productResponseDTO.setNumber(SavedRequest.getNumber());
        productResponseDTO.setName(SavedRequest.getName());
        productResponseDTO.setPrice(SavedRequest.getPrice());
        productResponseDTO.setStock(SavedRequest.getStock());


    }

    @Override
    public void deleteProduct(Long number) throws Exception {
        productDAO.deleteProduct(number);
    }
}
