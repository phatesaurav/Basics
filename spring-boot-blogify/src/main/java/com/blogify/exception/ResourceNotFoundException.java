package com.blogify.exception;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String resourceName, Integer id) {
		super(resourceName + " not found with ID: " + id);
	}

}
