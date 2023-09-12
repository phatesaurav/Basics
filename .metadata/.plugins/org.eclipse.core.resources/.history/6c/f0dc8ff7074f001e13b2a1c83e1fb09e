package com.springrest.service;

import java.util.List;

import com.springrest.entity.Course;

// Created 'CourseService' interface for loose coupling
// Implemented the methods in 'CourseServiceImpl' class
public interface CourseService {

	// Here runtime polymorphism will happen
	// It this interface will call child class for method implementation
	public List<Course> getCourses();

	public Course getCourse(long id);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long id);

}
