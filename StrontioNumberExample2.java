package javatpointPrograms;

import java.util.Scanner;

public class StrontioNumberExample2 {
	
	public static void main(String args[]) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num= scan.nextInt();
		int n = num;
	 num = (num*2%1000)/10;
	 
	 if(num%10 == num/10)
		 System.out.println(n+ "  is a strontio number");
	 else
		 System.out.println(n+ "  is not a strontio number");
	
	}

}
