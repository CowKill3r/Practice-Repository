import java.util.*;
public class dividing_two_integers {

	public static void main(String[] args) {
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
		
		sc.close(); //close the scanner to be thread safe
		
		System.out.println(userIn1 + " " + userIn2);
		
		int userIn1copy = userIn1;
		int userIn2copy = userIn2;
		boolean check	= true;
		
		System.out.println(userIn1copy + " " + userIn2copy);
		
		while (check) {
			if (userIn2copy < userIn1copy) {
				System.out.println(userIn1copy + " / " + userIn2copy + " = 0");
			}
			else {
				int count = 0;
				while (userIn2copy > 0) {
					System.out.println(userIn2copy);
					userIn2copy -= userIn1copy;
					count += 1;
				}
			}
			check = false;
		}
		//divide without using division "/", multiplication "*", modulus "%" operators.
		//use addition and subtraction?
	}

}
