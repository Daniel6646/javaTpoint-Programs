package javatpointPrograms;

import java.util.Scanner;

public class AtmExample2 {
	
	public static void main(String args[]) {
		
		int balance =100000,withdraw,deposit;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			
			System.out.println("Automated Atm Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check balance ");
			System.out.println("Choose 4 for Exit");
			System.out.println("Choose your operation");
			
			int choice = scan.nextInt();
			switch(choice) {
			
			case 1:
				
			System.out.println("Enter the amount to be withdrawn");
				
			withdraw = scan.nextInt();
			
			if(balance >= withdraw) {
				balance = balance - withdraw;
			
			System.out.println("Please collect your money");
			}
			else {
				System.out.println("Insufficient balance");
			}
			
			System.out.println("");
			break;
			
			case 2:
				
				System.out.println("Enter the amount to be deposited");
				
				deposit = scan.nextInt();
				balance = balance +deposit;
				System.out.println("Your money has been deposited succesfully");
				System.out.println("");
				break;
				
			case 3:
				
				System.out.println("Balance =" +balance);
				System.out.println("");
				break;
				
				
			case 4:
				System.exit(0);
			
			}		
		}
	}
}
