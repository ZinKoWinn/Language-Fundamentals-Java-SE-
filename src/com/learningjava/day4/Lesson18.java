package com.learningjava.day4;

public class Lesson18 {
	//Looping Statement
     //Do While Loop
	//while Loop
	
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9};
		doWhileLoop(array);
		whileLoop(array);
	}
	
	//Do While Loop
	public static void doWhileLoop(int [] array) {
		int i = 0;
		
		System.out.println("That is do while loop.");
		
		do {
			
			System.out.printf("%d -> %d%n",i,array [i++]);
			
		} while (i < array.length);
	}
	
	//While Loop
	public static void whileLoop(int [] array) {
		
		int i = 0;
		
		System.out.println("That is while loop.");
		
		while (i < array.length) {
			System.out.printf("%d -> %d%n",i,array [i++]);
			
		}
	}
}
