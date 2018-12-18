package practice.algorithms.Implementation;

import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/divisible-sum-pairs/problem">problem</a>
 * @since 2018-12-18
 */
public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Simpler java 8 solution
        return IntStream.range(0, n)
                .map(
                        x -> IntStream.range(x + 1, n)
                        .map(y -> (ar[x] + ar[y]) % k == 0 ? 1 : 0)
                        .sum()
                )
                .sum();
    }

    public static void main(String[] args) {
        int res = divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2});
        System.out.println("Result :: " + res);
    }
}
