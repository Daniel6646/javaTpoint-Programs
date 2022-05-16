package javatpointPrograms;

import java.util.Scanner;

public class KrishnamurthyNumber {
	  
	
	//A number is said to be Krishnamurthy if the factorial sum of all its digits is equal to that number.
	
	/*
	 * //Number = 
	 * 145 = 1! + 4! + 5! =
	 *  1 + ( 4 * 3 * 2 * 1 ) + ( 5 * 4 * 3 * 2 * 1 )
	 * = 1 + 24 + 120 = 145
	 */
	
	/*
	 * Intrestingly,there are exactly four Krishnamurthy numbers i.e. 1, 2, 145, and
	 * 40585 known to us
	 */
	
	//main() method start  
	    public static void main(String args[])  
	    {  
	        int range;  
	          
	        //create scanner class object  
	        Scanner sc=new Scanner(System.in);  //factorial sum is equal to the number i.e 145
	          
	        //show custom message  
	        System.out.println("Enter the value of range :");  
	          
	        //store user entered value into variable range  
	        range = sc.nextInt();  
	  
	        for(int i = 1; i <= range; i++)  
	            checkNumber(i);  
	    }  
	  
	    // create fact() method to calculate the factorial of the number   
	    static int fact(int number)   
	    {   
	        int f = 1;   
 	        while (number != 0) {   
	            f = f * number;   
	            number--;   
	        }   
	        return f;   
	    }   
	  
	    // create checkNumber() method to check krishnamurthy number  
	    static void checkNumber(int number)   
	    {   
	        int sum = 0;    //initialize sum to 0   
	          
	        int tempNumber = number;    //create a copy of the original number   
	          
	        //perform operation until tempNumber will not equal to 0  
	        while (tempNumber != 0) {   
	            // calculate the factorial of the last digit of the tempNumber and then add it to the sum  
	            sum = sum + fact(tempNumber % 10);   
	  
	            // replace the value of tempNumber by tempNumber/10   
	            tempNumber = tempNumber / 10;   
	        }   
	  
	        // Check whether the number is equal to the sum or not. If both are equal, the number is Krishnamurthy number  
	        if(sum == number)  
	            System.out.println(number + " is a krishnamurthy number");   
	    }  
	}  