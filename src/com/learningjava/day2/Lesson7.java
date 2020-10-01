package com.learningjava.day2;

public class Lesson7 {

	public static void main(String[] args) {
		Paper paper=new Paper();
		NoteBook noteBook=new NoteBook();
		method1(1);


		takeNote("Hell0 Java",paper);
		
		System.out.println(paper.message);
		
		takeNote("Hello JDC",noteBook);
		System.out.println(noteBook.message);

	}
	
	static void method1() {
		
	}
	
	static void method1(int i) {
		i++;
		System.out.println(i);
	}
	
	static void takeNote(String message,Paper paper) {
		
		paper.message=message;
		
	}
	
	static void takeNote(String message ,NoteBook noteBook) {
		noteBook.message=message;
	}

}

class Paper{
	String message;
}

class NoteBook{
	String message;
}