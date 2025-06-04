package com.ecommerce.project.service;

import com.ecommerce.project.payload.CategoryDto;
import com.ecommerce.project.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories();

    CategoryDto createCategory(CategoryDto categoryDto);

    String deleteCategory(Long categoryId);

    CategoryDto updateCategory(CategoryDto categoryDto, Long categoryId);
}
