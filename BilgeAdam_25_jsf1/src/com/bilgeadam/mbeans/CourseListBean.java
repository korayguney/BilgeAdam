package com.bilgeadam.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;

import com.bilgeadam.models.Course;
import com.bilgeadam.models.User;
import com.bilgeadam.services.CourseService;
import com.bilgeadam.services.UserService;

@ManagedBean
public class CourseListBean {
	private Course course;
	private List<Course> courses;
	private List<Course> userCourses;

	@EJB
	CourseService courseService;

	@PostConstruct
	public void init() {
		course = new Course();
		courses = courseService.getAllCourses();
		userCourses = new ArrayList<Course>();
	}

	public List<Course> getCoursesOfUserOnSession() {
		int userId = sessionScopeBean.getUser().getId();
		userCourses = courseService.retrieveCoursesOfUser(userId);
		
		userCourses.stream().forEach(c -> System.out.println(c.getCourseName()));
		
		return userCourses;
	}
	
	@ManagedProperty("#{sessionScopeBean}")
	SessionScopeBean sessionScopeBean;
	
	public String saveCourse() {
		courseService.saveCourseToDB(course);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"", "Saved"));
		return "addcourse";
	}
	
	public String allUserCourses() {
		getCoursesOfUserOnSession();		
		
		return "studentcourses";
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Course> getUserCourses() {
		return userCourses;
	}

	public void setUserCourses(List<Course> userCourses) {
		this.userCourses = userCourses;
	}

	public SessionScopeBean getSessionScopeBean() {
		return sessionScopeBean;
	}

	public void setSessionScopeBean(SessionScopeBean sessionScopeBean) {
		this.sessionScopeBean = sessionScopeBean;
	}

	
	
	
}
