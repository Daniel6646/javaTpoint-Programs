package javatpointPrograms;

import java.util.Scanner;

public class KrishnaMurthyNumber2 {

	public static void main(String args[]) {

		int range;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		range = scan.nextInt();
		for (int i = 1; i <= range; i++)
			checkNumber(i);

	}

	private static int fact(int number) {

		int f = 1;

		while (number != 0) {

			f = f * number;
			number--;

		}
		return f;
	}

	static void checkNumber(int number) {

		int sum = 0;
		int tempNumber = number;
		while (tempNumber != 0) {
			sum = sum + fact(tempNumber % 10);

			tempNumber = tempNumber / 10;
		}

		if (sum == number)
			System.out.println(number + " is a KrishnaMurthy number ");

	}
}
