package com.example.spring.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> Courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(Courses::add);
		return Courses;
	}

	public void saveCourse(Course Course) {
		courseRepository.save(Course);
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void updateCourse(Course Course) {
		courseRepository.save(Course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
