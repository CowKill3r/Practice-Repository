import java.util.*;
import java.math.*;

public class robot_returning_to_origin {
	
	private static int returnToOrigin(String in) {
		int x = 0;
		int y = 0;
		char chars[] = in.toCharArray();
		ArrayList<String> possibilities = new ArrayList<String>();
		possibilities.add("U");  //index 0
		possibilities.add("D");  //index 1
		possibilities.add("L");  //index 2
		possibilities.add("R");  //index 3
		
		for (char c : chars) {
			if (c == possibilities.get(0).charAt(0)) {
				y += 1; //up
			}
			else if (c == possibilities.get(1).charAt(0)) {
				y -= 1; //down
			}
			else if (c == possibilities.get(2).charAt(0)) {
				x -= 1;
			}
			else {
				x += 1;
			}
		}
		System.out.println(Math.abs(x) + Math.abs(y));
		return 0;
	}

	public static void main(String[] args) {
		returnToOrigin("UULRDRLLUUDRRR"); //robot starts at origin
	}

}
