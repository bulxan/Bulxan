package basics;

public class NumbersCalculations {
	
	static void printMyName() {
		System.out.println("My name is Bulxan Boos");
	}
	
	static int addTwoNumbers(int a, int b) {
		// This function will add two numbers
		int result = a + b;
		
		System.out.println("The sum of two numbers  "+a+" and "+b+" is "+result);
		
		return result;
		
	}
	static int multiPlyNumbers(int value1, int value2) {
		int product = value1 * value2;
		return product;
	}
	
	public static void main(String[]args) {
		
		printMyName();
		int a, b; a = 10; b = 20;
		
		addTwoNumbers(a,b);
		int product = multiPlyNumbers(a, b);
		System.out.println("The product of numbers "+a+" and "+b+" is "+product);
		addTwoNumbers(product, product);
		
		
	}

}
