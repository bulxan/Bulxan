package oop1;

public class AccountApp {

	
	public static void main(String[]args) {
		
		IRate account1 = new LoanAccount();
		account1.setRate();
		account1.increaseRate();
		
		
		for(int x = 0; x < 6; x++) {
			int b = x;
			System.out.println(x);
		}
		
		int f = 0;
		while(f < 6) {
			f++;
			System.out.println(f);
		}
		
		
		
	}
}
