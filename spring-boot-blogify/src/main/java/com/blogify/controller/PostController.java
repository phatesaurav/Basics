package com.blogify.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.blogify.dto.PostDto;
import com.blogify.dto.PostResponse;
import com.blogify.service.FileService;
import com.blogify.service.PostService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService service;

	@Autowired
	private FileService fileService;

	@Value("${project.image}")
	private String path;

	@PostMapping("/user/{userId}/category/{categoryId}")
	public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto, @PathVariable Integer categoryId,
			@PathVariable Integer userId) {
		return new ResponseEntity<>(service.createPost(postDto, categoryId, userId), HttpStatus.CREATED);
	}

	@GetMapping("/getAllPosts")
	public ResponseEntity<List<PostDto>> getAllPosts(
			@RequestParam(value = "pageSize", defaultValue = "3", required = false) Integer pageSize,
			@RequestParam(value = "pageNumber", defaultValue = "1", required = false) Integer pageNumber) {
		return new ResponseEntity<>(service.getAllPosts(pageSize, pageNumber), HttpStatus.OK);
	}

	@GetMapping("/getAllPostResponses")
	public ResponseEntity<PostResponse> getAllPostResponses(
			@RequestParam(value = "pageSize", defaultValue = "3", required = false) Integer pageSize,
			@RequestParam(value = "pageNumber", defaultValue = "0", required = false) Integer pageNumber,
			@RequestParam(value = "sortBy", defaultValue = "id", required = false) String sortBy,
			@RequestParam(value = "sortDirection", defaultValue = "ascending", required = false) String sortDirection) {
		return new ResponseEntity<>(service.getAllPostResponses(pageSize, pageNumber, sortBy, sortDirection),
				HttpStatus.OK);
	}

	@GetMapping("/{postId}")
	public ResponseEntity<PostDto> getPostById(@PathVariable Integer postId) {
		return new ResponseEntity<>(service.getPostById(postId), HttpStatus.OK);
	}

	@PutMapping("/{postId}")
	public ResponseEntity<PostDto> updatePost(@Valid @RequestBody PostDto postDto, @PathVariable Integer postId) {
		return new ResponseEntity<>(service.updatePost(postDto, postId), HttpStatus.OK);
	}

	@DeleteMapping("/{postId}")
	public void deletePost(@PathVariable Integer postId) {
		service.deletePost(postId);
	}

	@GetMapping("/category/{categoryId}")
	public ResponseEntity<List<PostDto>> getPostsByCategory(@PathVariable Integer categoryId) {
		return new ResponseEntity<>(service.getPostsByCategory(categoryId), HttpStatus.OK);
	}

	@GetMapping("/getPostResponsesByCategory/category/{categoryId}")
	public ResponseEntity<PostResponse> getPostResponsesByCategory(@PathVariable Integer categoryId,
			@RequestParam(value = "pageSize", defaultValue = "3", required = false) Integer pageSize,
			@RequestParam(value = "pageNumber", defaultValue = "1", required = false) Integer pageNumber) {
		return new ResponseEntity<>(service.getPostResponsesByCategory(categoryId, pageSize, pageNumber),
				HttpStatus.OK);
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<List<PostDto>> getPostsByUser(@PathVariable Integer userId) {
		return new ResponseEntity<>(service.getPostsByUser(userId), HttpStatus.OK);
	}

	@GetMapping("/getPostResponseByUser/user/{userId}")
	public ResponseEntity<PostResponse> getPostResponseByUser(@PathVariable Integer userId,
			@RequestParam(value = "pageSize", defaultValue = "3", required = false) Integer pageSize,
			@RequestParam(value = "pageNumber", defaultValue = "1", required = false) Integer pageNumber) {
		return new ResponseEntity<>(service.getPostResponsesByUser(userId, pageSize, pageNumber), HttpStatus.OK);
	}

	@GetMapping("/title/{title}")
	public ResponseEntity<List<PostDto>> searchPostsByTitle(@PathVariable String title) {
		return new ResponseEntity<>(service.searchPostsByTitle(title), HttpStatus.OK);
	}

	@GetMapping("/content/{content}")
	public ResponseEntity<List<PostDto>> searchPostsByContent(@PathVariable String content) {
		return new ResponseEntity<>(service.searchPostsByContent(content), HttpStatus.OK);
	}

	@GetMapping("/keyword/{keyword}")
	public ResponseEntity<List<PostDto>> searchPostsByKeyword(@PathVariable String keyword) {
		return new ResponseEntity<>(service.searchPostsByKeyword(keyword), HttpStatus.OK);
	}

	@PostMapping("/image/upload/{postId}")
	public ResponseEntity<PostDto> uploadImage(@RequestParam MultipartFile image, @PathVariable Integer postId)
			throws IOException {
		PostDto postDto = service.getPostById(postId);
		String fileName = fileService.uploadImage(path, image);
		System.out.println("fileName: " + fileName);
		postDto.setImage(fileName);
		return new ResponseEntity<>(service.updatePost(postDto, postId), HttpStatus.OK);
	}

	@GetMapping(value = "/image/{image}", produces = MediaType.IMAGE_JPEG_VALUE)
	public void downloadImage(@PathVariable String image, HttpServletResponse response) throws IOException {
		InputStream resource = fileService.getResource(path, image);
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		StreamUtils.copy(resource, response.getOutputStream());
	}
}
