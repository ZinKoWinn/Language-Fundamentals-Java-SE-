package com.learningjava.day4;

public class Lesson15 {
    //Decision statement
	//Else if
	public static void main(String[] args) {
		checkMark(80);

	}
    
	static void checkMark(int mark) {
		if(mark < 40) {
			System.out.println("Fails");
		}
		
		else if(mark >= 40 && mark < 80) {
			System.out.println("Pass");
		}
		
		else {
			System.out.println("Excellent");
		}
	}
 
}
