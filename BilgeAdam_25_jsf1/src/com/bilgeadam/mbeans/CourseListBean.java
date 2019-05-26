package com.bilgeadam.mbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;

import com.bilgeadam.models.Course;
import com.bilgeadam.models.User;
import com.bilgeadam.services.CourseService;
import com.bilgeadam.services.UserService;

@ManagedBean
public class CourseListBean {

	private List<Course> courses;

	@EJB
	CourseService courseService;

	@PostConstruct
	public void init() {
		courses = courseService.getAllCourses();
	}

	public List<Course> getCourses() {
		return courses;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
