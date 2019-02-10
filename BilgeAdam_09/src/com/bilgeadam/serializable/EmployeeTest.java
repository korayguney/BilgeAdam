package com.bilgeadam.serializable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String path = "employee.ser";
		//serialize(path);
		deserialize(path);
	}
	
	public static void deserialize(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)));
		Object employeeObject = ois.readObject();
		Employee emp = (Employee)employeeObject;
		
		System.out.println(emp.getName());
		System.out.println(emp.getLastname());
		System.out.println(emp.getAge());
		System.out.println(emp.toString());
		System.out.println("The employee is deserialized");
		
	}
	
	public static void serialize(String filename) throws FileNotFoundException, IOException {
		
		Employee emp = new Employee();
		emp.setAge(25);
		emp.setName("Mustafa");
		emp.setLastname("Korkmaz");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
		oos.writeObject(emp);
		System.out.println("The employee is serialized");
	}
	
	
}
