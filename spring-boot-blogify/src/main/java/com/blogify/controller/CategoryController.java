package com.blogify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogify.dto.CategoryDto;
import com.blogify.service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService service;

	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {
		return new ResponseEntity<>(service.createCategory(categoryDto), HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getAllCategories() {
		return new ResponseEntity<>(service.getAllCategories(), HttpStatus.OK);
	}

	@GetMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> getCategoryById(@PathVariable Integer categoryId) {
		return new ResponseEntity<>(service.getCategoryById(categoryId), HttpStatus.OK);
	}

	@PutMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto,
			@PathVariable Integer categoryId) {
		return new ResponseEntity<>(service.updateCategory(categoryDto, categoryId), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{categoryId}")
	public void deleteCategory(@PathVariable Integer categoryId) {
		service.deleteCategory(categoryId);
	}
}
