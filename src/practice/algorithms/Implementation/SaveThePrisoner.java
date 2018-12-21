package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/save-the-prisoner/problem">problem</a>
 * @since 2018-12-20
 */

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        return (m + s - 2) % n + 1;
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7, 19, 2));
        System.out.println(saveThePrisoner(3, 7, 3));
    }
}
