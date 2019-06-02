package com.bilgeadam.services;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.bilgeadam.exceptions.EmailAlreadyExistException;
import com.bilgeadam.models.Course;
import com.bilgeadam.models.User;
import com.bilgeadam.utils.HashAlgorithm;
import com.bilgeadam.utils.HashingUtils;

@Stateless
public class UserService {

	@PersistenceContext
	EntityManager entityManager;

	public void saveUser(User user) throws EmailAlreadyExistException {

		List<User> users = entityManager.createQuery("select u from User u where email=:usermail", User.class)
				.setParameter("usermail", user.getEmail()).getResultList();
		
		if(users.size() > 0) {
			throw new EmailAlreadyExistException();
		}
		
		entityManager.persist(user);
		
		String hashedPAssw = HashingUtils.hashPassword(user.getPassword(), HashAlgorithm.SHA256).toString();
		user.setPassword(hashedPAssw);
		
		entityManager.merge(user);
		
	}

	public List<User> getAllUsers() {
		List<User>  users = entityManager.createQuery("select u from User u", User.class).getResultList();
		
		return users;
	}

	public void deleteUser(User user) {

		user = entityManager.find(User.class, user.getId());
		entityManager.remove(user);
	}

	public User getUser(int userId) {
		User user = entityManager.find(User.class, userId);
		return user;
	}

	public void updateUser(User user) {
		entityManager.merge(user);
	}

	public List<User> retrieveAllUsersExceptAdmin() {
		
		Query query =entityManager.createQuery("select u from User u where u.role=:userrole1 OR u.role=:userrole2", User.class);
		query.setParameter("userrole1", User.Role.STUDENT);
		query.setParameter("userrole2", User.Role.INSTRUCTOR);
		 List<User> users = query.getResultList();
		
		return users;
	}

	public Map<User, Course> assignCourseToUser(int selectedUserId, int selectedCourseId) {
		
		Map<User, Course> assignMap = new HashMap<User, Course>();
		
		User selecteduser = entityManager.find(User.class, selectedUserId);
		Course selectedCourse = entityManager.find(Course.class, selectedCourseId);
		
		selectedCourse.getUsers().add(selecteduser);
		
		entityManager.merge(selectedCourse);
		entityManager.merge(selecteduser);
		
		assignMap.put(selecteduser, selectedCourse);
		
		return assignMap;
	}

}
