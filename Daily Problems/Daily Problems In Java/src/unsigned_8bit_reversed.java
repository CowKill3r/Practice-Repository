import java.util.*;


public class unsigned_8bit_reversed {
	
	public static String randomBits;

	public static String createRandom8Bit() {
		int max = 255;
		Random myRandomNumber = new Random();
		
		int randomRes	= myRandomNumber.nextInt(max);
		randomBits		= Integer.toBinaryString(randomRes);
	
		System.out.println("Random 8Bit Unsigned Integer = " + randomRes 
				+ "\nThe binary conversion is = " + randomBits);
		
		return randomBits;
	}
	
	public static String swapBits(String s) {
		/*
		 * Approach: 
		 * 	1) create an ArrayList of strings for the binary numbers
		 * 	2) use modulo 2 in order to swap on collections.swap(<index % 2 == 0> , <index % 2 == 0 - 1>
		 *  3) end...
		 * */
		ArrayList<String>	swapArray	= new ArrayList<String>();
		ArrayList<String>	resArray	= new ArrayList<String>();
		
		for (int i = 0; i < s.length(); i++) {
			String swapBitsRes = String.valueOf(s.charAt(i));
			swapArray.add(swapBitsRes);
		}
		
		System.out.println("Array of bits = " + swapArray);
	
		int switcherNumber	= 0;
		int iNum			= 0;
		int sizeOfSwapArray	= swapArray.size();
		int firstPassCheck	= 0;
		
		while (sizeOfSwapArray != 0) {
			while (firstPassCheck != 1) {
				resArray.add(swapArray.get(0));
				switcherNumber += 1;
				sizeOfSwapArray -=1;
				firstPassCheck = 1;
			}
			
			if (switcherNumber % 2 == 0) { //if switcherNumber/2 has no remainder, then its the second number
				Collections.swap(resArray, iNum, iNum - 1);
				resArray.add(swapArray.get(switcherNumber));
				System.out.println("If check resArray is = " + resArray);
				switcherNumber +=1;
				sizeOfSwapArray -=1;
				iNum += 1;
			}
			else {
				resArray.add(swapArray.get(switcherNumber));
				System.out.println("Else check resArray is = " + resArray);
				switcherNumber += 1;
				sizeOfSwapArray -=1;
				iNum += 1;
				
			}
		}
		return "";
	}
	
	public static void solution() {
		createRandom8Bit();
		swapBits(randomBits);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution();
	}

}
