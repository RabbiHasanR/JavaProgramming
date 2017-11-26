package com.lab.work;

public class HotelIbrahim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("Rabbi", "152-35-1199");
		Manager m = new Manager("Nayem", "1", "Yes");
		Stuff s = new Stuff("sourav", "12");
		st.bookRoom(m);
		st.buyFood(s);
		m.arrangeSportsEvent(st);
		s.roomClean();
	}

}
