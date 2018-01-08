package basics;

public class Strings {
	
	public static void main(String[]args) {
		String myName= "SICIID CISMAAN BOOS";
		String anOther= "SICII";
		if(myName.contains(anOther)) {
			System.out.println("Are you SICIID CISMAAN BOOS");
		
			
		}
	String sorry = "Sorry";
	String congrats = "Congrats You Win!";
	String browser = "Chrome";
	if(!(browser.equalsIgnoreCase("chrome"))) {
		System.out.println(sorry);
	}else {
		System.out.println(congrats);
		}
	
	
		String firstName = "Bulxan";
		String lastName = "Boos";
		String security = "907417769";
		
		System.out.println("There ara "+security.length()+" digits in your security section");
		//Print the initials and the last 4 digit of security
		System.out.print(firstName.substring(0,2)); 
		System.out.println(lastName.substring(0, 1));
		System.out.println(security.substring(5));
		
	}
}
