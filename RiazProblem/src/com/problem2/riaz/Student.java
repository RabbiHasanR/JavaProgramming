package com.problem2.riaz;

public class Student {
	private String studentId;
	private String wantCourse;

	public Student(String studentId, String wantCourse) {
		this.studentId = studentId;
		this.wantCourse = wantCourse;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getWantCourse() {
		return wantCourse;
	}

}
