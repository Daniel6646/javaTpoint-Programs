package javatpointPrograms;

import java.util.Scanner;

public class EmirpNumber2 {
	
	
	public static boolean isPrime(int n)  
	{  
	//base case  
	if (n <= 1)  
	return false;  
	
	for (int i=2; i<n;i++)
		if(n % i ==0)
			return false;
	return true;
	
	} 
	
	public static boolean isEmirp(int n) {
	
		if(isPrime(n) == false)
		return false;
		
		int digit,reverse = 0;
		while(n!=0) {
			digit = n%10;
			reverse = reverse *10 + digit;
			n = n/10;
				
		}
		
		return isPrime(reverse);	
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(isEmirp(n)== true)
			System.out.println("The given number is a emirp number");
		else
			System.out.println("The gives number is NOT a emirp number");
		
	}
	
}
