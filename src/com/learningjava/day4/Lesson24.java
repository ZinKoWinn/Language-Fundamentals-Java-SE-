package com.learningjava.day4;

public class Lesson24 {
	// Singleton Pattern
	public static void main(String[] args) {
		ContainerAdder adder = new ContainerAdder();
		adder.add("Hello Java");
		adder.add("Singleton");

		Container container = Container.getInstance();
		for (String str : container.getArray()) {
			System.out.println(str);

		}

	}
}

class Container {
	private String[] array;
	public static Container instance;

	public static Container getInstance() {

		if (null == instance) {
			instance = new Container();
		}
		return instance;
	}

	public Container() {
		this.array = new String[0];

	}

	public void add(String str) {
		String[] temp = new String[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[temp.length - 1] = str;
		array = temp;

	}

	public String[] getArray() {
		return array;
	}
}

class ContainerAdder {
	private Container container;

	public ContainerAdder() {
		container = Container.getInstance();
	}

	public void add(String str) {
		container.add(str);
		System.out.println("Adding a string " + str);
	}
}