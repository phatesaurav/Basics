package com.blog.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {
        String errorResponse = ex.getMessage();
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

		Map<String, String> errorResponse = new HashMap<>();
		BindingResult bindingResult = ex.getBindingResult();

		for (FieldError fieldError : bindingResult.getFieldErrors()) {
			errorResponse.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
}
