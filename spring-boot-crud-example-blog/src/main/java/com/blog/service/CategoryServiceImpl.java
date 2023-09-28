package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.Category;
import com.blog.exception.ResourceNotFoundException;
import com.blog.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository repository;

	@Override
	public Category createCategory(Category category) {
		return repository.save(category);
	}

	@Override
	public List<Category> getAllCategories() {
		return repository.findAll();
	}

	@Override
	public Category getCategoryById(int categoryId) {
		return repository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
	}

	@Override
	public Category updateCategory(Category category, int categoryId) {
		Category existingCategory = repository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		existingCategory.setTitle(category.getTitle());
		existingCategory.setDescription(category.getDescription());
		return repository.save(existingCategory);
	}

	@Override
	public void deleteCategory(int categoryId) {
		Category existingCategory = repository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		repository.delete(existingCategory);
	}

}
