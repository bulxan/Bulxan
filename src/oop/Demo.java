package oop;
	
	class Person{
		
		//Attributes, adjectives, descriptors, variables
		String name;
		String phone;
		String email;
		
		
		void walk() {
			System.out.println(name + " Is walking...");
		}
		
		void eat() {
			System.out.println(name +" Is eating");
		}
		
		void sleep() {
			System.out.println(name +" Is sleeping...");
		}
		
	}
public class Demo {

		static void nacnac() {
			
		}
	public static void main(String[]args) {
		
		//Instantiating an Object
		Person person1 = new Person();
		person1.name = "Amaal";
		
		//Abstraction
		person1.sleep();
		
		Person person2 = new Person();
		person2.name ="Siciid";
		person2.walk();
		
		person2.eat();
	}
}
