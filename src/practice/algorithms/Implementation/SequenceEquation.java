package practice.algorithms.Implementation;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/permutation-equation/problem">problem</a>
 * @since 2018-12-20
 */

public class SequenceEquation {
    static int find(int[] p, int key) {
        int n = p.length;
        for (int i = 0; i < n; i++) {
            if (key == p[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    static int[] permutationEquation(int[] p) {
        int n = p.length;
        int[] result = new int[n];
        int count = 0;
        for (int x = 1; x <= n; x++) {
            int i = find(p, x);
            int j = find(p, i);
            result[count++] = j;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(permutationEquation(new int[]{2, 3, 1}))
        );
    }
}
