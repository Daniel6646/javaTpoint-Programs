package javatpointPrograms;

import java.util.Scanner;

public class PerfectSquare {

	/*
	 * A perfect square is a number that can be expressed as the product of two
	 * equal integers. What does that mean? Basically, a perfect square is what you
	 *get when you multiply two equal integers by each other. 25 is a perfect
	 * square because you're multiplying two equal integers (5 and 5) by each other
	 perfect square is 1x1,2x2,3x3,4x4,5x5 etc 1,3,9,16,25 ...	
	 */
	
	
	// user-defined method that checks the number is perfect square or not
	static boolean checkPerfectSquare(double number) {
		// calculating the square root of the given number
		double sqrt = Math.sqrt(number); //25
		// finds the floor value of the square root and comparing it with zero
		return ((sqrt - Math.floor(sqrt)) == 0);//  i.e 5-5=0
	}

	// main method
	public static void main(String[] args) {
		System.out.print("Enter any number: ");
		// object of the Scanner class
		Scanner sc = new Scanner(System.in);
		// reading a number of type double from the user
		double number = sc.nextDouble();
		// calling the user defined method
		if (checkPerfectSquare(number))
			System.out.print("Yes, the given number is perfect square.");
		else
			System.out.print("No, the given number is not perfect square.");
	}
}