package cn.itcast.day06;
/*
 *  Please remember that  Alt + Shift + R is an useful shortcut key to change value.
 */

public class DemoOfStudents {
    public static void main(String[] args) {
		Students s1= new Students();
		s1.age= 24;
		s1.name= "Jacky";
		System.out.println(s1.name);
		//Jacky
		s1.eat();
		
		//To check its default value.
		Students s2= new Students();
		System.out.println(s2.age);
		System.out.println(s2.name);
		//0
		//null
		
		String name= s1.name;
		System.out.println(name);
		//Jacky
		
		Students s3= s2;
		System.out.println(s3.age);
		System.out.println(s3.name);
		s3.age =29;
		System.out.println(s2.age);
	}
}
