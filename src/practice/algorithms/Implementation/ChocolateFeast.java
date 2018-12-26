package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/chocolate-feast/problem">problem</a>
 * @since 2018-12-25
 */
public class ChocolateFeast {
    static int chocolateFeast(int n, int c, int m) {
        n = n / c;
        int remaining = m + n;
        while (remaining > m) {
            remaining -= m;
            n++;
            remaining++;
        }

        return n - 1;

    }

    public static void main(String[] args) {
        System.out.println(chocolateFeast(10,2,5));
    }
}
