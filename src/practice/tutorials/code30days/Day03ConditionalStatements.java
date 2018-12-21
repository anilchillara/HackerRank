package practice.tutorials.code30days;


import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/30-conditional-statements/problem">problem</a>
 * @since 2018-12-20
 */

public class Day03ConditionalStatements {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println((N%2 ==1 || (N%2 == 0 && N > 5 && N < 21))?"Weird":"Not Weird");

        scanner.close();
    }
}
