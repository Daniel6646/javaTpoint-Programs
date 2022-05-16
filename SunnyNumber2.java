package javatpointPrograms;

import java.util.Scanner;

public class SunnyNumber2 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		isSunnyNumber(N);
	}

	static boolean findPerfectSquare(double num) {

		double square_root = Math.sqrt(num);
		return ((square_root - Math.floor(square_root)) == 0);

	}

	static void isSunnyNumber(int N) {

		if (findPerfectSquare(N + 1)) {
			System.out.println("The given number is a sunny number.");
		}
		// executes if N+1 is not a perfect square
		else {
			System.out.println("The given number is not a sunny number.");
		}
		
		//Given, N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. Hence 80 is a sunny number.
		//Let's take another number 10.
		//Given, N=10 then N+1 will be 10+1=11, which is not a perfect square. Hence 10 is not a sunny number.

	}

}
