package com.learningjava.day1;

public class Lessson3 {
	//Variable Types
    //Global Variable(Instance and Static)
	public static void main(String[] args) {
	Counter c1=new Counter();
	c1.countUp();
	
	Counter c2=new Counter();
	c2.countUp();
	
	System.out.println(c1.count);
	System.out.println(c2.count);


	}

}

class Counter{
	static int count;
    void countUp() {
		count++;
	}
}