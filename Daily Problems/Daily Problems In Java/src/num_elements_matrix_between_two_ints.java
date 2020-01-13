import java.util.*;
public class num_elements_matrix_between_two_ints {

    /*  Author: Octavian Stoch
        Date: 1/9/2020
    Let A be an N by M matrix in which every row
    and every column is sorted.

    Given i1, j1, i2, and j2, compute the number of elements
    of M smaller than M[i1, j1] and larger than M[i2, j2].
    For example, given the following matrix:

    [[1, 3, 7, 10, 15, 20],
    [2, 6, 9, 14, 22, 25],
    [3, 8, 10, 15, 25, 30],
    [10, 11, 12, 23, 30, 35],
    [20, 25, 30, 35, 40, 45]]

    And i1 = 1, j1 = 1, i2 = 3, j2 = 3, return 15 as there are
    15 numbers in the matrix smaller than 6 or greater than 23.*/

    private static void solution() {
        System.out.print("GENERATING MATRIX\n");
        generateMatrixAndSolve();
    }

    private static void generateMatrixAndSolve() {
        int row = 10;                       //row value
        int column = 10;                    //row column
        Random randomNumber = new Random(); //random number object
        int[][] matrix = new int[row][column];

        for (int colOuter = 0; colOuter < row; colOuter++){
            for (int rowInner = 0; rowInner < column; rowInner++){
                matrix[colOuter][rowInner] = randomNumber.nextInt(30);
            }
        }
        printMatrix(matrix, row, column);
        solveMatrix(matrix, row, column, 1,1,3,3);

    }

    private static void solveMatrix(int[][] matrix, int row, int column, int firstIndexOne,
                                    int firstIndexTwo, int secondIndexOne, int secondIndexTwo){
        /*find the value of the matrix at indexes [firstIndexOne][firstIndexTwo] and
        * [secondIndexOne][secondIndexTwo]
        * 1)Iterate though the int[][] matrix with size row,column
        * 2)Print out index values using inputs*/
        int firstNumberToCompare    = matrix[firstIndexOne][firstIndexTwo];     //all number less than
        int secondNumberToCompare   = matrix[secondIndexOne][secondIndexTwo];   //all number greater than
        int temporary               = 0;
        int finalResult             = 0;

        if (firstNumberToCompare > secondNumberToCompare){
            secondNumberToCompare   = temporary;                //assign secondNumber to temporary
            firstNumberToCompare    = secondNumberToCompare;    //assign firstNumber to secondNumber
            temporary               = firstNumberToCompare;     //assign temporary to firstNumber
        }

        for (int columnOuter = 0; columnOuter < row; columnOuter++){
            for (int rowInner = 0; rowInner < column; rowInner++){
                    if (matrix[columnOuter][rowInner]       < firstNumberToCompare |
                            matrix[columnOuter][rowInner]   > secondNumberToCompare) {
                        finalResult+=1;
                    }
                }
            }

        System.out.println("There are: "+finalResult+" integers that are less than "+firstNumberToCompare+
                " \nand greater than "+secondNumberToCompare);
        }

    private static void printMatrix(int[][] matrix, int row, int column){ //prints out matrix
        int checkerNumber = 0;
        for (int colOuter = 0; colOuter < row; colOuter++){
            for (int rowInner = 0; rowInner < column; rowInner++){
                System.out.print(matrix[colOuter][rowInner]+ "\t");
            }
            System.out.println();
        }
    }

    public static void main (String[]args) {
        solution();
    }
}
