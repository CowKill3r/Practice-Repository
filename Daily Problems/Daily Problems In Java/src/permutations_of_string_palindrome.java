
public class permutations_of_string_palindrome {
	
	private static boolean solution(String in) {
		System.out.println(in);
		return isPalindrome(in);
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
			System.out.println("Input: " + in + " is the same as Output: " + out);
			result = true;
			return result;
		}
		else {
			System.out.println("Input: " + in + " isn't the same as Output: " + out);
			result = false;
			return result;
		}
		
	}

	public static void main(String[] args) {
		solution("racecar");
	}

}
