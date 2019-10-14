/*
 * Author: Octavian Stoch
 * Date: 10/10/2019
 * Problem Description: from any given input, find the number of times you
 * 						need to add any number and it's reverse to get a
 * 						palindrome. e.g. 9339
 * */
import java.util.*;

public class number_of_palindromes {
	
	public static int palindromeStarter, reversedInt, firstPass, numPasses;
	
	public static boolean checkForPalindrome(int n) {
		/*
		 * check the given integer for a palindrome
		 * e.g. 456 = false , 9339 = true
		 * */
		if (n == reverseInt(Integer.toString(n))) {
			System.out.println("The given integer is a Palindrome!");
			return true; 	//if the given integer that's reversed is the same
			 				//when run through reverseInt, return true
		}
		else {
			System.out.println("The given integer isn't a Palindrome!");
			return false;  //if not the same, return false and keep on going
		}
	}
	
	public static int reverseInt(String n) {
		/*
		 * Approach: 
		 * 1) Make a new stack of integers
		 * 2) loop through string of integer (toString()) using charAtpos()
		 * 3) return new reversed integer
		 * */
		System.out.println("n is: " + n);
		Stack<String>		reverseMyInteger 	= new Stack<String>();
		ArrayList<String> 	integerList	= new ArrayList<String>();
		
		for (int i = 0; i < n.length(); i++) {
			String addThis = String.valueOf(n.charAt(i));
			reverseMyInteger.push(addThis);
			//System.out.println(n.charAt(i));
		}
		
		System.out.println("The stack contains: " + reverseMyInteger);
		
		while (reverseMyInteger.size() != 0) {
			//String newIntegerValue = String.valueOf(n.charAt(i));
			//makeNewInteger.add(newIntegerValue);
			integerList.add(reverseMyInteger.pop());
			System.out.println("Integer List is: " + integerList);
		}
		System.out.println("\n");
		
		//System.out.println("The new stack contains: " + reverseMyInteger);
		
		StringBuilder sb = new StringBuilder();
		
		for (String tempString : integerList) {
			sb.append(tempString);
		}
		System.out.println(sb);
		
		int finalReversed = Integer.parseInt(sb.toString());
		
		if (firstPass != 1) {
			System.out.println("DOING FIRST PASS");
			System.out.println("Given integer is: " + n +"\nReversed Intger is: " + finalReversed + "\n Sum is: "
					+ (Math.addExact(palindromeStarter, finalReversed)));
			numPasses += 1;
			reversedInt = Math.addExact(palindromeStarter, finalReversed);
			
			firstPass = 1;
			return finalReversed;
		}
		
		else {
			System.out.println("DOING ALL OTHER PASSES");
			System.out.println("Given integer is: " + n +"\nReversed Intger is: " + finalReversed + "\n Sum is: "
					+ (Math.addExact(reversedInt, finalReversed)));
			numPasses += 1;
			reversedInt = Math.addExact(reversedInt, finalReversed);
			return finalReversed;
		}
		
		
		
	}

	public static void solution() {
		Scanner sc = new Scanner(System.in); //create a new scanner to look for user inputs
		System.out.println("Please type in a interger: ");
		while (!sc.hasNextInt()) sc.next(); //wait until integer is given by user
		
		palindromeStarter 			= sc.nextInt();
		String 	convertedStarter 	= Integer.toString(palindromeStarter);
		sc.close();
		
		reverseInt(convertedStarter);
		
		//System.out.println("The given integer is: " + palindromeStarter);
		
	}
	
	public static void main(String[] args) {
		solution();
		while (checkForPalindrome(reversedInt) != true) {
			reverseInt(Integer.toString(reversedInt));
		}
		System.out.println("Total number of passes: " + numPasses);
	}

}
