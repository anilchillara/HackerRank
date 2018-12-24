package practice.algorithms.search;

import java.util.Arrays;
import java.util.List;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/sherlock-and-array/problem">problem</a>
 * @since 2018-12-23
 */

public class SherlockAndArray {
    static String balancedSums(List<Integer> arr) {
        int sum = arr.stream().mapToInt(x -> x).sum();
        int leftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (leftSum == (sum - leftSum - arr.get(i))) {
                return "YES";
            }
            leftSum += arr.get(i);
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(balancedSums(Arrays.asList(5, 6, 8, 11)));
        System.out.println(balancedSums(Arrays.asList(1, 2, 3)));
        System.out.println(balancedSums(Arrays.asList(1, 2, 3, 3)));
    }
}
