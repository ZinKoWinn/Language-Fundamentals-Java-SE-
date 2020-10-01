package com.learningjava.day3;

public class Lesson13 {
	
	//Statement Test
	
	void showMessage() {
		System.out.println("Hello Statements");
	}

	public static void main(String[] args) {
	
		//declaration Statements
		int i;
		String str;
		Lesson13 test;
		int [] array;
		
		//Assignment Statement
		
		i = 10;
		str = "Hello Java";
		
		//Object Creation Statement
		test = new Lesson13();
		array = new int[3];
		
		//Increment Decrement Statement
		i++;
		System.out.println(i);
		
		i--;
		System.out.println(i);
		
		++i;
		System.out.println(i);
		
		--i;
		System.out.println(i);
		
		//Method invocation statement
		test.showMessage();

	}

}
