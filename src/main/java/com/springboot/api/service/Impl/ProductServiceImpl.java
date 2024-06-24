package com.springboot.api.service.Impl;

import com.springboot.api.data.dao.ProductDAO;
import com.springboot.api.data.dto.ProductDTO;
import com.springboot.api.data.dto.ProductResponseDTO;
import com.springboot.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO){
        this.productDAO = productDAO;
    }

    @Override
    public ProductResponseDTO getProduct(Long number){
        return null;
    }

    @Override
    public ProductResponseDTO saveProduct(ProductDTO productDTO){
        return null;
    }

    @Override
    public ProductResponseDTO changeProductName(Long number, String name) throws Exception {
        return null;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {

    }
}
