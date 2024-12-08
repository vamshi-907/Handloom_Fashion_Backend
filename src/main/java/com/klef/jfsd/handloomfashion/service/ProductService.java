package com.klef.jfsd.handloomfashion.service;

import com.klef.jfsd.handloomfashion.model.Product;

public interface ProductService {
    public String addProduct(Product product);
    public Iterable<Product> viewAllProducts();
    public String updateProduct(Integer id, Product product); // Add update method
    public String deleteProduct(Integer id);// Add delete method
}
