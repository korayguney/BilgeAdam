package com.bilgeadam.serializationrecap;

import java.io.Serializable;
import java.util.Arrays;

public class Student extends Person{
	
	
	private int school_id;
	private String first_name;
	private String last_name;
	private Course[] courses;
	
	public Student(int school_id, String first_name, String last_name, Course[] courses) {
		super();
		this.school_id = school_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.courses = courses;
	}
	
	public int getSchool_id() {
		return school_id;
	}
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [school_id=" + school_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", courses=" + Arrays.toString(courses) + "]";
	}
	
	
	
	
	
}
