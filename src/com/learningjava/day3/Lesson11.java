package com.learningjava.day3;

public class Lesson11 {


	public static void main(String[] args) {
		// Primitive Data type
		
		byte b = 10; //8 bit
		short s = 20;//16 bit
		int i = 30;  //32 bit
		long l = 40; //64 bit
		
		b =(byte)l;
		
		takeValue((byte)10);  //Byte data type casting because byte cannot auto casting.
		takeValue((short)10); //Short data type casting because short cannot auto casting.
		takeValue(10);        //Default value of integer is INT 
	    takeValue(10L);       //Data type is auto casting in long. Long can auto casting.
	    
	    takeValue(10.0);      //Default value of floating point is double
	    takeValue(10.0F);     //Data type is auto casting in float. Float can auto casting.
		
	}
	
	static void takeValue(byte b) {
		System.out.println("Byte is working.");
	}
	
	
	static void takeValue(short s) {
		System.out.println("Short is working.");

	}

	static void takeValue(int i) {
		System.out.println("Int is working.");

	}

	static void takeValue(long l) {
		System.out.println("Long is working.");

	}

	static void takeValue(float f) {
		System.out.println("float is working.");

	}

	static void takeValue(double d) {
		System.out.println("Double is working.");

	}
	
}	