package practice.algorithms.Implementation;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/flatland-space-stations/problem">problem</a>
 * @since 2018-12-27
 */

public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        int min = IntStream.range(1, c.length)
                .map(value -> (c[value] - c[value - 1]) / 2)
                .min().getAsInt();

        if (n - c[c.length - 1] - 1 > min) {
            min = n - c[c.length - 1] - 1;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(6, new int[]{0, 1, 2, 4, 3, 5}));
        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}));
    }
}
