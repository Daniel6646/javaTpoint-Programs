package javatpointPrograms;

public class Automorphic1 {

	static boolean isAutomorphic(int num) {

		int square = num * num;

		while (num > 0) {

			if (num % 10 != square % 10) {
				
				return false;
			}
				
			num = num / 10;
			square = square / 10;

		}

		return true;

	}
		//An automorphic number is an integer whose square ends with the given integer, as (25)2 = 625, and (76)2 = 5776. 
	public static void main(String args[]) {

		System.out.println(isAutomorphic(76) ? "Automorphic number" : "Not Automorphic number");
		System.out.println(isAutomorphic(30) ? "Automorphic" : "Not Automorphic");

	}

}
