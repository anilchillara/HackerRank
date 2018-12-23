package practice.tutorials.code30days;

import java.util.Scanner;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/30-review-loop/problem">problem</a>
 * @since 2018-12-22
 */

public class Day06LetsReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        String myString, evenChars, oddChars;
        char[] charArray;
        for (int c = 0; c < cases; c++) {
            evenChars = oddChars = "";
            myString = scan.next();
            charArray = myString.toCharArray();
            for (int i = 0; i < charArray.length; i += 2) {
                evenChars += charArray[i];
            }
            for (int j = 1; j < charArray.length; j += 2) {
                oddChars += charArray[j];
            }
            System.out.println(evenChars + " " + oddChars);
        }
    }
}
