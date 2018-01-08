package basics;

public class Loops {
	
	public static void main(String[]args) {
		//Declaring and defining an array
		String[] magaloyinkayga = {"CEERIGAABO","LAASCAANOOD","BUUHOODLE","GAROOWE","HARGAYSA"};
		
		System.out.println("My city "+magaloyinkayga[0]);
		System.out.println("My city "+magaloyinkayga[1]);
		System.out.println("My city "+magaloyinkayga[2]);
		System.out.println("My city "+magaloyinkayga[3]);
		System.out.println("My city "+magaloyinkayga[4]);
	
		
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
		
		//Defining and declaring an array by size
				String[] states = new String[5];
				states[0]= "SANAAG";
				states[1]= "SOOL";
				states[2]= "CAYN";
				states[3]= "NUGAAL";
				states[4]= "MAROODIJEEX";
				
				int i = 0;
				//Do Loop: enters the loop then tests condition
				do {
					System.out.println("STATES: "+states[i]);
					i++;
				}while(i < 5);
				
				System.out.println("************************");
		     //While Loop: test condition first and then enters loop
				
				int x = 0;
				boolean stateFound = false;
				while(!stateFound) {
					String state = states[x];
					if(state == "SANAAG") {
						System.out.println("State found");
						System.out.println(states[x]);
						stateFound = true;
					}
					x++;
				}
				
				System.out.println("************************");
			//For loop: best structure for iterating through an array
				for(int b = 4; b >=0; b--) {
					System.out.println("STATES "+states[b]);
				}
	}

}
