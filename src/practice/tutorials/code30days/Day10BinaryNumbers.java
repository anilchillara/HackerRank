package practice.tutorials.code30days;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/30-binary-numbers/problem">problem</a>
 * @since 2018-12-27
 *
 */

public class Day10BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a number ::");
        String binaryStr = Integer.toString(scanner.nextInt(), 2);
        System.out.println(binaryStr);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(
                Arrays.stream(binaryStr.split("0")).mapToInt(x -> x.length()).max().getAsInt()
        );

        scanner.close();
    }
}
