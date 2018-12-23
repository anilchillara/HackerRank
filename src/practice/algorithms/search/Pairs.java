package practice.algorithms.search;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/pairs/problem">problem</a>
 * @since 2018-12-22
 */

public class Pairs {
    static int pairs(int k, int[] arr) {
        Set<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return (int) Arrays.stream(arr).filter(value -> numbers.contains(value - k)).count();
    }

    public static void main(String[] args) {
        System.out.println("Pairs :: " + pairs(1, new int[]{1, 2, 3, 4}));
        System.out.println("Pairs :: " + pairs(2, new int[]{1, 2, 3, 4}));
    }
}
