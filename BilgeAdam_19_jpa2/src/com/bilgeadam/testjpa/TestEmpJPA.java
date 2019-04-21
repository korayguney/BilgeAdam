package com.bilgeadam.testjpa;

import javax.persistence.EntityManager;

import com.bilgeadam.models.Department;
import com.bilgeadam.models.Employee;
import com.bilgeadam.models.Project;
import com.bilgeadam.utils.EntityUtils;

public class TestEmpJPA {

	public static void main(String[] args) {
		
		Department department1 = new Department("IT");
		Department department2 = new Department("Sales");
		Department department3 = new Department("HR");
		Department department4 = new Department("Quality");
		
		Project project1 = new Project("AI", 100000);
		Project project2 = new Project("VR", 150000);
		
		Employee emp1 = new Employee("Koray Güney", 35, department1);
		Employee emp2 = new Employee("Yýldýz Yaðcý", 29, department1);
		Employee emp3 = new Employee("Kübra Yapýcýoðlu", 27, department4);
		Employee emp4 = new Employee("Melis Türkoðlu", 26, department3);
		Employee emp5 = new Employee("Anýl Alnýak", 23, department2);

		EntityManager em = EntityUtils.getEntityManager("mysqlPU");
		em.getTransaction().begin();
		
		
		emp1.getProjects().add(project1);
		emp2.getProjects().add(project1);
		emp4.getProjects().add(project2);
		emp3.getProjects().add(project1);
		emp5.getProjects().add(project2);
		
		em.persist(project1);
		em.persist(project2);
		
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		em.persist(emp5);
	
		em.persist(department1);
		em.persist(department2);
		em.persist(department3);
		em.persist(department4);
		
		em.getTransaction().commit();
		System.out.println("All data is persisted");
		
		EntityUtils.closeEntityManager(em);
		
	}

}
