package practice.algorithms.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/two-arrays/problem">problem</a>
 * @since 2018-12-24
 */

public class PermutingTwoArrays {

    static String twoArrays(int k, Integer[] A, Integer[] B) {
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        return IntStream.range(0, A.length).allMatch(e -> A[e] + B[e] >= k) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(twoArrays(5, new Integer[]{1, 2, 2, 1}, new Integer[]{3, 3, 3, 4}));
        System.out.println(twoArrays(10, new Integer[]{2, 3, 1}, new Integer[]{7, 8, 9}));
    }
}
