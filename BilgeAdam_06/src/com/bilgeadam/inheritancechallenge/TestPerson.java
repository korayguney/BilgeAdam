package com.bilgeadam.inheritancechallenge;

public class TestPerson {

	public static void main(String[] args) {

		/*
		 * Test Student Class
		 */

		Student student = new Student("Mehmet Kaya", "Yenimahalle / Ankara");
		student.addCourseGrade("IT535", 93);
		student.addCourseGrade("IT525", 79);
		student.addCourseGrade("IT545", 54);

		student.printGrades();
		double average = student.getAverageGrade();
		System.out.println("Student average is : " + average);

		/*
		 * Teacher Class test
		 */

		Teacher teacher = new Teacher("Ilber Ortaylı", "Ortaköy / İstanbul");
		String[] courses = { "IT535", "IT525", "IT535" };
		for (int i = 0; i < courses.length; i++) {
			boolean result = teacher.addCourse(courses[i]);
			if (result)
				System.out.println("Course added : " + courses[i]);
			else
				System.out.println("Course NOT added : " + courses[i]);
			// String result2 = result?"Course added : " +courses[i]:"Course NOT added : "
			// +courses[i];
		}

		/*
		 * for removing all courses
		 */
//		for (String course : courses) {
//			if (teacher.removeCourseChecker(course)) {
//				System.out.println("Course removed : " + course);
//			} else {
//				System.out.println("Course NOT removed : " + course);
//			}
//		}

		String course = "IT575";
		teacher.removeCourseChecker(course);
		
	}

}
