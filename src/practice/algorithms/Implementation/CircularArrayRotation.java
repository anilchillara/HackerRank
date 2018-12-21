package practice.algorithms.Implementation;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/circular-array-rotation/problem">problem</a>
 * @since 2018-12-20
 */

public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int rotationFactor = k > a.length ? (k % a.length == 0 ? a.length : k % a.length) : k;
        return IntStream.of(queries)
                .map(q -> q >= rotationFactor ? a[q - rotationFactor] : a[a.length - rotationFactor + q]).toArray();
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{1, 2}))
        );
    }
}
