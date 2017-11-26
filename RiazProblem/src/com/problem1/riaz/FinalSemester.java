package com.problem1.riaz;

public class FinalSemester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project p = new Project("Project", "Bank managment", "SWE");
		Thesis t = new Thesis("Thesis", "OOP", "SWE");
		Student s = new Student("152-35-1199", "Riaz", "Project");
		s.takeCourse(p, t);

	}

}
