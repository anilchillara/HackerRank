package practice.algorithms.Implementation;

import java.util.stream.Stream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem">problem</a>
 * @since 2018-12-20
 */

public class BeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        return (int) Stream.iterate(i, n -> n + 1).limit(j - i + 1)
                .filter(val -> (val - Integer.parseInt(new StringBuffer(val + "")
                        .reverse().toString())) % k == 0).count();
    }

    public static void main(String[] args) {
        String x = 245 + "";
        System.out.println(beautifulDays(20,23,6));
    }
}
