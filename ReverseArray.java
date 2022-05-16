package javatpointPrograms;

public class ReverseArray {

	public static void main(String args[]) {
		
		int arr1[] = {1,2,3,4,5};
		
		System.out.println("Orignal Array");
		
		for(int i =0; i<arr1.length; i++) {
			
			System.out.print(arr1[i] + " ");
			
			
		}
		System.out.println();
		System.out.println("Reverse of a Array");
		for(int i =arr1.length - 1;i >= 0;i--) {
			
			System.out.print(arr1[i] + " ");
			
		}
	}
	
	
}
