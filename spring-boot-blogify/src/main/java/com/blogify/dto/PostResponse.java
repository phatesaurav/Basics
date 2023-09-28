package com.blogify.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
	
	private List<PostDto> postDtos;
	private int pageSize;
	private int pageNumber;
	private long totalElements;
	private int totalPages;
	private boolean isLastPage;
}
