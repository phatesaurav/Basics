package com.blog.service;

import java.util.List;

import com.blog.entity.Category;

public interface CategoryService {

	Category createCategory(Category category);

	List<Category> getAllCategories();

	Category getCategoryById(int categoryId);

	Category updateCategory(Category category, int categoryId);

	void deleteCategory(int categoryId);
}
