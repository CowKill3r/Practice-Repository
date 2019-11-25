
public class helperFunctions {

	private static int reverse(int n) {
	    int x = 0;
	    while (n > 0) {
	    	System.out.println(x);
	    	x = x * 10 + n % 10;
	    	n /= 10;
	    }
	    return x;
	}
	
	public static void main(String[] args) {
		// functions that can be used in other classes
		System.out.println("reversing integer '567'");
		reverse(567);
	}

}
