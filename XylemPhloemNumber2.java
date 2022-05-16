package javatpointPrograms;

import java.util.Scanner;

public class XylemPhloemNumber2 {

 public static void main(String arhs[]) {
		
	 int num,mean_number = 0,extreme_number = 0,n;
	 	
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		 num = scan.nextInt();		
		n = num;
		
		while(n != 0) {
		if(n == num || n<10) 
			extreme_number = extreme_number + n%10;
		
			else
				mean_number = mean_number + n%10;
				
		n = n/10;
		}
		
		System.out.println("The sum of extreme number is " + extreme_number);
		System.out.println("The sum of mean numbers is " + mean_number);
		
		if(extreme_number == mean_number)
		{
			System.out.println(num +" is a xylem number");
		}
		else {
			System.out.println(num +" is a phleom number");
			
		}	
	}
}
