import java.util.*;

public class all_possible_perms_list {
	
	/* Given a number in the form of a list of digits, return all possible permutations.
	 * Example: given [1, 2, 3] return:
	 * 			[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]*/
	
	static ArrayList<Integer> mylist				= new ArrayList<Integer>();
	static ArrayList<ArrayList<Integer>> checker	= new ArrayList<ArrayList<Integer>>();
	
	public static void genList() { 
		ArrayList<Integer> randomDigits = new ArrayList<Integer>();
		int length 		= 0;
		int numberToAdd = 0;
		Random myRandom = new Random();
		
		//random length of the arraylist with max length of 20 to make it readable
		while (length == 0) {
			length = myRandom.nextInt(20);
		}
				
		for (int i = 0; i < length; i++) {
			numberToAdd = myRandom.nextInt(10); //make the new random number between 1 and 10
			randomDigits.add(numberToAdd);		//add the random number
		}
		//System.out.println(randomDigits);
		mylist = randomDigits;
	}
	
	public static void makePermutations() {
		System.out.println("Input List: " + mylist + "\nPossible permutations: \n");
		ArrayList<Integer> permz = new ArrayList<Integer>(); //copy mylist to switcher and print out as perm
		int controlIndex	= 0; //set a control index to change after setting a permutation
		int sizeOfList		= mylist.size();
		
		//check to make sure that permz isn't in checker
		checker.add(mylist);
		for (int i = 0; i < sizeOfList-1 ; i++) {
			permz = mylist;
			Collections.swap(permz, controlIndex, controlIndex + 1); //swap first pos with second and so on
			checker.add(permz);
			System.out.println(permz);
			controlIndex++; //increment control by one
		}
		System.out.println("All permutations: \n" + checker);
	}

	public static void main(String[] args) {
		genList();			//generate the list of digits
		makePermutations();	//make the necessary permutations
	}

}
