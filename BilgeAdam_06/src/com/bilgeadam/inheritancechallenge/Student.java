package com.bilgeadam.inheritancechallenge;

public class Student extends Person {

	private int numCourses;  // count of taken courses by student 
	private String[] courses; // taken courses list
	private int[] grades; // taken courses grades list
	private static final int MAX_COURSES = 30;

	public Student(String name, String address) {
		super(name, address);
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES];
		this.grades = new int[MAX_COURSES];
	}

	// will be add courses and grades to specific array index
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
	}

	// will print grades of the student
	public void printGrades() {
		for (int i = 0; i < numCourses; i++) {
			System.out.println("Course: " + courses[i] + ", Grade: " + grades[i]);
		}
	}

	// will calculate average of the Student object
	public double getAverageGrade() {
		int sum = 0;

		for (int i = 0; i < numCourses; i++) {
			sum += grades[i];
		}
		return (double) sum / numCourses;
	}

	@Override
	public String toString() {
		return "Student : " + super.toString();
	}

}
