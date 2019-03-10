package com.bilgeadam.streamapi2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Koray", "Güney", 7500, "IT"));
		employees.add(new Employee("Hasan", "Þimþek", 8500, "IT"));
		employees.add(new Employee("Erkut", "Þen", 5845, "HR"));
		employees.add(new Employee("Fatma", "Güneþen", 3980, "HR"));
		employees.add(new Employee("Mustafa", "Kaya", 6660, "Sales"));
		employees.add(new Employee("Ece", "Yaðmur", 4500, "Sales"));
		employees.add(new Employee("Ece", "Yaðmur", 4500, "Sales"));
		
		
	      // display all Employees
		System.out.println("========Employees========");
	    employees.forEach(System.out::println);  
		
	      // Predicate that returns true for salaries in the range $4000-$6000
	    Predicate<Employee> filteredSalaries = emp -> emp.getSalary() >= 4000 && emp.getSalary() <=6000;
	    
	      // Display Employees with salaries in the range $4000-$6000
	      // sorted into ascending order by salary
	    System.out.println("\n========Employees with salaries in the range $4000-$6000========");
	    employees.stream().filter(filteredSalaries).sorted((emp1, emp2) -> (int) (emp1.getSalary() - emp2.getSalary())).forEach(System.out::println);;
	    
		  // Display first Employee with salary in the range $4000-$6000
	    System.out.println("\n========First Employee with salaries in the range $4000-$6000========");
	    Employee firstEmployee = (employees.stream().filter(filteredSalaries).sorted((emp1, emp2) -> (int) (emp1.getSalary() - emp2.getSalary())).findFirst()).get();
	    System.out.println(firstEmployee);
	    
	      // Functions for getting first and last names from an Employee
	    Function<Employee, String> byFirstName = Employee::getFirstname;
	    Function<Employee, String> byLastName = t -> t.getLastname();
	    
	      // Comparator for comparing Employees by first name then last name
	    Comparator<Employee> compareEmpWithFirstName = Comparator.comparing(byFirstName).thenComparing(byLastName);
	    
	      // sort employees by last name, then first name 
	    System.out.println("\n========sorted employee list by last name, then first name0========");
	    employees.stream().sorted(compareEmpWithFirstName).forEach(System.out::println);;
	    
	      // sort employees in descending order by last name, then first name
	    System.out.println("\n========sorted employee list by last name, then first name by descanding order========");
	    employees.stream().sorted(compareEmpWithFirstName.reversed()).forEach(System.out::println);
	    
	      // display unique employee last names sorted
	    System.out.println("\n========display unique employee last names sorted========");
	    employees.stream().map(Employee::getLastname).sorted().distinct().forEach(System.out::println);

	      // display only first and last names
	    System.out.println("\n========display only first and last names========");
	    employees.stream().map(e -> e.getFirstname() + " " + e.getLastname()).forEach(System.out::println);

	      // group Employees by department
	    System.out.println("\n========group Employees by department========");
	    Map<String, List<Employee>> empByDept =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	    empByDept.forEach((department, empList) -> {
	    	System.out.println("======DEPARTMENT : " + department+"======");
	    	empList.forEach(e -> System.out.println(e));
	    });
	    
		  // count number of Employees in each department
	    System.out.println("\n========count number of Employees in each department========");
	    Map<String, Long> empCountByDept =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , TreeMap::new , Collectors.counting()));
	    empCountByDept.forEach((department, empCount) -> System.out.println(department + " has " + empCount + " person"));

	      // sum of Employee salaries with DoubleStream sum method
	    System.out.println("\n========sum of Employee salaries========");
	    double salaryTotal = employees.stream().mapToDouble(e -> e.getSalary()).sum();
	    System.out.println("Total : " + salaryTotal  +" TL");
	    
	      // calculate sum of Employee salaries with Stream reduce method
	    System.out.println("\n========sum of Employee salaries 2========");
	    double salaryTotal2=  employees.stream().mapToDouble(e -> e.getSalary()).reduce(0,(a,b) -> (a+b));
	    System.out.println("Total : " + salaryTotal2  +" TL");
	    
	      // average of Employee salaries with DoubleStream average method
	    System.out.println("\n========average of Employee salaries========");
	    OptionalDouble result =  employees.stream().mapToDouble(e -> e.getSalary()).average();
		System.out.printf("Average : %.02f TL", result.getAsDouble());
	    
	}

}
