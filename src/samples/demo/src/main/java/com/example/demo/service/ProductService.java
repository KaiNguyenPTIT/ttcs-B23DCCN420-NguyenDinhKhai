package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if(existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setBrand(product.getBrand());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setVolume(product.getVolume());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setCategory(product.getCategory());
            return productRepository.save(existingProduct);
        }
        return null;
    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
