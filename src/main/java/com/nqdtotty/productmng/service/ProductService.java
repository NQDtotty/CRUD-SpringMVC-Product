package com.nqdtotty.productmng.service;

import com.nqdtotty.productmng.entity.Product;
import com.nqdtotty.productmng.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductByCategoryID(String categoryID) {
        return productRepository.findByCategoryID(categoryID);
    }
}
