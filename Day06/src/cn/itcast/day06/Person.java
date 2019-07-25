package cn.itcast.day06;

public class Person {

	private String name;
	private int age;
	private boolean male;

	public Person() {

	}

	public Person(String s, int i) {
		System.out.println("To initiate this class.");
		name = s;
		age = i;
	}

	/*
	 * public Person(String s, int i, boolean g) {
	 * System.out.println("To initiate this class."); name = s; age = i; male = g; }
	 */

	// It would be better to set it in this standard way.
	public Person(String name, int age, boolean male) {
		System.out.println("To initiate this class.");
		this.name = name;
		this.age = age;
		this.male = male;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void SayHi(String s) {
		System.out.println("Hi " + s);
	}

}
