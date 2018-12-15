package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @since 2018-12-14
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/kangaroo/problem">problem</a>
 */

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        return (v1 > v2 && (x2 - x1) % (v1 - v2) == 0) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
        System.out.println(kangaroo(0,2,5,3));
    }
}
