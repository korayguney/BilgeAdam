package com.bilgeadam.mbeans;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.bilgeadam.models.Course;
import com.bilgeadam.models.User;
import com.bilgeadam.services.CourseService;
import com.bilgeadam.services.UserService;

@ManagedBean
public class AssignCourseBean {

	private User user;
	private Course course;

	private int selectedUserId;
	private int selectedCourseId;

	@EJB
	UserService userService;

	@EJB
	CourseService courseService;

	@PostConstruct
	public void init() {
		user = new User();
		course = new Course();
	}

	public List<User> getAllUsersExceptAdmin() {
		List<User> users = userService.retrieveAllUsersExceptAdmin();
		return users;
	}

	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}

	public String assign() {
		Map<User, Course> returned = userService.assignCourseToUser(selectedUserId, selectedCourseId);
		for (Entry<User, Course> a : returned.entrySet()) {
			user = a.getKey();
			course = a.getValue();
		}

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "", course.getCourseName() + " is assigened to " + user));
		return "assigncourse";
	}

	// Getters & Setters

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getSelectedUserId() {
		return selectedUserId;
	}

	public void setSelectedUserId(int selectedUserId) {
		this.selectedUserId = selectedUserId;
	}

	public int getSelectedCourseId() {
		return selectedCourseId;
	}

	public void setSelectedCourseId(int selectedCourseId) {
		this.selectedCourseId = selectedCourseId;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
