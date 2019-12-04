import java.util.ArrayList;

public class permutations_of_string_palindrome {
	
	private static ArrayList<String> listOfPals = new ArrayList<String>();

	private static boolean solution(String in) {
		System.out.println("Input is " + in);
		allPermutations(in, 0, in.length()-1);
		System.out.println(listOfPals + "\n" + listOfPals.size());
		for (String s : listOfPals) {
			System.out.println(s);
		}
		
		return true;
	}
	
	private static void allPermutations(String in, int l, int r) {
		if (l == r) {
			System.out.println(in);
			
		}
		else {
			for (int i = 0; i <= r; i++) {
				in = swap(in, l, i);
				allPermutations(in, l+1, r);
				in = swap(in, l, i);
			}
			if (isPalindrome(in)) {
				listOfPals.add(in);
			}
		}
		//System.out.println(listOfPals);
	}
	
	private static String swap(String in , int i, int j) {
		char t;
		char[] charArr = in.toCharArray();
		t = charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = t;
		return String.valueOf(charArr);
	}
	
	private static boolean isPalindrome(String in) {
		boolean result	= false;
		String	bruh	= in;
		String 	out		= "";
		
		while (bruh.length() > 0) { //while length of in isn't zero get last character and move it to String "out"
			//System.out.println("Out = " + out + "  In = " + bruh);
			out += bruh.substring(bruh.length()-1);
			bruh = bruh.substring(0, bruh.length() - 1);
		}
		
		if (in.equals(out)) {
			//System.out.println("Input: " + in + " is the same as Output: " + out);
			result = true;
			return result;
		}
		else {
			//System.out.println("Input: " + in + " isn't the same as Output: " + out);
			result = false;
			return result;
		}
		
	}

	public static void main(String[] args) {
		solution("racecar");
	}

}
