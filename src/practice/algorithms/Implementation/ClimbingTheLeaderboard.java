package practice.algorithms.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem">problem</a>
 * @since 2018-12-19
 */

public class ClimbingTheLeaderboard {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        List<Integer> result = new ArrayList<>();
        int[] array = IntStream.of(scores).distinct().toArray();
        int i = array.length - 1;
        for (int score : alice) {
            while (i >= 0) {
                if (score >= array[i]) i--;
                else {
                    //System.out.println(i + 2);
                    result.add(i+2);
                    break;
                }
            }
            if (i < 0) {
                //System.out.println(1);
                result.add(1);
            }
        }
        return result.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        int[] x = climbingLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120});
        System.out.println(Arrays.toString(x));
    }
}
