package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.*;
import com.example.demo.model.*;
import com.example.demo.repository.*;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException(String.format("Danh mục với %d không tồn tại!", id)));
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category category) {
        Category existingCategory = categoryRepository.findById(id).orElse(null);
        if(existingCategory != null) {
            existingCategory.setName(category.getName());
            return categoryRepository.save(existingCategory);
        }
        return null;
    }

    public void deleteCategory(Long id) {

    Category category = categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException(String.format("Danh mục với %d không tồn tại!", id)));

    List<Product> products = productRepository.findAllByCategory(category);

    if (products != null) {
        throw new CategoryHasProductsException("Không thể xóa danh mục vì còn sản phẩm thuộc danh mục này!");
    }

    categoryRepository.delete(category);
}
}
