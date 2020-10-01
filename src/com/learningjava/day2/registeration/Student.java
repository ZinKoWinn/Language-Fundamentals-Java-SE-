package com.learningjava.day2.registeration;

import com.learningjava.day2.teaching.*;

public class Student {

	public String name;
	public Course course;
	public static int count;
	
	public Student(String name) {
		super();
		count++;
		this.name = name;
	}

	public void takeCourse(Course c) {
		course=c;
	}
	
	public void studentInfo() {
		System.out.println("My name is " + name);
		System.out.println("I am taking from " + course.name + " course."); 
		
	}
	
	public static void showAllStudents() {
		System.out.println("All Students : " + count);
	}

}
