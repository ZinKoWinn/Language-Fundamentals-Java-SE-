package com.learningjava.day4;

public class Lesson19 {

	// Branching Statement

	public static void main(String[] args) {
		// Return
		String array[] = { "Hello", "Java", "Programming" };
		String array1[] = {}; // Blank array to test with return
		showWithReturn(array);

		// Break
		int data[] = { 1, 2, 3, 4, 5, 6 };
		int data1[] = {}; //Blank array to test with break
		showWithBreak(data);
	}

	// Return
	static void showWithReturn(String[] array) {

		if (null == array || array.length == 0) {
			System.out.println("There is no data to show .");
			return;
		}

		for (String string : array) {
			System.out.println(string);
		}
	}

	// Break
	static void showWithBreak(int[] data) {
		if (null == data || data.length == 0) {
			System.out.println("There is no data to show .");
			return;
		}

		for (int i : data) {
			System.out.println(i);

			
			  if (i % 3 == 0) { 
				  break; 
				//continue;
				  //If continue, show data until array length is end.
				  }
			  
			  System.out.println("After " + i);
			 
		}
	}
}
