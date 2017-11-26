package com.problem1.riaz;

public class Course {
	private String courseName;
	private String courseTitle;
	private String department;

	public Course(String courseName, String courseTitle, String department) {
		this.courseName = courseName;
		this.courseTitle = courseTitle;
		this.department = department;

	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public String getDepartment() {
		return department;
	}

	public String getCourseName() {
		return courseName;
	}

	public void showInfo() {
		System.out.println("Course Name:" + getCourseName());
		System.out.println("Course Title:" + getCourseTitle());
		System.out.println("Course Department:" + getDepartment());
	}

}
