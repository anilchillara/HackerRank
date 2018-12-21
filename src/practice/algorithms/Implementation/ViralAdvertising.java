package practice.algorithms.Implementation;

import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/strange-advertising/problem">problem</a>
 * @since 2018-12-20
 */

public class ViralAdvertising {
    static int viralAdvertising(int n) {
        return IntStream.iterate(2, x -> x * 3 / 2).limit(n).sum();
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }

}
