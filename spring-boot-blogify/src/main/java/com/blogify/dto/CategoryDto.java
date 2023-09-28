package com.blogify.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

	private int id;

	@NotEmpty(message = "Title must not be empty")
	private String title;

	@NotEmpty(message = "Description must not be empty")
	private String description;
}
