package practice.algorithms.Implementation;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/angry-professor/problem">problem</a>
 * @since 2018-12-20
 */

public class AngryProfessor {
    static String angryProfessor(int k, int[] a) {
        return (int) Arrays.stream(a)
                .filter(item -> item <= 0)
                .count() < k ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(angryProfessor(3, new int[]{-1, -3, 1, 2}));
        System.out.println(angryProfessor(2, new int[]{-1, 0, 1, 2}));
    }
}
