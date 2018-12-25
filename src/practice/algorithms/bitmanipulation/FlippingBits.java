package practice.algorithms.bitmanipulation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/flipping-bits/problem">problem</a>
 * @since 2018-12-24
 */

public class FlippingBits {
    static long flippingBits(long n) {
        return n ^ ((1L << 32) - 1);
    }

    public static void main(String[] args) {
        System.out.println(flippingBits(9));
    }
}
