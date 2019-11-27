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
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceColor("B", 2, 2);

	}

}
