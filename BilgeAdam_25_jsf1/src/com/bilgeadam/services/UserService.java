package com.bilgeadam.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bilgeadam.exceptions.EmailAlreadyExistException;
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

}
