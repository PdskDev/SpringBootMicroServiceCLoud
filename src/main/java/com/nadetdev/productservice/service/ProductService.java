package com.nadetdev.productservice.service;

import com.nadetdev.productservice.model.ProductRequest;
import com.nadetdev.productservice.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
    ProductResponse getProductById(long productId);
}
