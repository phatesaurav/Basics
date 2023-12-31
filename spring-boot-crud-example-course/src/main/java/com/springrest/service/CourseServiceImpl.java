package com.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.entity.Course;
import com.springrest.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository repository;

	@Override
	public List<Course> getCourses() {
		return repository.findAll();
	}

	@Override
	public Course getCourse(long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Course addCourse(Course course) {
		return repository.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		return repository.save(course);
	}

	@Override
	public void deleteCourse(long id) {
		repository.deleteById(id);
	}

}
