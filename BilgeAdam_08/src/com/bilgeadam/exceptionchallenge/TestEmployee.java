package com.bilgeadam.exceptionchallenge;

public class TestEmployee {

	public static void main(String[] args) throws InvalidOperationException {

		Employee employee = new Employee(0, "Mehmet", "Taþcý", 2547.89f);
		Employee employee2 = new Employee(1, "Ahmet", "Taþcý", 2547.89f);
		
		EmployeeImp empImp = new EmployeeImp();
		empImp.add(employee);
		empImp.add(employee2);
		//empImp.add(employee);
		
		
		//empImp.delete(5);
		
		
		for (Employee emp : empImp.getAllEmployees()) {
			System.out.println(emp);
		}
	}

}
