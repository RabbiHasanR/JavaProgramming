package com.quize.practise;

public class Manager {
	private int managerId;
	private String managerName;
	
	public Manager(int managerId,String managerName){
		this.managerId=managerId;
		this.managerName=managerName;
	}
	public int getManagerId(){
		return managerId;
	}
	public void manageRoomRanting(Room r){
		try{
		if(r.getRoomAvailability().equals("yes")){
			System.out.println("Room has avilabale");
			//r.getRoomAvailability().
		}
		else{
			System.out.println("Room has not avilabale");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
