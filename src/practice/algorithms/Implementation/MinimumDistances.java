package practice.algorithms.Implementation;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/minimum-distances/problem">problem</a>
 * @since 2018-12-22
 */

public class MinimumDistances {
    static int minimumDistances(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();
        int min = a.length + 1;
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i]) && abs(map.get(a[i]) - i) < min)
                min = Math.abs(map.get(a[i]) - i);
            map.put(a[i], i);
        }
        return min == a.length + 1 ? -1 : min;
    }

    public static void main(String[] args) {
        System.out.println("Min dist :: " + minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));
        System.out.println("Min dist :: " + minimumDistances(new int[]{3, 2, 1, 0, 5, 3, 2}));
    }
}
