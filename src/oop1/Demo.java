package oop1;

class Person {
	//Attributes, variables, adjectives, descriptors
	String name;
	String email;
	String phone;
	
	
	//action, activity, behavior
	void walk() {
		System.out.println(name+" Is walking");
	}
	
	void eat() {
		System.out.println(name+" Is eating");
	}
	
	void sleep() {
		System.out.println(name+" Is sleaping");
	}
	
}
public class Demo {
	
	public static void main(String [] args) {
		
		//Instantiating an object
		Person person1 = new Person();
		
		person1.name = "Siciid Boos";
		person1.email = "boos@boos.com";
		person1.phone = "7417769";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person Boy1 = new Boys();
		Boy1.name = "Hanad";
		Boy1.walk();
	}

}
