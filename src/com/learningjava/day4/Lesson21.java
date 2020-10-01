package com.learningjava.day4;

public class Lesson21 {
	
	//Constant with static final
	
	static final int SUN;
	static final int MON;
	static final int TUE;
	static final int WED;
	static final int THU;
	static final int FRI;
	static final int SAT;
	static {
		SUN = 0;
		MON = 1;
		TUE = 2;
		WED = 3;
		THU = 4;
		FRI = 5;
		SAT = 6;
	}
	public static void main(String[] args) {
		
		showDays(MON);
		showDays(TUE);
		
	}
	
	static void showDays(int day) {
		switch (day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;	
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;	
		case 5:
			System.out.println("Friday");
			break;	
		case 6:
			System.out.println("Saturday");
			break;	
		}
		
	}

}
