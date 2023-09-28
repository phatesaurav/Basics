package com.blogify.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

	private int id;
	@NotEmpty
	private String title;

	@NotEmpty
	private String content;

	private String image;
	private Date date;
	private CategoryDto category;
	private UserDto user;

	private List<CommentDto> comments = new ArrayList<>();
}
