package practice.algorithms.Implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/picking-numbers/problem">problem</a>
 * @since 2018-12-19
 */

public class PickingNumbers {
    public static void main(String[] args) {
        System.out.println("Results :: " + Result.pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
        System.out.println("Results :: " + Result.pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
    }
}

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int len = a.size();
        int max = 0;
        for (int i = len - 1; i >= 0; i--) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {

                if ((a.get(i) - a.get(j)) < 2) {
                    count++;
                }

            }
            max = count > max ? count : max;
        }

        return max;
    }
}


