package practice.algorithms.search;

import java.util.TreeSet;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/maximum-subarray-sum/problem">problem</a>
 * @since 2018-12-23
 */

public class MaximumSubarraySum {

    static long maximumSum(long[] a, long m) {
        long current;
        long previous = 0;
        long result = 0;
        TreeSet<Long> sums = new TreeSet();
        for (int i = 0; i < a.length; i++) {
            current = (previous + a[i] % m) % m;
            result = Math.max(result, current);
            if (sums.ceiling(current) != null) {
                result = Math.max(result, (current - sums.ceiling(current) + m) % m);
            }
            sums.add(current);
            previous = current;
        }
        sums.stream().forEach(System.out::println);
        System.out.println("----");
        return result;
    }

    public static void main(String[] args) {
        long[] a = {3, 3, 9, 9, 5};
        long m = 18;
        System.out.println(maximumSum(a, m));
    }
}
