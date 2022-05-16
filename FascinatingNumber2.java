package javatpointPrograms;

import java.util.Scanner;

public class FascinatingNumber2 {

	public static void main(String args[]) {
		
		int num,n2,n3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");//192, cz it has all nos frm 1-9,192x2=384, 192x3=576 192,384,576 concat= 192384576 contains all nos frm 1-9
		 num = scan.nextInt();
		 n2 = num*2;
		 n3 =  num*3;
		String concatstr = num+ " "+n2 +n3;
		boolean found = true;
		
		for(char c ='1'; c<='9';c++) {
			
			int count = 0;
			
			for(int i =0;i<concatstr.length();i++) {
				
				
				char ch =concatstr.charAt(i);
				if(ch ==c)
					count++;
			}
			
			if(count >1 || count ==0) {
				found = false;
				break;
				
			}
			
		}
		
		if(found) 
			System.out.println(num+ " is a fascinating number ");
		else 
			System.out.println(num+" is not a fascinationg number");
		
	}
}
