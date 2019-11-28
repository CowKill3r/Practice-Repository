import java.util.*;

public class twodimensional_matrix_adjacent_color_changer {
	
	/*Given a 2-D matrix representing an image, a location of a pixel 
	 * in the screen and a color C, replace the color of the given 
	 * pixel and all adjacent same colored pixels with C.

	For example, given the following matrix, and location pixel of 
	(2, 2), and 'G' for green:

		B B W
		W W W
		W W W
		B B B

		Becomes

		B B G
		G G G
		G G G
		B B B
	 */
	
	private static void printColors (String[][] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	private static int replaceColor(String color, int x, int y) { 
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("R");
		colorList.add("G");
		colorList.add("B");
		colorList.add("Y");
		
		Random myRandom = new Random();
		String[][] pixels = new String[5][5]; //make a 2d array of pixels with random colors
		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[i].length; j++) {
				pixels[i][j] = colorList.get(myRandom.nextInt(4));
				System.out.print(pixels[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println(colorList + "\n");
		
		/*Approach: here you do a recursive? 
		 * 1) nested for loop through the 2d array of strings
		 * 2) check is the thing != color 
		 * 		2a) then: thing = color
		 * 3) else: function (array)*/
		
		int colorchange = 0;
		String lookAtMe = pixels[x][y];
		for (int i = 0; i < pixels.length; i++) { //rows
			for (int j = 0; j < pixels[i].length; j++) { //columns
				if (!pixels[x][y].matches(color)) {
					pixels[x][y] = color;
				}
				else {
					if (pixels[x][y+1].matches(lookAtMe)) { //direction = south
						pixels[x][y+1] = color;
					}
					if (pixels[x][y-1].matches(lookAtMe)) { //direction = north
						pixels[x][y-1] = color;
					}
					if (pixels[x+1][y].matches(lookAtMe)) { //direction = east
						pixels[x+1][y] = color;
					}
					if (pixels[x-1][y].matches(lookAtMe)) { //direction = west
						pixels[x-1][y] = color;
					}
				}
			}
		}
		
		printColors(pixels);
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceColor("B", 2, 2);

	}

}
