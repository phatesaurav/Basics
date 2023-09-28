package com.blogify.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.blogify.dto.PostDto;
import com.blogify.dto.PostResponse;
import com.blogify.entity.Category;
import com.blogify.entity.Post;
import com.blogify.entity.User;
import com.blogify.exception.ResourceNotFoundException;
import com.blogify.repository.CategoryRepository;
import com.blogify.repository.PostRepository;
import com.blogify.repository.UserRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public PostDto createPost(PostDto postDto, Integer categoryId, Integer userId) {

		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));

		Post post = dtoToPost(postDto);
		post.setImage("default.png");
		post.setDate(new Date());
		post.setCategory(category);
		post.setUser(user);
		Post savedPost = postRepository.save(post);
		return postToDto(savedPost);
	}

	@Override
	public List<PostDto> getAllPosts(Integer pageSize, Integer pageNumber) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		Page<Post> postPage = postRepository.findAll(pageable);
		List<Post> posts = postPage.getContent();
		List<PostDto> postDtos = new ArrayList<>();

		for (Post postItem : posts) {
			PostDto postDtoItem = postToDto(postItem);
			postDtos.add(postDtoItem);
		}
		return postDtos;

//		List<Post> posts = postRepository.findAll();
//		List<PostDto> postDtos = new ArrayList<>();
//
//		for (Post postItem : posts) {
//			PostDto postDtoItem = postToDto(postItem);
//			postDtos.add(postDtoItem);
//		}
//		return postDtos;
	}

	@Override
	public PostResponse getAllPostResponses(Integer pageSize, Integer pageNumber, String sortBy, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase("ascending") ? Sort.by(sortBy).ascending(): Sort.by(sortBy).descending();
		Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
		Page<Post> postPage = postRepository.findAll(pageable);
		List<Post> posts = postPage.getContent();
		List<PostDto> postDtos = new ArrayList<>();

		for (Post postItem : posts) {
			PostDto postDtoItem = postToDto(postItem);
			postDtos.add(postDtoItem);
		}

		PostResponse postResponse = new PostResponse();
		postResponse.setPostDtos(postDtos);
		postResponse.setPageSize(postPage.getSize());
		postResponse.setPageNumber(postPage.getNumber());
		postResponse.setTotalElements(postPage.getTotalElements());
		postResponse.setTotalPages(postPage.getTotalPages());
		postResponse.setLastPage(postPage.isLast());

		return postResponse;
	}

	@Override
	public PostDto getPostById(Integer postId) {
		Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", postId));
		return postToDto(post);
	}

	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {
		Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", postId));
		post.setTitle(postDto.getTitle());
		post.setContent(postDto.getContent());
		post.setImage(postDto.getImage());
		post.setDate(new Date());
		Post updatePost = postRepository.save(post);
		return postToDto(updatePost);
	}

	@Override
	public void deletePost(Integer postId) {
		Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", postId));
		postRepository.delete(post);
	}

	@Override
	public List<PostDto> getPostsByCategory(Integer categoryId) {

		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		List<Post> posts = postRepository.findByCategory(category);

		List<PostDto> postDtos = new ArrayList<>();

		for (Post postItem : posts) {
			PostDto postDtoItem = postToDto(postItem);
			postDtos.add(postDtoItem);
		}
		return postDtos;

	}

	@Override
	public PostResponse getPostResponsesByCategory(Integer categoryId, Integer pageSize, Integer pageNumber) {
		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", categoryId));
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		Page<Post> postPage = postRepository.findByCategory(category, pageable);
		List<Post> posts = postPage.getContent();
		List<PostDto> postDtos = new ArrayList<>();

		for (Post postItem : posts) {
			PostDto postDtoItem = postToDto(postItem);
			postDtos.add(postDtoItem);
		}

		PostResponse postResponse = new PostResponse();
		postResponse.setPostDtos(postDtos);
		postResponse.setPageSize(postPage.getSize());
		postResponse.setPageNumber(postPage.getNumber());
		postResponse.setTotalElements(postPage.getTotalElements());
		postResponse.setTotalPages(postPage.getTotalPages());
		postResponse.setLastPage(postPage.isLast());

		return postResponse;
	}

	@Override
	public List<PostDto> getPostsByUser(Integer userId) {

		User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));
		List<Post> posts = postRepository.findByUser(user);

		List<PostDto> postDtos = new ArrayList<>();

		for (Post postItem : posts) {
			PostDto postDtoItem = postToDto(postItem);
			postDtos.add(postDtoItem);
		}
		return postDtos;
	}

	@Override
	public PostResponse getPostResponsesByUser(Integer userId, Integer pageSize, Integer pageNumber) {
		User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));
		Pageable pageable = PageRequest.of(pageNumber, pageSize);

		Page<Post> postPage = postRepository.findByUser(user, pageable);
		List<Post> posts = postPage.getContent();
		List<PostDto> postDtos = new ArrayList<>();

		for (Post postItem : posts) {
			PostDto postDtoItem = postToDto(postItem);
			postDtos.add(postDtoItem);
		}

		PostResponse postResponse = new PostResponse();
		postResponse.setPostDtos(postDtos);
		postResponse.setPageSize(postPage.getSize());
		postResponse.setPageNumber(postPage.getNumber());
		postResponse.setTotalElements(postPage.getTotalElements());
		postResponse.setTotalPages(postPage.getTotalPages());
		postResponse.setLastPage(postPage.isLast());

		return postResponse;
	}

	@Override
	public List<PostDto> searchPostsByTitle(String title) {
		List<Post> posts = postRepository.findByTitleContaining(title);
		List<PostDto> postDtos = new ArrayList<>();

		for (Post postItem : posts) {
			PostDto postDtoItem = postToDto(postItem);
			postDtos.add(postDtoItem);
		}
		return postDtos;
	}

	@Override
	public List<PostDto> searchPostsByContent(String content) {
		List<Post> posts = postRepository.findByContentContaining(content);
		List<PostDto> postDtos = new ArrayList<>();

		for (Post postItem : posts) {
			PostDto postDtoItem = postToDto(postItem);
			postDtos.add(postDtoItem);
		}
		return postDtos;
	}

	@Override
	public List<PostDto> searchPostsByKeyword(String keyword) {
		List<Post> posts = postRepository.findAll();
		List<PostDto> postDtos = new ArrayList<>();

		for (Post postItem : posts) {
			if (postItem.getContent().contains(keyword) || postItem.getTitle().contains(keyword)) {
				PostDto postDtoItem = postToDto(postItem);
				postDtos.add(postDtoItem);
			}
		}

		return postDtos;
	}

	private Post dtoToPost(PostDto postDto) {
		Post post = modelMapper.map(postDto, Post.class);
		return post;
	}

	private PostDto postToDto(Post post) {
		PostDto postDto = modelMapper.map(post, PostDto.class);
		return postDto;
	}

}
