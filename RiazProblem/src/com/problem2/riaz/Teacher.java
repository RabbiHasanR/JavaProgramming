package com.problem2.riaz;

public class Teacher {
	private String teacherId;
	private String teacherName;
	private String teacherInitial;
	private String teacherDesignation;

	public Teacher(String teacherId, String teacherName, String teacherInitial, String teacherDesignation) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherInitial = teacherInitial;
		this.teacherDesignation = teacherDesignation;

	}

	public String getTeacherId() {
		return teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public String getTeacherInitial() {
		return teacherInitial;
	}

	public String getTeacherDesignation() {
		return teacherDesignation;
	}

	public void showTeacherInfo() {
		System.out.println("Teacher Id:" + getTeacherId());
		System.out.println("Teacher Name:" + getTeacherName());
		System.out.println("Teacher Initial:" + getTeacherInitial());
		System.out.println("Teacher Designation:" + getTeacherDesignation());
	}

	public void showResult(TheoryCourse tc, LabCourse lc, Student s) {
		if (s.getWantCourse().equals("Theory")) {
			System.out.println("Student Id:" + s.getStudentId());
			tc.showTheoryCourseDetailMarks();
			tc.calculateTotalMark();
		} else {
			lc.showLabCourseDetailMarks();
			lc.calculateTotalMark();
		}
	}

}
