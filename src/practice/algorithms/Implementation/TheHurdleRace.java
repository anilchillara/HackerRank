package practice.algorithms.Implementation;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/the-hurdle-race/problem">problem</a>
 * @since 2018-12-19
 */
public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
        int maxHigh = Arrays.stream(height).max().getAsInt();
        int diff = maxHigh - k;
        return diff > 0 ? diff : 0;
    }

    public static void main(String[] args) {
        System.out.println(hurdleRace(7, new int[]{2, 5, 4, 5, 2}));
        System.out.println(hurdleRace(4, new int[]{1, 6, 3, 5, 2}));
    }
}
