package com.bilgeadam.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Random;

public class CollectionClass {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		Student student1 = new Student("Ahmet", 25);
		Student student2 = new Student("Mehmet", 24);
		Student student3 = new Student("ali", 21);
		Student student4 = new Student("Mustafa", 25);
		Student student5 = new Student("Kemal", 22);
		Student student6 = new Student("Kemal", 22);
		Student student8 = new Student("Kemal", 22);
		Student student9 = new Student("Kemal", 22);
		Student student10 = new Student("Kemal", 22);
		Student student11 = new Student("Kemal", 22);
		Student student12 = new Student("Kemal", 22);
		Student student13 = new Student("Kemal", 22);
		Student student14 = new Student("Kemal", 22);
		Student student15 = new Student("Kemal", 22);
		Student student16 = new Student("Ayşe", 26);
		Student student7 = new Student("Fatma", 27);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		students.add(student11);
		students.add(student12);
		students.add(student13);
		students.add(student14);
		students.add(student15);
		students.add(student16);
		students.add(student7);
		students.add(student7);

//		Collections.sort(students, new Comparator<Student>() {
//			@Override
//			public int compare(Student stu1, Student stu2) {
//				return stu1.getAge() - stu2.getAge();
//			}
//		});
		// with lambda
		// Collections.sort(students, (stu1,stu2) -> stu1.getAge() - stu2.getAge());
		Collections.sort(students);
		
		
		for (Student student : students) {
			System.out.println(student);
		}
//		System.out.println("=== SHUFFLE ===");
//		Collections.shuffle(students);
//		
//		Student maxStu = Collections.max(students);
//		System.out.println("Last Student : "+maxStu);
//		
//		Student minStu = Collections.min(students);
//		System.out.println("First Student : "+minStu);
//		
//		for (Student student : students) {
//			System.out.println(student);
//		}
		
		Student lastStudent = students.get(students.size()-1);
		System.out.println(lastStudent);
		
		for (int i = 0; i < students.size(); i++) {
			System.out.print(".");
			if(students.get(i).equals(lastStudent)) {
				System.out.println("Student found!");
			} 
		}
		
		if(myBinarySearch(students, student7)) {
			System.out.println("We found!");
		};
		
		
		
		
		
//		ArrayList<Integer> intArr = new ArrayList<>();
//		Random random = new Random();
//		System.out.println("===== NOT SORTED =====");
//		for (int i = 0; i < 10; i++) {
//			intArr.add(random.nextInt(100));
//			System.out.println(intArr.get(i));
//		}
//		
//		Collections.sort(intArr);
//		System.out.println("===== SORTED =====");
//		for (int i = 0; i < intArr.size(); i++) {
//			System.out.println(intArr.get(i));
//		}
//		
//		Collections.reverse(intArr);
//		System.out.println("===== REVERSED =====");
//		for (int i = 0; i < intArr.size(); i++) {
//			System.out.println(intArr.get(i));
//		}

	}
	
	private static boolean myBinarySearch(ArrayList<Student> list, Student student) {
		int low = 0;
        int high = list.size()-1;

        while (low <= high) {
        	System.out.print(".");
            int mid = (low + high) /2;
            Student midVal = list.get(mid);
            int cmp = midVal.compareTo(student);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return true; // key found
        }
        return false;  // key not found
	}
	

}
