package com.learningjava.day1;

public class Lesson6 {
    //Method types
	public static void main(String[] args) {
		staticMethod();
		
		Lesson6 obj=new Lesson6();
		obj.instanceMethod();
		
		//Using from other class of method
		Other.otherClassMethod("Using other class of method");
	}
	
	//Instance Method 
	void instanceMethod() {
		System.out.println("I am Instance method.");
	}
	
	//Static Method
	static void staticMethod() {
		System.out.println("I am Static method");
	}

}

class Other{
	static void otherClassMethod(String other) {
		System.out.println(other);
	}
}
