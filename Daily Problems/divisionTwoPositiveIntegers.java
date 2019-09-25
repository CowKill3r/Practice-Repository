/*
Implement division of two positive integers without 
using the division, multiplication, or modulus operators. 
Return the quotient as an integer, ignoring the remainder.
*/

import java.util.*;

class divisionTwoPositiveIntegers {

	//['dog', 'deerdo', 'deal', 'delve', 'dido', 'don']

	public static void main (String[] args) {
		//scanner to scan two integers 
		Scanner sc 		= new Scanner(System.in);
     	System.out.println("Input First Integer: ");

     	while (!sc.hasNextInt()) sc.next();
     	int userIn1 	= sc.nextInt();
     	int userIn2;

     	System.out.println("Inputer Second Integer: ");

     	do {
     		while (!sc.hasNextInt()) sc.next();
     		userIn2 = sc.nextInt();
     	} while (userIn2 < userIn1);

     	System.out.println(userIn1 + " " + userIn2);
     

     	//divide without using division "/", multiplication "*", modulus "%" operators.
     	//use addition and subtraction?
	}
}
