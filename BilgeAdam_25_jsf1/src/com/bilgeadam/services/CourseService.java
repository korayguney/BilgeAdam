package com.bilgeadam.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bilgeadam.models.Course;

@Stateless
public class CourseService {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Course> getAllCourses() {
		List<Course>  courses = entityManager.createQuery("select c from Course c", Course.class).getResultList();
		
		return courses;
	}
	
	
}
