package com.bilgeadam.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course implements Serializable{
	
	private static final long serialVersionUID = -6951552027080634109L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	private int id;
	@Column(unique=true)
	private String courseCode;
	private String courseName;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<User> users;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int getId() {
		return id;
	}
	
	
	
	
	
	
	
	
	
	
}
