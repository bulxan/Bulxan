package oop1;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating new bank Account >> think instantiate an object
		
		
		//Polymorphism through Overloading
		BankAccount acc1 = new BankAccount();
		acc1.setRate();
		acc1.increaseRate();
		acc1.setSsn("268868");
		System.out.println("SSN: "+acc1.getSsn());
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.setAccountNumber("7290");
		System.out.println(acc2.getAccountNumber());
		
		BankAccount acc3 = new BankAccount("Checking Account", 1000);
		acc3.setName("Amaal cadeey");
		System.out.println(acc3.getName());
		acc1.checkBalance();
		acc1.setName("Bulxan");
		acc1.accountNumber = "7417758";
		acc1.balance = 1000;
		System.out.println(acc1.toString());
		
		//Demo for inheritance
		
		CDAaccount cd1 = new CDAaccount();
		cd1.setName("Boos");
		cd1.accountNumber = "5930";
		cd1.balance = 0;
		
		cd1.deposit(15000);
		
		//Polymorphism through Overriding
		System.out.println(cd1.toString());
	}

}
