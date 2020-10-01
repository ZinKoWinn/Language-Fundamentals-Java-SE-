package com.learningjava.day3;

public class Lesson12 {
	
	String name;
	
	public Lesson12(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// Reference Data type
		Lesson12 p1 = new Lesson12("Zin Ko Winn");
		p1.greet();
		
		Lesson12 p2 = p1;
		p2.name="Khin Suu Suu Nwe";
		p2.greet();
		
		

	}
	
	void greet() {
		System.out.println("My name is " + name);
	}

}
