package com.blog.exception;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String resourceName, int id) {
		super(resourceName + " not found with ID: " + id);
	}

}
