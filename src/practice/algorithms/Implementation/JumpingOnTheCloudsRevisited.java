package practice.algorithms.Implementation;

import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem">problem</a>
 * @since 2018-12-21
 */

public class JumpingOnTheCloudsRevisited {
    static int jumpingOnClouds(int[] c, int k) {
        return IntStream.range(0, c.length)
                .filter(i -> i % k == 0 || i == 0)
                .reduce(100, (i, v) -> i - c[v] * 2 - 1);
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0,0,0,1,0,0},3));
        System.out.println(jumpingOnClouds(new int[]{0,0,1,0,0,1,0},4));
        System.out.println(jumpingOnClouds(new int[]{0,0,0,0,1,0},3));

    }
}
