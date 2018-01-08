package basics;

public class Assignment {

	public static int fatorial(int n) {
		
		
		return n <= 1 ? n : n * fatorial(n -1);
	}
	
	public static void main(String[] args) {
		// 1! = 1 * 1
		// 2! = 2 * 1
		// 3! = 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1
		// 5! = 5 * 4 * 3 * 2 * 1
		
			System.out.println(fatorial(5));
		
	}
}

// class Fibbonacci {
//
//	public static int fib(int n) {
//		return n < 2 ? n : fib(n - 1) + fib(n - 2);
//	}
//
//	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(fib(i));
//		}
//	}
//}