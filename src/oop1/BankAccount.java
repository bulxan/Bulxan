package oop1;

public class BankAccount implements IRate {
	
	//Defining properties or variables
	String accountNumber;
	
	//static >> belongs to the class not the object instance
	// final >> constant(often static final)
	static final String routineNumber = "#7769";
	private String name;
	String ssn;
	double balance;
	String accountType;
	
	//Constructors definition: unique methods
		//1.they are used to define/ setup / initialize properties of an object
		//2.constructors are implicitly called upon instantiate
		//3.the same name as class itself
		//4.constructors have no return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: "+accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		
		System.out.println("NEW ACCOUNT: "+accountType+" Initial deposit of: $"+initDeposit);
		
		////initDeposit, accountType, and Msg variables are all local variables >> so local variables are defined within blocks 
		String Msg;
		if(initDeposit < 1000) {
			 Msg = "ERR: Minimum Deposit must be at least $1,000";
		}else {
			Msg = "Thank u for initial deposit of $"+initDeposit;
		}
		
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	//Overloading: call same method name with different arguments
	
	//Defining actions, methods or functions
	void deposit(double amount) {
		balance = balance +amount;
		System.out.println("YOU DEPOSIT "+amount);
		showActivity("Deposit",amount);
	}
	
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	void withDraw(double amount) {
		balance = balance - amount;
		System.out.println("YOU WITHDRAWED "+amount);
		showActivity("WITHDRAW",amount);
	}
	
	private void showActivity(String activity, double amount) {
		System.out.println("Your recent transaction is "+activity+" with amount of $"+amount);
		System.out.println("Your balance is "+balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: $"+balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ Name: "+name+". AccNo: "+accountNumber+"Routine number: "+routineNumber+" Balance: $"+balance;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAccountNumber(String n) {
		accountNumber = n;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
