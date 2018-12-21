package practice.interviewpreparationkit.warmupchallenges;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/repeated-string/problem">problem</a>
 * @since 2018-12-20
 */

public class RepeatedString {

    static long repeatedString(String s, long n) {
        return (s.chars().mapToObj(c -> (char) c)
                .filter(ss -> ss == 'a').count() * (n / (long) s.length())) +
                s.substring(0, (int) (n % s.length())).chars()
                        .mapToObj(c -> (char) c).filter(ss -> ss == 'a').count();
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("abc", 100));
    }
}
