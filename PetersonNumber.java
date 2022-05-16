package javatpointPrograms;

import java.util.Scanner;

public class PetersonNumber {
//an array is defined for the quickly find the factorial  eg 4:4x3x2x1 = 24
	static int[] factorial = new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600 };
// factorial of 0-1,1-1,2-2,3-6 and so on it goes so factorial[digit] means it gets the factorial from array above


	static boolean isPeterson(int n) {
		int num = n;
		int sum = 0;

		while (n > 0) {

			int digit = n % 10;

			sum += factorial[digit];

			n = n / 10;
		}

		return (sum == num); //petersons no and krishnamurthy numbers are the same actually sum of factorial equal it the orignal num 145
	 }
//num+1 to check for no, and when count++ means it is prime,2 is prime so count++ so on 
 
	public static void main(String args[]) {

		/*
		 * A number is said to be Peterson if the sum of factorials of each digit is
		 * equal to the sum of the number itself. 145 = 5! + 4!
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");

		int n = sc.nextInt();//145

		if (isPeterson(n))
			System.out.println("The given number is a Peterson number.");
		else
			System.out.println("The given number is not a Peterson number.");
	}



  }