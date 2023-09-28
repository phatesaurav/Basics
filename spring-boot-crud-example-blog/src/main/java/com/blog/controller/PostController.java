package com.blog.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
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

import com.blog.entity.Post;
import com.blog.service.FileService;
import com.blog.service.PostService;

import jakarta.servlet.http.HttpServletResponse;

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
	public Post createPost(@RequestBody Post post, @PathVariable int categoryId, @PathVariable int userId) {
		return service.createPost(post, categoryId, userId);
	}
	
	@GetMapping
	public List<Post> getAllPosts(){
		return service.getAllPosts();
	}
	
	@GetMapping("pageNumber-pageSize")
	public List<Post> getAllPosts(@RequestParam int pageNumber, @RequestParam int pageSize){
		return service.getAllPosts(pageNumber, pageSize);
	}
	
	@GetMapping("pageNumber-pageSize-sortBy")
	public List<Post> getAllPosts(@RequestParam int pageNumber, @RequestParam int pageSize, @RequestParam String sortBy){
		return service.getAllPosts(pageNumber, pageSize, sortBy);
	}
	
	@GetMapping("pageNumber-pageSize-sortBy-sortDirection")
	public List<Post> getAllPosts(@RequestParam int pageNumber, @RequestParam int pageSize, @RequestParam String sortBy, @RequestParam String sortDirection){
		return service.getAllPosts(pageNumber, pageSize, sortBy, sortDirection);
	}
	
	@GetMapping("/{postId}")
	public Post getPostById(@PathVariable int postId) {
		return service.getPostById(postId);
	}
	
	@PutMapping("/{postId}")
	public Post updatePost(@RequestBody Post post, @PathVariable int postId) {
		return service.updatePost(post, postId);
	}
	
	@DeleteMapping("/{postId}")
	public void deletePost(@PathVariable int postId) {
		service.deletePost(postId);
	}
	
	@GetMapping("/category/{categoryId}")
	public List<Post> getPostsByCategory(@PathVariable int categoryId){
		return service.getPostsByCategory(categoryId);
	}
	
	@GetMapping("/user/{userId}")
	public List<Post> getPostsByUser(@PathVariable int userId){
		return service.getPostsByUser(userId);
	}
	
	@GetMapping("/keyword/{keyword}")
	public List<Post> searchPostsByKeyword(@PathVariable String keyword){
		return service.searchPostsByKeyword(keyword);
	}
	
	@GetMapping("/postTitle/{postTitle}")
	public List<Post> searchPostsByTitleContaining(@PathVariable String postTitle){
		return service.searchPostsByTitleContaining(postTitle); 
	}
	
	@GetMapping("/postContent/{postContent}")
	public List<Post> searchPostsByContentContaining(@PathVariable String postContent){
		return service.searchPostsByContentContaining(postContent);
	}
	
	@PostMapping("/image/{postId}")
	public Post uploadImage(@RequestParam MultipartFile image, @PathVariable Integer postId) throws IOException {
		Post post = service.getPostById(postId);
		String fileName = fileService.uploadImage(path, image);
		post.setImage(fileName);
		return service.updatePost(post, postId);
	}
	
	@GetMapping(value = "/image/{image}", produces = MediaType.IMAGE_JPEG_VALUE)
	public void downloadImage(@PathVariable String image, HttpServletResponse response) throws IOException {
		InputStream resource = fileService.getResource(path, image);
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		StreamUtils.copy(resource, response.getOutputStream());
	}
}
