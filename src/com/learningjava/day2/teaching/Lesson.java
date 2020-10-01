package com.learningjava.day2.teaching;

public class Lesson {

	public  String name;
	public Course course;
	
	public Lesson(String name, Course course) {
		super();
		this.name = name;
		this.course = course;
	}
	
	public void showInfo() {
		System.out.println("This is " + name  + " lesson from " + course.name + " course.");
	}

}
