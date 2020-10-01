package com.learningjava.day4;

public class Lesson26 {
	// Generic
	public static void main(String[] args) {
		Array<String> strarray = new UnlimitedArray<>();
		strarray.add("Hello Java");
		strarray.add("Generic");

		System.out.println(strarray.get(0));
		System.out.println(strarray.get(1));

		Array<Integer> intarray = new UnlimitedArray<>();
		intarray.add(100);
		intarray.add(200);

		System.out.println(intarray.get(0));
		System.out.println(intarray.get(1));
	}
}

interface Array<T> {
	void add(T t);

	T get(int index);
}

class UnlimitedArray<T> implements Array<T> {

	Object[] array = {};

	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		Object[] temp = new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[temp.length - 1] = t;
		array = temp;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return (T) array[index];
	}

}