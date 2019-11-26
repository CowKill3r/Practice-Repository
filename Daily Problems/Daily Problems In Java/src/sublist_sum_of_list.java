import java.util.*;

public class sublist_sum_of_list {
	/*	Given a list of numbers L, implement a method sum(i, j) 
	 * 	which returns the sum from the sublist L[i:j] 
	 *	(including i, excluding j).
		For example, given L = [1, 2, 3, 4, 5], 
		sum(1, 3) should return sum([2, 3]), which is 5.*/
	
	private static int sum(List<Integer> L, int i,int j) {
		System.out.println(L+"\n"+"index i = "+i+"\n"+"index j = "+j);
		List<Integer> subListToSum = new ArrayList<Integer>();
		
		if (i <= j) { //make sure that i is less than j so we have a sublist of at least one
			subListToSum.addAll(L.subList(i, j));
			
		}
		
		else if (i > j) { //print out a error so the user knows what they did wrong
			System.out.println("index 'i' is more than index 'j'");
		}
		
		int sizeList = L.size(); //only reaches here if i <= j
		System.out.println("size of list is: " + sizeList);
		if (j <= sizeList & i <= sizeList) { //check to account for out of bounds and negatives
			int result = 0;
			
			for (int allInts : subListToSum) {
				result += allInts;
			};
			
			System.out.println("Sum(" + i + ", " + j + ")" + " = " + result);
		}
		
		return 0;
	}

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		int c = 1;
		
		for (int i = 0; i < 10; i++) { //make a list of integers 1-10
			myList.add(c);
			c++;
		}
		
		sum(myList, 1, 4); //find the sum of a list from index i to j/include i not j
	}

}
