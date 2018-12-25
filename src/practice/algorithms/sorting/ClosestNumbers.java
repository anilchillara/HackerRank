package practice.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/closest-numbers/problem">problem</a>
 * @since 2018-12-25
 */

public class ClosestNumbers {
    static int diff;
    static List<Integer> smallPairs;

    static int[] closestNumbers(int[] arr) {
        diff = Integer.MAX_VALUE;
        smallPairs = new ArrayList<>();
        Arrays.sort(arr);
        IntStream.range(1, arr.length)
                .forEachOrdered(i -> {
                    if ((arr[i] - arr[i - 1]) <= diff) {
                        if ((arr[i] - arr[i - 1]) < diff) {
                            smallPairs.clear();
                            diff = arr[i] - arr[i - 1];
                        }
                        smallPairs.add(arr[i - 1]);
                        smallPairs.add(arr[i]);
                    }
                });

        return smallPairs.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(closestNumbers(new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854})));
        System.out.println(Arrays.toString(closestNumbers(new int[]{5,4,3,2})));
        System.out.println(Arrays.toString(closestNumbers(new int[]{-5,15,25,71,63})));
    }
}
