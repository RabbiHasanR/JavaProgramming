package com.problem2.riaz;

public class LabCourse extends Course {
	private double labTestMark;

	public LabCourse(double attendanceMark, double quizeMark, double assignmentMark, double midMark, double finalMark,
			double labTestMark) {
		super(attendanceMark, quizeMark, assignmentMark, midMark, finalMark);
		this.labTestMark = labTestMark;
	}

	public double getLabTestMark() {
		return labTestMark;
	}

	public void showLabCourseDetailMarks() {
		super.showAllMark();
		System.out.println("LabTest Mark:" + getLabTestMark());
	}

	public void calculateTotalMark() {
		double totalMark = super.getAttendanceMark() + super.getQuizeMark() + super.getAssignmentMark()
				+ super.getMidMark() + super.getFinalMark() + getLabTestMark();
		System.out.println("Total Mark:" + totalMark);
	}

}
