/*
 * Author: Octavian Stoch
 * Date: 10/10/2019
 * Problem Description: from any given input, find the number of times you
 * 						need to add any number and it's reverse to get a
 * 						palindrome. e.g. 9339
 * */
import java.util.*;

public class number_of_palindromes {
	
	public static int palindromeStarter;
	
	public static void reverseInt(String n) {
		/*
		 * Approach: 
		 * 1) Make a new stack of integers
		 * 2) loop through string of integer (toString()) using charAtpos()
		 * 3) return new reversed integer
		 * */
		Stack<String>		reverseMyInteger 	= new Stack<String>();
		ArrayList<String> 	integerList	= new ArrayList<String>();
		
		for (int i = 0; i < n.length(); i++) {
			String addThis = String.valueOf(n.charAt(i));
			reverseMyInteger.push(addThis);
			System.out.println(n.charAt(i));
		}
		
		System.out.println("The stack contains: " + reverseMyInteger);
		
		for (int i = 0; i <= reverseMyInteger.size()+1; i++) {
			//String newIntegerValue = String.valueOf(n.charAt(i));
			//makeNewInteger.add(newIntegerValue);
			integerList.add(reverseMyInteger.pop());
		}
		
	
		System.out.println("The new stack contains: " + reverseMyInteger);
		
		StringBuilder sb = new StringBuilder();
		
		for (String tempString : integerList) {
			sb.append(tempString);
		}
		System.out.println(sb);
		
		int finalReversed = Integer.parseInt(sb.toString());
		
		System.out.println("Given integer is: " + n +"\nReversed Intger is: " + finalReversed + "\n Sum is: "
				+ (Math.addExact(palindromeStarter, finalReversed)));
		
	}

	public static void solution() {
		Scanner sc = new Scanner(System.in); //create a new scanner to look for user inputs
		System.out.println("Please type in a interger: ");
		while (!sc.hasNextInt()) sc.next(); //wait until integer is given by user
		
		palindromeStarter 			= sc.nextInt();
		String 	convertedStarter 	= Integer.toString(palindromeStarter);
		
		reverseInt(convertedStarter);
		
		//System.out.println("The given integer is: " + palindromeStarter);
		
	}
	
	public static void main(String[] args) {
		solution();
	}

}
