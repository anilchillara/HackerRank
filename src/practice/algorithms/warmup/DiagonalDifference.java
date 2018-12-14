package practice.algorithms.warmup;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Anil Kumar C
 * @since 2018-12-13
 * @version 1.0
 *
 *
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

arr: an array of integers .
Input Format

The first line contains a single integer, , the number of rows and columns in the matrix .
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Print the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:

11
5
-12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

4
5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x
 *
 */

public class DiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int primaryDiagonalCount = 0;
        int secondaryDiagonalCount = 0;
        for (int i = 0, j = arr.length - 1; j >= 0 ; i++,j--) {
            //System.out.println("Primary :: (" + i+','+ i + ") Secondary :: (" + i + ", " + j + ")" );
            primaryDiagonalCount += arr[i][i];
            secondaryDiagonalCount += arr[i][j];
        }
        return Math.abs(primaryDiagonalCount-secondaryDiagonalCount);
    }


    public static void main(String[] args) {

        int[][] a = new int[][]{
                {1, 2, 3},
                {6, 7, 8},
                {1, 2, 9}};

        int result = diagonalDifference(a);

        System.out.println(result);
    }
}
