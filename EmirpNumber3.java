package javatpointPrograms;

import java.util.Scanner;

public class EmirpNumber3 {
	
	public static boolean isPrime(int n) {
		
		if(n <=1)
		return false;
		
		for(int i=2; i<n; i++)
			if(n % i ==0)
		return false;
		
		return true;
			
	}
	
	public static boolean isEmirp(int n) {
		
		
		if(isPrime(n ) == false)
		return false;
		
		int digit,reverse =0;
		
		while(n != 0) {
		digit = n%10;
		reverse = reverse *10 + digit;
		n = n/10;
		}
		
		return isPrime(reverse);
	
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int n = scan.nextInt();
		if(isEmirp(n) == true)
			System.out.println("This is a Emirp number");
		else
			System.out.println("This is not a emirp number");
		
		
	}

}
