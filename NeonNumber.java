package javatpointPrograms;

import java.util.Scanner;

public class NeonNumber {
	
	public static void main(String args[]) {
		
		/*
		 * A neon number is a number where the sum of digits of square of the number is
		 * equal to the number quare is 9*9 = 81 and sum of the digits of the square is
		 * 9.
		 */
		
		
		int sum =0,n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");

		n = scan.nextInt();
		
		int square = n*n;
		
		while(square!=0) {		
			
			int digit = square%10;
			 sum = sum + digit;
			 square = square/10;
			
		}
		
		if(n == sum)
			System.out.println(n +" is a neon number");
	  
		else
			System.out.println(n+" is not a neon number");
		
	}
}
