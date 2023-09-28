package com.blogify.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogify.dto.CategoryDto;
import com.blogify.entity.Category;
import com.blogify.exception.ResourceNotFoundException;
import com.blogify.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository repository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category category = dtoToCategory(categoryDto);
		Category savedCategory = repository.save(category);
		return categoryToDto(savedCategory);
	}

	@Override
	public List<CategoryDto> getAllCategories() {
		List<Category> categories = repository.findAll();
		List<CategoryDto> categoryDtos = new ArrayList<>();

		for (Category categoryItem : categories) {
			CategoryDto categoryDtoItem = categoryToDto(categoryItem);
			categoryDtos.add(categoryDtoItem);
		}
		return categoryDtos;
	}

	@Override
	public CategoryDto getCategoryById(Integer categoryId) {
		Category category = repository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		return categoryToDto(category);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category category = repository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		category.setTitle(categoryDto.getTitle());
		category.setDescription(categoryDto.getDescription());
		Category updateCategory = repository.save(category);
		return categoryToDto(updateCategory);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category category = repository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		repository.delete(category);

	}

	private Category dtoToCategory(CategoryDto categoryDto) {
		Category category = modelMapper.map(categoryDto, Category.class);
		return category;
	}

	private CategoryDto categoryToDto(Category category) {
		CategoryDto categoryDto = modelMapper.map(category, CategoryDto.class);
		return categoryDto;
	}

}
