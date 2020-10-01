package com.learningjava.day4;

public class Lesson14 {
	//Decision Statement
    //If and If else
	public static void main(String[] args) {
		
		checkInt(11);

	}
	
	static void checkInt(int value) {
		if(value > 0) {
			System.out.printf("%d is greater than 0.",value);
		}
		
		System.out.println();
		
		if(0 == value % 2) {
			System.out.printf("%d is a even number.", value);
		}
		else {
			System.out.printf("%d is not even number", value);
		}
		
	}
	

}
