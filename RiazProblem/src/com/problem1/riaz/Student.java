package com.problem1.riaz;

public class Student {
	private String studentId;
	private String studentName;
	private String wantCourse;

	public Student(String studentId, String studentName, String wantCourse) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.wantCourse = wantCourse;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void studentInfo() {
		System.out.println("Student Id:" + getStudentId());
		System.out.println("Student Name:" + getStudentName());
	}

	public void takeCourse(Project p, Thesis t) {
		if (wantCourse.equals("Project")) {
			p.showInfo();
			studentInfo();
		} else {
			t.showInfo();
			studentInfo();
		}
	}

}
