package com.bilgeadam.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bilgeadam.models.Course;
import com.bilgeadam.models.User;
import com.bilgeadam.models.User.Role;
import com.bilgeadam.utils.HashAlgorithm;
import com.bilgeadam.utils.HashingUtils;

@Stateless
public class LoginService {

	@PersistenceContext
	EntityManager entityManager;
	
	User user, user2;
	Course course1,course2,course3;

	public boolean checkUserOnDb(String email, String password) {
		
		List<User> users = entityManager.createQuery("SELECT u FROM User u WHERE email=:email AND password=:password", User.class).
		setParameter("email", email).setParameter("password", HashingUtils.hashPassword(password, HashAlgorithm.SHA256).toString()).getResultList();
		
		boolean result = users.size() > 0 ? true:false;
		
		return result;
	}

	public User getUser(String email, String password) {
		
		User user = (User)entityManager.createQuery("SELECT u FROM User u WHERE email=:email AND password=:password").
				setParameter("email", email).setParameter("password" , HashingUtils.hashPassword(password, HashAlgorithm.SHA256).toString()).getSingleResult();		
		
		return user;
	}

	public void saveInitializedUser() {
		
		List<User> users = entityManager.createQuery("select u from User u").getResultList();
		
		if(users.size() == 0) {
			user = new User();
	    	user.setFirstname("Koray ");
	    	user.setLastname("Guney");
	    	user.setEmail("kg@kg.com");
	    	user.setPassword(HashingUtils.hashPassword("1234", HashAlgorithm.SHA256).toString());
	    	user.setRole(Role.ADMIN);
	    	
	    	user2 = new User();
	    	user2.setFirstname("Koray ");
	    	user2.setLastname("Guney");
	    	user2.setEmail("kg1@kg.com");
	    	user2.setPassword(HashingUtils.hashPassword("1234", HashAlgorithm.SHA256).toString());
	    	user2.setRole(Role.STUDENT);
	    	
			entityManager.persist(user);
			entityManager.persist(user2);
		}
		
		List<Course> courses = entityManager.createQuery("select c from Course c").getResultList();
		
		if(courses.size() == 0) {
			
			course1 = new Course();
			course2 = new Course();
			course3 = new Course();
			
			course1.setCourseCode("IT535");
			course1.setCourseName("Introduction to Java Programming");
			
			course2.setCourseCode("OS245");
			course2.setCourseName("Operating Systems");
			
			course3.setCourseCode("MI155");
			course3.setCourseName("Agile Metodology");
			
			entityManager.persist(course1);
			entityManager.persist(course2);
			entityManager.persist(course3);
			
		}
		
	}
	
}
