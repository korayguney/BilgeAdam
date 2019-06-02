package com.bilgeadam.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = -6951552027080675109L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastname;
	@NotNull
	@Column(unique=true)
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;

	@ManyToMany(mappedBy="users", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Course> courses;
	
	public enum Role {

		STUDENT("STUDENT"), ADMIN("ADMIN"), INSTRUCTOR("INSTRUCTOR");

		private String role;

		private Role(String role) {
			this.role = role;
		}

		public String getRole() {
			return role;
		}

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname;
	}
	
	

}
