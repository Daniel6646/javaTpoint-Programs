package javatpointPrograms;

public class PrimeNumber {

	  public static void main(String[] args) {

		  int no = 7;
		  int temp = 0;
		  for(int i= 2;i<no-1;i++) {
			  
			  if(no%i ==0) {
				  
				  temp = temp+1;
			  }//prime by no. and itself if any other not prime
			  
		  }
		  
		  if(temp ==0)
		  {
			  System.out.println(no+ " is a prime number");
			  
		  }
		  else {System.out.println(no+ " is not a prime number");
		
		  }

	}
}

