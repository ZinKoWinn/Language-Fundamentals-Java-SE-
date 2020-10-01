package com.learningjava.day4;

public class Lesson20 {
	//Nested Loop
	
	static final int [] outer;
	static final int [] inner ; 
	
	static {
		outer = new int[] {1,2,3,4,5,6};
		inner = new int[] {1,2,3,4,5,6,7,8,9,10};
	}
	public static void main(String[] args) {
		outer:
		for (int i = 0; i < outer.length; i++) {
			System.out.println("Outer :" + outer[i]);
			
			for (int j = 0; j < inner.length; j++) {
				System.out.println("Inner :" + inner[j]);
				
				if(i == 1 && j==3) {
					System.out.println("Continue");
					continue outer;
				}
				
				if (i == 2 && j == 2) {
					System.out.println("Break");
					break outer;
					
				}
			}
			
			System.out.println("Outer After Inner : " + outer[i]);
		}
		
	}

}
