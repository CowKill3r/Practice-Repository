/*
Author: Octavian Stoch
translating the matrix problem from google [easy] in java
n = columns
m = rows
*/
import java.util.*;

class MatrixMaze {

	public void printMatrix(ArrayList[][] m){ //2d int array printmatrix
		try {

			int rows 	= m.length;
			int columns = m[0].length;
			String str  = "|\t";

			for (int i = 0; i < rows; i++){
				for (int j = 0; j < columns; j++){
					str += m[i][j] + "\t";
				}

				System.out.println(str);
				str = "\t";
			}
		}

		catch(Exception e){System.out.println("Matrix is empty!!");}
	}

	public static ArrayList makeMatrix(int n, int m) { //method to make a matrix from n colum and m rows
		ArrayList columnsMatrix	= new ArrayList();
		ArrayList finalMatrix 	= new ArrayList();
		//ls.add("F");

		int columnCounter 	= n;
		int rowCounter		= m;
		
		while (columnCounter != 0){ //add all the columns by decrementing until 0
			columnsMatrix.add("F");
			columnCounter--;
		};

		//System.out.println(columnsMatrix);

		while (rowCounter != 0){
			finalMatrix.add(columnsMatrix.clone());
			rowCounter--;
		};

		/*
		for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[i].length; j++) {
        		System.out.print(matrix[i][j] + " ");
    		}
    	System.out.println();
		}
		*/


		int checker 		= 0;
		int checkThisRow 	= m;
		int checkThisColumn = n;
		
		//System.out.println(finalMatrix);

		//rows(m) then columns(n)

		Random beetRed = new Random();

		for (int i = 0; i < checkThisRow; i ++){
			for (int j = 0; j < checkThisColumn; j++){
				if (checker != checkThisColumn){
					/*
					if check for random number bewteen 1 and 100,
					print "T" if number >= 50, otherwise print "F"
					*/
					if (beetRed.nextInt(100) >= 50){
						System.out.print("| " + "T" + " |");
					}
					else {
						System.out.print("| " + "F" + " |");
					}
					checker ++;
				}
				else {
					System.out.print("\n");
					checker = 0;
				}
				
			}
		}


		//System.out.println(finalMatrix + "\n");
/////////////////////////////////////////////////////////////////
		

		return columnsMatrix;
	}

	public static void main (String[] args){
		Random randGen = new Random(); //generate new instance of java.util.random
		

		for (int i = 0; i < 10; i++){
			int randomNumber = randGen.nextInt(100);
			//System.out.println(randomNumber);
		}

		int randNum1 = randGen.nextInt(10);
		int randNum2 = randGen.nextInt(10);

		System.out.println(randNum1 + "\n" + randNum2 + "\n");

		makeMatrix(randNum1, randNum2);
	}
}
