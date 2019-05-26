package com.bilgeadam.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.bilgeadam.models.Student;
import com.bilgeadam.services.StudentService;

@ManagedBean
public class StudentBean {

	private Student student = new Student();
	private List<Student> studentList = new ArrayList<Student>();
	
	@EJB
	StudentService studentService;
	
	
	public void saveStudent() {
		studentService.saveStudent(student);
		studentList = studentService.getAllStudents(); 
	}
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	public List<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
	
}
