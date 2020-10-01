package com.learningjava.day4;

public class Lesson23 {
	// Enumeration
	public static void main(String[] args) {

		Course courses[] = Course.values();
		for (Course course : courses) {
			System.out.println(course);
			System.out.println(course.getFees());
			System.out.printf("%s : %d MMK %n", course.toString(), course.getFees());
			FeesShowable showable = course;
			showable.showFeesWithFormat();
		}

		Course c = Course.valueOf("JavaSE");
		System.out.println(c);
	}
}

enum Course implements FeesShowable {
	JavaSE("Java Standard Edition", 150000) {
		@Override
		public void showFees() {
			System.out.println(getFees());

		}
	},
	JavaEE("Java Enterprise Edition", 300000) {
		@Override
		public void showFees() {
			System.out.println(getFees());

		}
	},
	Spring("Spring Framework", 300000) {
		@Override
		public void showFees() {
			System.out.println(getFees());

		}
	};

	private String name;
	private int fees;

	Course(String name, int fees) {
		this.name = name;
		this.fees = fees;
	}

	public abstract void showFees();

	public int getFees() {
		return fees;
	}

	@Override
	public String toString() {

		return this.name;
	}

	@Override
	public void showFeesWithFormat() {
		System.out.format("%s fees is %d MMK. %n", name, fees);

	}

}

interface FeesShowable {
	void showFeesWithFormat();
}