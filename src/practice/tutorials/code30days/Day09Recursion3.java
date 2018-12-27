package practice.tutorials.code30days;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/30-recursion/problem">problem</a>
 * @since 2018-12-26
 */

public class Day09Recursion3 {
    static int factorial(int n) {
        if(n<=1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(12));
    }
}
