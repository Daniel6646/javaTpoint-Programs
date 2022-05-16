package javatpointPrograms;

import java.util.List;

public class ListOfOddNos {
	
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		
	}


}
