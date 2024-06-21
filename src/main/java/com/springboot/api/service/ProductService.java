package com.springboot.api.service;

import com.springboot.api.data.dto.ProductDTO;
import com.springboot.api.data.dto.ProductResponseDTO;
import com.springboot.api.data.entity.Product;

public interface ProductService {
    ProductResponseDTO getProduct(Long number);
    ProductResponseDTO saveProduct(ProductDTO productDTO);

    ProductResponseDTO changeProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;

}
