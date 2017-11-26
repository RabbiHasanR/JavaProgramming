package com.datetime.practise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	Date d = new Date();

	public void display() {
		System.out.println(d.toString());
		System.out.println(d.getTime());
		System.out.println(d.getMonth());
		System.out.println(d.getYear());
		System.out.println(d.getDay());
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss");
		System.out.println(sdf.format(d));
	}

}
