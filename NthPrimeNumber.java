package javatpointPrograms;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String args[]) {
		
		//2, 3, 5, 7, 11, first 5 prime numbers,numbers divisible by one and itself
		
		int num = 1,count = 0,n,i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n to compute the nth prime number");
		n = scan.nextInt();
		
		while(count < n) {
		
			num = num +1;// number should keep on increasing to check for divison in for loop
					for(i = 2; i < num; i++) {//num keeps increment to divide it,if it divides then check if both nos are equal,as prime no diivided by one and itself if yes count+,num++ goes on to check if prime or not as count reaches ur no u get prime number
				
				if(num % i == 0){
					
					break;
				}
			}
			if(i == num) { //because prime only divisble by one and the no itself so
				
				count = count + 1;//count increases till it equals the nth number see while loop
			}//count will increase if i==num means prime because it divisible by 1 and no itself so i== num, 13==13,then will complete the while loop count less than n
			//i==num means prime so increase count till n i.e the nth input we send
		}
		
		System.out.println("The " + n +"th prime number is " +num  );
	}
}
