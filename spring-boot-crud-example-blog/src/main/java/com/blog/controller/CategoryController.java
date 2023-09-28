package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Category;
import com.blog.service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@PostMapping("/")
	public Category createCategory(@Valid @RequestBody Category category) {
		return service.createCategory(category);
	}
	
	@GetMapping("/")
	public List<Category> getAllCategories(){
		return service.getAllCategories();
	}
	
	@GetMapping("/{categoryId}")
	public Category getCategoryById(@PathVariable int categoryId) {
		return service.getCategoryById(categoryId);
	}
	
	@PutMapping("/{categoryId}")
	public Category updateCategory(@Valid @RequestBody Category category, @PathVariable int categoryId) {
		return service.updateCategory(category, categoryId);
	}
	
	@DeleteMapping("/{categoryId}")
	public void deleteCategory(@PathVariable int categoryId) {
		service.deleteCategory(categoryId);
	}
	
}
