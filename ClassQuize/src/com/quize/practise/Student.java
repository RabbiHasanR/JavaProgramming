package com.quize.practise;

public class Student {
	private String studentName;
	private String studentId;
	
	public Student(String studentName,String studentId){
		this.studentName=studentName;
		this.studentId=studentId;
	}
	public String getStudentId(){
		return studentId;
	}
	public void rentRoom(Manager m,Room r){
		m.manageRoomRanting(r);
		System.out.println("Manager Id:"+m.getManagerId());
		System.out.println("Room Id:"+r.getRoomId());
		System.out.println("Student Id:"+studentId);
		
	}

}
