package oop1;

public class CDAaccount extends BankAccount implements IRate{
	
	String interestRate;
	
	void compount() {
		System.out.println("Compounding interest");
	}
}
