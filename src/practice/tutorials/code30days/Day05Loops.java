package practice.tutorials.code30days;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/30-loops/problem">problem</a>
 * @since 2018-12-22
 */

public class Day05Loops {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        IntStream.rangeClosed(1, 10)
                .forEach(r -> System.out.println(n + " x " + r + " = " + n * r));

        scanner.close();
    }
}
