package practice.algorithms.strings;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/funny-string/problem">problem</a>
 * @since 2018-12-25
 */
public class FunnyString {

    static String funnyString(String s) {
        String difference = "", differenceReverse = "", reverse = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < s.length() - 1; i++) {
            difference += Integer.toString(Math.abs(s.charAt(i) - s.charAt(i + 1)));
            differenceReverse += Integer.toString(Math.abs(reverse.charAt(i) - reverse.charAt(i + 1)));
        }
        return (difference.compareTo(differenceReverse) == 0) ? "Funny": "Not Funny";
    }

    public static void main(String[] args) {
        System.out.println(funnyString("acxz"));
        System.out.println(funnyString("bcxz"));
    }
}
