package practice.algorithms.sorting;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/find-the-median/problem">problem</a>
 * @since 2018-12-25
 */

public class FindTheMedian {
    static int findMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new int[]{0,1,2,4,6,5,3}));
    }
}
