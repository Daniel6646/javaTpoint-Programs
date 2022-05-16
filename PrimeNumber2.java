package javatpointPrograms;

import java.util.Scanner;

public class PrimeNumber2 {

	
	  public static void main(String[] args)
	   {
	      int num, i, count=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      for(i=2; i<num; i++)//because prime is divided by one and number itself so i<num i.e 6 if number is 7
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println(num +" is a Prime Number.");
	      else
	         System.out.println(num +" is not a Prime Number.");
	   }
	
}
