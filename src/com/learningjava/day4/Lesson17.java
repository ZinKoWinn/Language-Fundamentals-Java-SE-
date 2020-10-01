package com.learningjava.day4;

public class Lesson17 {
	
	//Looping Statement
	//For loop
	
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d -> %d%n",i,array [i]);
		}
		
		System.out.println(getAverate(array));
	}
	
	public static int getAverate(int [] array) {
		int sum = 0;
		for (int i : array) {
			
			sum +=i;
		}
		return sum / array.length;
	}

}
