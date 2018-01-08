package lap1;

import java.util.Scanner;

public class BankAccountApp {
	
	public static void main(String[]args) {
		
		BankAccount acc1 = new BankAccount("584518899");
		acc1.setName("Said Ibrahim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(15000);
		acc1.accrue();
		acc1.viewYourProfile();
		System.out.println("===========================");
		
	}

}

class BankAccount implements IInterest{
	//Properties of Bank Account
	private static int id = 1000; //Internal ID
	private String accountNumber;  // ID +random 2 digit number + first 2 of SSN 
	private static final String routineNumber = "004479841";
	private String name;
	private String SSN;
	double balance ;
	
	
	
	BankAccount(String SSN ){
	
		this.SSN = SSN;
		id++;
		seAccountNumber();
		
		
	}
	
	void seAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = id + SSN.substring(0, 2)+ "" + random;
		System.out.println("Your account number is: " +accountNumber);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void payBill(double amount) {
		balance = balance - amount;
		showBalance();
	}
	
	void makeDeposit(double amount) {
		System.out.println("Current Balance: "+balance);
		balance = balance + amount;
		System.out.println("Deposit: "+amount);
		showBalance();
	}
	
	void showBalance() {
		System.out.println("Balance: "+balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1+ rate / 100);
		showBalance();
	}
	
	public void viewYourProfile() {
		int pin;
		Scanner in = new Scanner(System.in);
		pin = in.nextInt();
		if(pin == 1234) {
			System.out.println(toString());
		}
	}
	
	@Override
	public String toString() {
		return "[ Name: "+name+"\nAccount number: "+accountNumber+"\nRoutine number "+routineNumber+"\nBalance: "+balance+" ]";
	}
	
}
