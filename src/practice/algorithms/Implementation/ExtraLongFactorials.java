package practice.algorithms.Implementation;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/extra-long-factorials/problem">problem</a>
 * @since 2018-12-21
 */

public class ExtraLongFactorials {
    static void extraLongFactorials(int n) {
        BigInteger result = IntStream.rangeClosed(1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger::multiply).get();
        System.out.println(result);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
