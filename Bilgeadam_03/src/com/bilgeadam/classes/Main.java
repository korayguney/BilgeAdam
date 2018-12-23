package com.bilgeadam.classes;

public class Main {

	public static void main(String[] args) {

		// Object referrer...
		Employee employee1 = new Employee();

//		employee1.emp_age = 234;
//		employee1.emp_departmant = "Sales";
//		employee1.emp_ID = 12345;
		// employee1.emp_name = "Jon Snow";

		// System.out.println("Age of the employee : " + employee1.emp_age);
//		employee1.setEmp_name("Koray");
//		System.out.println("set emp name is called : " + employee1.getEmp_name());
//
//		employee1.setEmp_age(500);
//		System.out.println(employee1.getEmp_age());
		
		employee1.setSalary(5000.00);
		System.out.println("Salary before increment : " + employee1.getSalary());
		employee1.raiseSalary(1000.00);
		System.out.println("Salary after increment : " + employee1.getSalary());

	}

}
