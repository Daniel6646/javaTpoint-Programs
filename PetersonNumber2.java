package javatpointPrograms;

import java.util.Scanner;

public class PetersonNumber2{
	
	static int[] factorial =  new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600}; 
	
	static boolean isPeterson(int n) {
		// TODO Auto-generated method stub
		int num = n;
		int sum = 0;
		
		while(n>0) {
			
			int digit =n % 10;
			 sum +=factorial[digit];
			
			n = n / 10;
			}
		return(sum==num);
}
	
		public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Petersons Number");
		int n =scan.nextInt();
		
		if(isPeterson(n)) 	
			System.out.println("The given number is  petersons number");
		else 
			System.out.println("The given number is not a petersons number");
	}
	
	
}

