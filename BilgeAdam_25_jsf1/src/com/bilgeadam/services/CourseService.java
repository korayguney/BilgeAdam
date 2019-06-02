package com.bilgeadam.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bilgeadam.models.Course;
import com.bilgeadam.models.User;

@Stateless
public class CourseService {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Course> getAllCourses() {
		List<Course>  courses = entityManager.createQuery("select c from Course c", Course.class).getResultList();
		
		return courses;
	}

	public void saveCourseToDB(Course course) {
		entityManager.persist(course);
	}

	public List<Course> retrieveCoursesOfUser(int userId) {
		
		User user = entityManager.find(User.class, userId);
		List<Course> courses = user.getCourses();
		
		return courses;
	}
	
	
}
