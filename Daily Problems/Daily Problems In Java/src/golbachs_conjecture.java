import java.util.*;

/*
 * Return two prime numbers whose sum is the even number that
 * the user has inputted.
 * Author: Octavian Stoch
 * Date: 10/7/19
 * */
public class golbachs_conjecture {
	
	/*
	 * Approach --->
	 * Check if number is not even, return.
	 * Check if number is less than 2, return.
	 * Navigate i, from 3 to number 
	 * check if 
	 * 	i and (x-i) is prime, if yes, print it.
	 * */
	
	public static void solution() {
		//scanner to scan two integers 
		Scanner sc 		= new Scanner(System.in);
		System.out.println("Inpun an even number greater than 2: ");
		
		while (!sc.hasNextInt()) sc.next(); //wait until integer is given by user
		int input	= sc.nextInt();
		sc.close();
		
		System.out.println("\n\nthe inputted even number is: " + input);
		
		for (int i = 3; i < input / 2; i++) {
			if (isPrime(i) && isPrime(input - i)) {
				System.out.println("prime ints are: " + i + " " + (input - i));
			}
		}
	}
	

	public static boolean isPrime(int x) {
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		solution();
	}

}
