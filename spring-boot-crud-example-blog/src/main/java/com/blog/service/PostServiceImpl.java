package com.blog.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.blog.entity.Category;
import com.blog.entity.Post;
import com.blog.entity.User;
import com.blog.exception.ResourceNotFoundException;
import com.blog.repository.CategoryRepository;
import com.blog.repository.PostRepository;
import com.blog.repository.UserRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public Post createPost(Post post, int categoryId, int userId) {
		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));

		Post newPost = new Post();
		newPost.setTitle(post.getTitle());
		newPost.setContent(post.getContent());
		newPost.setImage("default.png");
		newPost.setDate(new Date());
		newPost.setCategory(category);
		newPost.setUser(user);
		return postRepository.save(newPost);
	}

	@Override
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}

	@Override
	public List<Post> getAllPosts(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		Page<Post> postPage = postRepository.findAll(pageable);
		List<Post> posts = postPage.getContent();
		for (Post postItem : posts) {
			postItem.setPagenumber(postPage.getNumber());
			postItem.setPagesize(postPage.getSize());
			postItem.setTotalElements(postPage.getTotalElements());
			postItem.setTotalPages(postPage.getTotalPages());
			postItem.setLastPage(postPage.isLast());
		}
		return posts;
	}

	@Override
	public List<Post> getAllPosts(int pageNumber, int pageSize, String sortBy) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortBy));
		Page<Post> postPage = postRepository.findAll(pageable);
		List<Post> posts = postPage.getContent();
		for (Post postItem : posts) {
			postItem.setPagenumber(postPage.getNumber());
			postItem.setPagesize(postPage.getSize());
			postItem.setTotalElements(postPage.getTotalElements());
			postItem.setTotalPages(postPage.getTotalPages());
			postItem.setLastPage(postPage.isLast());
		}
		return posts;
	}

	@Override
	public List<Post> getAllPosts(int pageNumber, int pageSize, String sortBy, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase("ascending") ? Sort.by(sortBy).ascending(): Sort.by(sortBy).descending();
		Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);	// replace 'Sort.by(sortBy)' with 'sort' to implement sortDirection
		Page<Post> postPage = postRepository.findAll(pageable);
		List<Post> posts = postPage.getContent();
		for (Post postItem : posts) {
			postItem.setPagenumber(postPage.getNumber());
			postItem.setPagesize(postPage.getSize());
			postItem.setTotalElements(postPage.getTotalElements());
			postItem.setTotalPages(postPage.getTotalPages());
			postItem.setLastPage(postPage.isLast());
		}
		return posts;
	}

	@Override
	public Post getPostById(int postId) {
		return postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", postId));
	}

	@Override
	public Post updatePost(Post post, int postId) {
		Post existingPost = postRepository.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", postId));
		existingPost.setTitle(post.getTitle());
		existingPost.setContent(post.getContent());
		existingPost.setImage(post.getImage());
		existingPost.setDate(new Date());
		return postRepository.save(existingPost);
	}

	@Override
	public void deletePost(int postId) {
		Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", postId));
		postRepository.delete(post);

	}

	@Override
	public List<Post> getPostsByCategory(int categoryId) {
		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		List<Post> posts = postRepository.findByCategory(category);
		return posts;
	}

	@Override
	public List<Post> getPostsByUser(int userId) {
		User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));
		List<Post> posts = postRepository.findByUser(user);
		return posts;
	}

	@Override
	public List<Post> searchPostsByKeyword(String keyword) {
		List<Post> posts = postRepository.findAll();
		List<Post> filteredPosts = new ArrayList<>();
		keyword = keyword.toLowerCase();
		for (Post postItem : posts) {
			if (postItem.getContent().toLowerCase().contains(keyword) || postItem.getTitle().toLowerCase().contains(keyword)) {
				filteredPosts.add(postItem);
			}
		}
		return filteredPosts;
	}

	@Override
	public List<Post> searchPostsByTitleContaining(String postTitle) {
		return postRepository.findByTitleContaining(postTitle);
	}

	@Override
	public List<Post> searchPostsByContentContaining(String postContent) {
		return postRepository.findByContentContaining(postContent);
	}

}
