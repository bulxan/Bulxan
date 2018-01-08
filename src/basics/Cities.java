package basics;

public class Cities {
	
	public static void main(String[]args) {
		//Declaring and defining an array
		String[] magaloyinkayga = {"CEERIGAABO","LAASCAANOOD","BUUHOODLE","GAROOWE","HARGAYSA"};
		
		System.out.println("My city "+magaloyinkayga[0]);
		System.out.println("My city "+magaloyinkayga[1]);
		System.out.println("My city "+magaloyinkayga[2]);
		System.out.println("My city "+magaloyinkayga[3]);
		System.out.println("My city "+magaloyinkayga[4]);
		
		//Defining and declaring an array by size
		String[] states = new String[5];
		states[0]= "SANAAG";
		states[1]= "SOOL";
		states[2]= "CAYN";
		states[3]= "NUGAAL";
		states[4]= "MAROODIJEEX";
		
		System.out.println("My Region "+states[0]);
		System.out.println("My Region "+states[1]);
		System.out.println("My Region "+states[2]);
		System.out.println("My Region "+states[3]);
		System.out.println("My Region "+states[4]);
		
		//Declare an array
		String[] countries;
		
		//Defining an array
		countries = new String[5];
		countries[0]= "SOOMAALIYA";
		countries[1]= "TURKEY";
		countries[2]= "INDIA";
		countries[3]= "UK";
		countries[4]= "CIRAAQ";
		
		System.out.println("My Country is "+countries[0]);
	}

}
