package com.learningjava.day4;

public class Lesson16 {

	// Decision Statement
	// Switch Statement

	public static void main(String[] args) {

		checkDay(3);

	}

	static void checkDay(int day) {
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");

			break;
		case 4:
			System.out.println("Wednesday");

			break;
		case 5:
			System.out.println("Thursday");

			break;
		case 6:
			System.out.println("Friday");

			break;
		case 7:
			System.out.println("Saturday");

			break;
		default:
			break;
		}

	}

}
