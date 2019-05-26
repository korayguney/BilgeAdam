package com.bilgeadam.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bilgeadam.models.Student;

@Stateless
public class StudentService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public void saveStudent(Student student) {
		entityManager.persist(student);
	}
	
	public List<Student> getAllStudents(){
		
		List<Student> students = entityManager.createQuery("select s from Student s order by s.id desc", Student.class).getResultList();
		return students;
	}
	
	
}
