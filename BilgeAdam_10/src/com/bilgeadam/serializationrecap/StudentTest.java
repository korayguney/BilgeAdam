package com.bilgeadam.serializationrecap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {
	
	static Course course1 = new Course(455, "Math");
	static Course course2 = new Course(852, "Chemistry");
	static Course course3 = new Course(455, "Physics");
	
	static Course[] courses = {course1, course2, course3};
	
	static Student student = new Student(123, "Ayþe", "Korkmaz", courses);
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//doSerializable();
		doReserializable();
	}

	public static void doSerializable() throws IOException {

		FileOutputStream fos = new FileOutputStream(new File("./student.ser"));
		ObjectOutputStream ous = new ObjectOutputStream(fos);
		
		ous.writeObject(student);
		System.out.println("Student is serialized");
		
		fos.flush();
		ous.flush();
		
		fos.close();
		ous.close();
	}

	public static void doReserializable() throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(new File("./student.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student student = (Student)ois.readObject();
		System.out.println(student);
		
		fis.close();
		ois.close();
		
	}

}
