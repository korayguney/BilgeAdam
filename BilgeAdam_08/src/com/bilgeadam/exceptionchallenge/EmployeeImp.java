package com.bilgeadam.exceptionchallenge;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImp {
	
	private Employee[] employees = new Employee[10];
	
	public void add(Employee employee) throws InvalidOperationException {
		if(employee.getId() > employees.length-1 || employee.getId() < 0) {
			throw new ArrayIndexOutOfBoundsException("The id is exceeded the lenght of Array" );
		} else if (employees[employee.getId()] != null){
			throw new InvalidOperationException("The employee is already exist" );
		} else {
			employees[employee.getId()] = employee;
			System.out.println("Added employee: " + employee.toString());
		}
	}

	public void delete(int id) throws InvalidOperationException {
		
		if(employees[id] == null) {
			throw new NullPointerException();
		} else if(id > employees.length-1 || id < 0) {
			throw new InvalidOperationException("Out of bounds");
		} else {
			employees[id] = null;
		}
		
	}
	
	public Employee[] getAllEmployees() {
		List<Employee> employeeArr = new ArrayList<>();
		for (Employee employee : employees) {
			employeeArr.add(employee);
		}
		
		Employee[] newArr = employeeArr.toArray(new Employee[employeeArr.size()]);
		return newArr;
		
	}
	
	
	
	
}
