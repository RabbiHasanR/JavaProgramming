package com.problem2.riaz;

public class Course {
	private double attendanceMark;
	private double quizeMark;
	private double assignmentMark;
	private double midMark;
	private double finalMark;

	public Course(double attendanceMark, double quizeMark, double assignmentMark, double midMark, double finalMark) {
		this.attendanceMark = attendanceMark;
		this.quizeMark = quizeMark;
		this.assignmentMark = assignmentMark;
		this.midMark = midMark;
		this.finalMark = finalMark;
	}

	public double getAttendanceMark() {
		return attendanceMark;
	}

	public double getQuizeMark() {
		return quizeMark;
	}

	public double getAssignmentMark() {
		return assignmentMark;
	}

	public double getMidMark() {
		return midMark;
	}

	public double getFinalMark() {
		return finalMark;
	}

	public void showAllMark() {
		System.out.println("Attendence Mark:" + getAttendanceMark());
		System.out.println("Quiz Mark:" + getQuizeMark());
		System.out.println("Assignment Mark:" + getAssignmentMark());
		System.out.println("Mid Mark:" + getMidMark());
		System.out.println("Final Mark:" + getFinalMark());
	}

}
