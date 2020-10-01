package com.learningjava.day1;

public class Lesson4 {
	//Local Variable
	String message="Global Variable";

	public static void main(String[] args) {
		Lesson4 obj=new Lesson4();
		obj.something();
		
		doSomething();

	}
	public void showMessage(String message) {
		System.out.println(message);
	}
	public static void doSomething() {
		String message = "Local Variable";
		System.out.println(message);
	}
	public void something() {
		String message = "Local Variable";
		System.out.println(this.message);
	}

}
