package com.problem2.riaz;

public class ProcessingResult {

	public static void main(String[] args) {
		TheoryCourse tc = new TheoryCourse(4, 13, 5, 18, 35, 6);
		LabCourse lc = new LabCourse(3, 14, 4, 17, 34, 9);
		Student s = new Student("152-35-1199", "Lab");
		Teacher t = new Teacher("11-32", "Shurov Hasan", "Sh", "Lecturare");
		t.showResult(tc, lc, s);
		System.out.println("...........Teacher Detail..........");
		t.showTeacherInfo();

	}

}
