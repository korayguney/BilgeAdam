package com.bilgeadam.inheritancechallenge;

import java.util.Iterator;

public class Teacher extends Person {

	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES_GIVEN = 5;

	public Teacher(String name, String address) {
		super(name, address);
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES_GIVEN];
	}

	// will add course if not exist
	public boolean addCourse(String course) {
		// check if the course is already exist or not
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				return false;
			}
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}

	public boolean removeCourseChecker(String course) {
		if(courses.length <= 0) {
			System.out.println("You cannot remove course. Because the course list is empty");
			return false;
		} else {
			return removeCourse(course);
		}
	}
	
	private boolean removeCourse(String course) {
		// check if course is exist or not
		boolean found = false;
		int course_index= -1;
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				found = true;
				course_index = i;
				break;
			}else {
				System.out.println("Course NOT removed!!!!");
				return false;
			}
		}
		for (int i = course_index; i < numCourses-1; i++) {
			courses[i] =  courses[i+1];
		}
		numCourses--;
		System.out.println("Course removed!!!!");
		return true;
	}

	@Override
	public String toString() {
		return "Teacher : " + super.toString();
	}

}
