package javatpointPrograms;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String args[]) {
	int sum = 0,product =1,number, digit ;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");//1124 is a spy number, the sum of its digits is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.
	number = scan.nextInt();
	
	while(number > 0) {
		
		digit = number%10;
	
		sum = sum + digit;
	
	product = product * digit;
	
	number = number /10;
	}
	if (sum == product)
		System.out.println( "This is a spy number");
	else
		System.out.println( "This is not a spy number");
	
	}
}
