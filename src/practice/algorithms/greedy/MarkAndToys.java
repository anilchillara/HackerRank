package practice.algorithms.greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/mark-and-toys/problem">problem</a>
 * @since 2018-12-24
 */
public class MarkAndToys {
    static int sum = 0, toys = 0;

    static int maximumToys(int[] prices, int k) {
        toys = 0;
        Arrays.sort(prices);
        IntStream.range(0, prices.length)
                .forEachOrdered(x -> {
                    if (prices[x] + sum <= k) {
                        sum += prices[x];
                        ++toys;
                        //System.out.println(toys + " " + prices[x] + "  " + sum);
                    }
                });
        return toys;
    }

    public static void main(String[] args) {
        System.out.println("You can buy " + maximumToys(new int[]{1, 4, 3, 2}, 7) + " toys.");
        System.out.println("You can buy " + maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50) + " toys.");
    }
}
