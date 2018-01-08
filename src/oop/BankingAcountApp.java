package oop;

public class BankingAcountApp extends CDAccount {
	String name;
	
	
	BankingAcountApp(String name){
		this.name  = name;
	}
	
	
	void walk() {
		System.out.println(name+"Is walking");
	}
	
	public static void main(String[]args) {
		//Creating a new bankAccount >> think instantiate an object
		BankingAccount acc1 = new BankingAccount();
		acc1.accountNumber = "0185478";
		
		BankingAccount acc2 = new BankingAccount("Checking Account");
		acc2.accountNumber = "0185478";
		
		BankingAccount acc3 = new BankingAccount("Saving Account: ", 100000.00,"Bulxan Boos");
		acc3.name = "Siciid Cismaan Boos";
		acc3.accountNumber = "00447984160951";
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 300;
	}

}
