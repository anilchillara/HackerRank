package practice.algorithms.greedy;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/greedy-florist/problem">problem</a>
 * @since 2018-12-25
 */

public class GreedyFlorist {
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        // flowers to buy
        int i = c.length, cost = 0, multiply = 1;
        while (i >= 0) {
            for (int j = 0; j < Math.min(i, k); j++) {
                cost += c[i - 1 - j] * multiply;
            }
            multiply++;
            i -= k;
        }

        return cost;
    }

    public static void main(String[] args) {
        System.out.println(getMinimumCost(3, new int[]{2, 5, 6}));
        System.out.println(getMinimumCost(2, new int[]{2, 5, 6}));
        System.out.println(getMinimumCost(3, new int[]{1, 3, 5, 7, 9}));
    }
}
