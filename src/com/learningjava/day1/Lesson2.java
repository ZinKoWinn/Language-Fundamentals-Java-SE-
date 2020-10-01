package com.learningjava.day1;

public class Lesson2 {
	//How  to create Object

	public static void main(String[] args) {
		Student st1=new Student();
		st1.name="Zin Ko Win";
		st1.age=18;
		st1.greet();
		
		Student st2=new Student();
		st2.name="Khin Suu Suu Nwe";
		st2.age=21;
		st2.greet();
		

	}

}
class Student{
	String name;
	int age;
	void greet() {
		System.out.println("My name is :" + name);
		System.out.println("My age is :" + age);
	}
}
