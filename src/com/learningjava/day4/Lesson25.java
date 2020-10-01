package com.learningjava.day4;

public class Lesson25{
	public static void main(String[] args) {
		ContainerAdder1 adder = new ContainerAdder1();
		adder.add("Hello java");
		adder.add("Singleton Pattern");
		
		Singleton container = Singleton.Container;
		for (String str : container.getArray()) {
			System.out.println(str);
		}
		
	}
	
}
enum Singleton{
	Container;
	
	private String [] array;
	
	private Singleton() {
		this.array = new String [0];
	}
	
	public void add(String str) {
		String [] temp = new String [array.length +1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
			
		}
		temp[temp.length -1] =str;
		array = temp;
	}
	
	public String[] getArray(){
		return array;
	}
}

class ContainerAdder1{
	private Singleton container;
	
	public void add(String str) {
		container = Singleton.Container;
		System.out.println("Adding a string " + str);
		container.add(str);
	}
}
