package cn.itcast.day06;

public class DemoOfPerson {

	public static void main(String[] args) {
		Person p1= new Person("Cherry",18);
		Person p2= new Person();
		
		p2.setName("Nancy");
		p2.setAge(16);
		
		p1.SayHi(p2.getName());
		p2.SayHi(p1.getName());
		
		System.out.println(p1.isMale());
		System.out.println(p2.isMale());
		
		System.out.println("-----------------------");
		
		Person p3= new Person("Jacky",18, true);
		Person p4= new Person();
		
		p4.setName("Sue");
		p4.setAge(16);
		System.out.println(p3.isMale());
		System.out.println(p4.isMale());
		
		p3.SayHi(p4.getName());
		p4.SayHi(p3.getName());
		
		System.out.println(p3.toString());  //cn.itcast.day06.Person@71be98f5

	}

}
