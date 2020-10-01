package com.learningjava.day2;

import static com.learningjava.day2.registeration.Student.*;

import com.learningjava.day2.registeration.*;
import com.learningjava.day2.teaching.*;
public class Lesson9 {

	public static void main(String[] args) {
		Course course = new Course("Java Developer Class Online : Java SE");
		course.showCourse();
		
		Lesson lesson = new Lesson("Package Stament",course);
		lesson.showInfo();
		
		Student student = new Student("Zin Ko Winn");
		student.takeCourse(course);
		student.studentInfo();
		
		Student student1 = new Student("Khin Suu Suu Nwe");
		student1.takeCourse(course);
		student1.studentInfo();
		
		showAllStudents();
	

	}

}
