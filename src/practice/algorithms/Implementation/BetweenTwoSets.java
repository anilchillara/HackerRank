package practice.algorithms.Implementation;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @since 2018-12-16
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/between-two-sets/problem">problem</a>
 */

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
        return (int) IntStream.rangeClosed(
                Arrays.stream(a).max().getAsInt(),
                Arrays.stream(b).min().getAsInt())
                .filter(el -> {
                    for (int ela : a) {
                        if (el % ela != 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .filter(el -> {
                    for (int elb : b) {
                        if (elb % el != 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .count();
    }

    static int GCD(int a, int b) { return b==0 ? a : GCD(b, a%b); }
    // method to return LCM of two numbers
    static int LCM(int a, int b) {  return (a*b)/GCD(a, b); }

    public static void main(String[] args) {
        System.out.println(getTotalX(new int[]{2, 4}, new int[]{32,96,16}));
    }
}
