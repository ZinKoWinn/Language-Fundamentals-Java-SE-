package com.learningjava.day4;

public class Lesson22 {
	
	//Constant with enumerations
	
	enum Days {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};
	
	public static void main(String[] args) {
	showDay(Days.MONDAY);
	}
	static void showDay(Days day) {
		System.out.println(day);
		
		
	}

}
