import java.util.*;

public class two_dimensional_matrix_coins {
	
	private static int inputMatrixs[][]; //global variable to step through the 2d matrix, private to prevent access
	private static int inputRows;
	private static int inputColumns;

	public static void generateMatrixAndSolve() {
		Random myRandom		= new Random();
		int matrixRows		= myRandom.nextInt(10);
		int matrixColumns	= myRandom.nextInt(10);
		
		//System.out.println(matrixRows + "\n" + matrixColumns);
		
		int coins[][] = new int[matrixRows][matrixColumns];
		
		/* Use a nested array like
		 * for (int i = 0; i < something; i ++) <and>
		 * 		for (int j = 0.... etc..)...
		 * this is in order to go through all values of the array
		*/

		for (int i = 0; i < coins.length; i++) {  //generate random numbers for each slot in the machine
			for (int j = 0; j < coins[i].length; j++) {
				int randomNumCoins = myRandom.nextInt(10); //every index generates a random number between 0 and 10
				coins[i][j] = randomNumCoins;
			}
		}

		inputMatrixs	= (int[][])coins.clone(); //clone the values of coins into inputMatixs to separate solution into two methods
		inputRows		= matrixRows;
		inputColumns 	= matrixColumns;
		
	}
	
	public static void solving() {
		int 	totalCoinResult = 0;
		int 	currentX		= 0;
		int		currentY		= 0;
		boolean check			= true;
		
		for (int[] row: inputMatrixs) {
			System.out.println(Arrays.toString(row));
		}
		
		System.out.println("Total number of columns = " + inputColumns + "\nTotal number of rows= " + inputRows + "\n");
		System.out.println(inputMatrixs[currentX][currentY] + " " + inputMatrixs[inputRows-1][inputColumns-1]);
		
		while (currentX != inputRows || currentY != inputColumns) {
			totalCoinResult += inputMatrixs[currentX][currentY]; //initial addition at position 0,0
			System.out.println("Initial coin value at 0,0: " + totalCoinResult);
			
			/* Algorithm for determining max path through matrix using only right (inc currentX) and down (inc currentY) direction
			 * 	1) while loop checking for both the x and y coordinates to be at the bottom right of the matrix
			 * 	2) if statement comparing the values to the right and below the current position
			 * 		2a. whichever value is bigger increment current position based on which value is bigger
			 * 		2b. add the current x and y position value to totalCoinResult
			 * 	3) return the final totalCoinResult*/
			
			if (inputMatrixs[currentX+1][currentY] < inputMatrixs[currentX][currentY+1]) {
				currentY++;
				totalCoinResult += inputMatrixs[currentX][currentY];
			}
			else {
				currentX++;
				totalCoinResult += inputMatrixs[currentX][currentY];
			}
			
			/*
			System.out.println("The value at: " + currentX + " " + currentY + "\n is: " + inputMatrixs[currentX][currentY]);
			if (currentX != inputRows-1) {
				currentX++;
				System.out.println("Current X: " + currentX + " InputRows: " + inputRows);
			}
			if (currentY != inputColumns) {
				currentY++;
				System.out.println("Current Y: " + currentY + " inputColumns: " + inputColumns);
			}
			*/
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateMatrixAndSolve();
		solving();
	}

}
