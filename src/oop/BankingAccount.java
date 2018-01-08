package oop;

import java.util.Scanner;

public class BankingAccount {
	//Define variables
	String accountNumber;
	//static >> belongs to the class not the object instance
	//final >> constant (often static final)
	static final String routingRouter = "7979";
	
	//Instance variables
	
	String name;
	String ssn;
	String AccountType;
	double balance;
	
	BankingAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	BankingAccount(String accountType){
		System.out.println("NEW ACCOUNT: "+accountType);
	}
	
	BankingAccount(String accountType, double initDeposit, String name){
		
		String Msg = "";
		//initDeposit, accountType, and Msg variables are all local variables
		if(initDeposit < 1000) {
			System.out.println("NEW ACCOUNT CREATED: "+accountType+" AND ITS DEPOSIT IS: $0");
		}else if (initDeposit > 100000){
			System.out.println("NEW ACCOUNT CREATED: "+accountType+" AND ITS DEPOSIT IS: $0");
		}else {
			System.out.println("NEW ACCOUNT CREATED: "+accountType+" AND ITS DEPOSIT IS: $"+initDeposit);
		}
		
		
		if(initDeposit < 1000) {
			Msg = "ERR: minimum deposit must be at least $1,000";
			System.out.println(Msg);
			System.out.println("Sorry for now! Your general balance is: $"+balance+" because you are tried to deposit $"+initDeposit+" and thats illegal for saving account");
		}else if (initDeposit > 100000){
			Msg = "ERR: Maximum deposit must be $100,000";
			System.out.println(Msg);
			System.out.println("Sorry for now! Your general balance is: $"+balance+" because you are tried to deposit $"+initDeposit+" and thats illegal for saving account");
		}else {
			balance = balance + initDeposit;
			Msg = "Thanks for your initial deposit of: $"+initDeposit;
			System.out.println(Msg);
			System.out.println("Congrats! Now Your general balance is: $"+balance);
		}
		
		
		
		
		
	}
	
	//Define methods
	void deposit() {
		
	}
	
	@Override
	public String toString() {
		return "[Name: "+name+". Accoun No: "+accountNumber+". Balance: "+balance+"]";
	}
	
	void checkBalance() {
		System.out.println("Please enter your pin number to access your profile and balance");
		double  pass;
		Scanner in = new Scanner(System.in);
		for(int iskuday = 3; iskuday >= 0; iskuday--) {
		pass = in.nextInt();
		if(pass == 1234) {
		System.out.println(toString());
		break;
		}if(iskuday == 0) {
			System.out.println("Multible tried to login your account was blocked");
		}else {
			System.out.println("Sorry your pin is invalid please try again you have "+iskuday+" Chance to login");
		}
		}
		
	}
	
	public static void main(String[]args) {
		BankingAcountApp b1 = new BankingAcountApp("Boos");
		b1.walk();
		b1.gender = "You are male";
		
		System.out.println(b1.gender);
	
	}

}
