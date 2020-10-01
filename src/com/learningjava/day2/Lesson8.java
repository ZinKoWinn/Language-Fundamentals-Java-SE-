package com.learningjava.day2;

public class Lesson8 {

	public static void main(String[] args) {
		Car car = new Car("Caldina","2020","250,0000");
		car.showInfo();
		
		Car car2= new Car("Honda Fit","2019","300,0000");
		car2.showInfo();

	}

}

class Car{
	String type;
	String model;
	String price;
	
	public Car(String type, String model, String price) {
		super();
		this.type = type;
		this.model = model;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println("Type  :" + type);
		System.out.println("Model :" + model);
		System.out.println("Price :" + price);
	}
}