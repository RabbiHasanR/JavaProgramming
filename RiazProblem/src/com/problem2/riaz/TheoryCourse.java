package com.problem2.riaz;

public class TheoryCourse extends Course {
	private double presentationMark;

	public TheoryCourse(double attendanceMark, double quizeMark, double assignmentMark, double midMark,
			double finalMark, double presentationMark) {
		super(attendanceMark, quizeMark, assignmentMark, midMark, finalMark);
		this.presentationMark = presentationMark;
	}

	public double getPresentationMark() {
		return presentationMark;
	}

	public void showTheoryCourseDetailMarks() {
		super.showAllMark();
		System.out.println("Presentation Mark:" + getPresentationMark());
	}

	public void calculateTotalMark() {
		double totalMark = super.getAttendanceMark() + super.getQuizeMark() + super.getAssignmentMark()
				+ super.getMidMark() + super.getFinalMark() + getPresentationMark();
		System.out.println("Total Mark:" + totalMark);
	}

}
