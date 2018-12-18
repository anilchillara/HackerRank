package practice.algorithms.Implementation;

import java.util.Arrays;
import java.util.List;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/the-birthday-bar/problem">problem</a>
 * @since 2018-12-16
 */

public class BirthdayChocolate {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int dSumofSquares, int mSquares) {

        int[] array = s.stream().mapToInt(i -> i).toArray();
        int total = 0;
        for (int i = total; i <= array.length - mSquares; i++) {
            if (Arrays.stream(array, i, i + mSquares).sum() == dSumofSquares)
                total++;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Total possibilities :: " +
                birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2)
        );
        System.out.println("Total possibilities :: " +
                birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2)
        );

    }
}
