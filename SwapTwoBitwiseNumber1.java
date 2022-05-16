package javatpointPrograms;

import java.util.Scanner;

/*public class SwapTwoBitwiseNumber1 {

	public static void main(String args[]) {
		
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		 a =scan.nextInt();
		System.out.println("Enter the second number");
		 b = scan.nextInt();		
		
		System.out.println("Before swapping number");
		System.out.println("a =" + a + "b = " +b );
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After swapping");
		System.out.println("a = " + a + "b =" +b);
	}
	
	
} */

public class SwapTwoBitwiseNumber1 {
	public static void main(String args[]) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a = scanner.nextInt();
		System.out.print("Enter the second number: ");
		b = scanner.nextInt();
		System.out.println("Before swapping:");
		System.out.println("a = " + a + ", b = " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping:");
		System.out.print("a = " + a + ", b = " + b);
	}
}
