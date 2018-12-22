package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/find-digits/problem">problem</a>
 * @since 2018-12-21
 */

public class FindDigits {
    static int findDigits(int n) {
        return (int) (n + "").chars()
                .mapToObj(i -> Character.getNumericValue(i))
                .filter(i -> i > 0 && n % i == 0)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(findDigits(102));
        System.out.println(findDigits(1012));
    }
}
