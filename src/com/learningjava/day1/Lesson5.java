package com.learningjava.day1;

public class Lesson5 {
	//Method Test

	public static void main(String[] args) {
	// With Argument
	add(2,3);
	
	devided(24,4);
	//============
	
	//Without Argument
	sayHello();

	}
	
	//Return type
	static void add(int a, int b) {
		int c=a + b;
		
		System.out.println(c);
		
	}
	
	//Non Return
	static void devided(int x,int y) {
		System.out.println(x/y);
	}
	
	static void sayHello() {
		System.out.println("Hello JDC!");
	}

}
