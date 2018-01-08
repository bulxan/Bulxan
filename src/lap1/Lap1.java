package lap1;

public class Lap1 {
	//Write a function that takes a number and returns the sum of 1 to that number.
	static int sum(int number) {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			System.out.print(i + " + " +sum);
			sum  = sum + i;
			System.out.println("= "+sum);
		}
		return sum;
	}
	
	//Write a function that computes factorial *hint: use recursion, n = n*(n-1)
	
		static int fac(int n) {
			if(n == 0) {
				return 1;
			}
			System.out.println(n);
			
			return fac(n-1)*n;
		}
		
		//Write three functions that return the min, avg and max of an array
		
		//Function one the min value of an array
		static int min(int[] myArr) {
			int minValue = myArr[0];
			for(int i = 0; i < myArr.length; i++) {
				if(minValue > myArr[i]) {
					minValue += myArr[i];
				}
			}
			
			return minValue;
		}
		
		
		//Function one the max  of an array
				static String max(String[] myArr) {
					String maxValue = myArr[0];
					String minValue = myArr[0];
					for(int i = 1; i < myArr.length; i++) {
						if(maxValue.length() < myArr[i].length()) {
							maxValue = myArr[i];
						}
						if(minValue.length() > myArr[i].length()) {
							minValue = myArr[i];
						}
					}
					System.out.println("The longest name of names array is "+maxValue+" because it contains  "+maxValue.length()+" characters and shortest name is "+minValue+" because it contains "+minValue.length()+" characters");
					return maxValue;	
				}
				
				//Function one the avg  of an array
				static double avg(int[] myArr) {
					double total = 0;
					for(int i = 0; i < myArr.length; i++) {
						total = total + myArr[i];
					}
					
					
					return total / myArr.length;
				}
				
				
				

	public static void main(String[]args) {
		
		sum(5);
		
		System.out.println(fac(5));
		
		int[] myArr = {1,2,3,4,5,6};
		
		String[] names = {"siciid","cumar","sharmaake","cabdinaasir","cabdiraxmaan"};
		
		max(names);
		
		System.out.println(avg(myArr));
	}
}
