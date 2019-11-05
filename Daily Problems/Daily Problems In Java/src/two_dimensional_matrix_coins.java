import java.util.*;

public class two_dimensional_matrix_coins {
	
	private static int inputMatrixs[][];

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

		inputMatrixs = (int[][])coins.clone(); //clone the values of coins into inputMatixs to separate solution into two methods
		
	}
	
	public static int solving() {
		for (int[] row: inputMatrixs) {
			System.out.println(Arrays.toString(row));
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateMatrixAndSolve();
		solving();
	}

}
