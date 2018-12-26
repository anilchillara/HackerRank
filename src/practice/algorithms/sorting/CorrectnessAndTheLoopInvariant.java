package practice.algorithms.sorting;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/correctness-invariant/problem">problem</a>
 * @since 2018-12-25
 */

public class CorrectnessAndTheLoopInvariant {
    public static void insertionSort(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        insertionSort(new int[]{7, 4, 3, 5, 6, 2});
    }
}
