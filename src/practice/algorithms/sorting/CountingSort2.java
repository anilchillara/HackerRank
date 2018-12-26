package practice.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/countingsort2/problem">problem</a>
 * @since 2018-12-25
 */
public class CountingSort2 {

    static int[] countingSort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countingSort(new int[]{1,1,3,2,1})));
    }
}
