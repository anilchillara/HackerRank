package practice.interviewpreparationkit.arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/2d-array/problem">problem</a>
 * @since 2018-12-20
 */

public class HourglassSum {

    static int hourglassSum(int[][] arr) {
        //sumList is an integer array that will hold all of the hourglass sums we get.
        //It's initialised to 16 elements because we're told that the input matrix is
        //_always_ 6 by 6. And in a 6 by 6 2D Array, there will always be 16 hourglass sums.
        int[] sumList = new int[16];

        //sumIter is just an iterator so we can keep building the sumList array
        int sumIter = 0;

        //Where we do the math
        //This is in O(n^2) time because I can't think of something more efficient
        //We only go up to (arr.length - 2) because we operate on cells at index
        //[j+2] and [i+2]. The hourglass sum's middle value means we have to move around.
        for (int i = 0; i < (arr.length - 2); i++) {
            for (int j = 0; j < (arr[i].length - 2); j++) {
                sumList[sumIter] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                //Increase the value of our sum iterator so we're not overwriting values.
                sumIter += 1;
            }
        }

        //Set the max to the first element in our sum array.
        int max = sumList[0];

        //Then just find the sum with an easy for loop.
        for (int c = 0; c < sumList.length; c++) {
            if (sumList[c] > max) {
                max = sumList[c];
            }
        }

        //Return the highest value in our sum array.
        return max;

    }

    public static void main(String[] args) {

        int maxSum = hourglassSum(new int[][]
                {{1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}});
        System.out.println(maxSum);

        maxSum = hourglassSum(new int[][]
                {{1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 9, 2, -4, -4, 0},
                        {0, 0, 0, -2, 0, 0},
                        {0, 0, -1, -2, -4, 0}});
        System.out.println(maxSum);
        maxSum = hourglassSum(new int[][]
                {{-9, -9, -9, 1, 1, 1},
                        {0, -9, 0, 4, 3, 2},
                        {-9, -9, -9, 1, 2, 3},
                        {0, 0, 8, 6, 6, 0},
                        {0, 0, 0, -2, 0, 0},
                        {0, 0, 1, 2, 4, 0}});
        System.out.println(maxSum);
    }

}
