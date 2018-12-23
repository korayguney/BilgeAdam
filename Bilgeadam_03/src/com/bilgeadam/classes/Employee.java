package com.bilgeadam.classes;

public class Employee {
	
	// instance variables && fields
	private String emp_name ;
	private int emp_age;
	private int emp_ID;
	private double salary;
	private String emp_departmant;
	
	
	// behaviour && behavior
	public void raiseSalary(double increment){
		this.salary += increment;
	}
	
	
	// Setter
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	// Getter
	public String getEmp_name() {
		return this.emp_name;
	}
	
	public void setEmp_age(int emp_age) {
		
		if(emp_age <= 120) {
			this.emp_age = emp_age;
		} else {
			System.err.println("Age is not valid! : " + emp_age);
		}
		
	}
	
	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmp_departmant() {
		return emp_departmant;
	}

	public void setEmp_departmant(String emp_departmant) {
		this.emp_departmant = emp_departmant;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public int getEmp_ID() {
		return emp_ID;
	}
	
	
	
	
	

}
