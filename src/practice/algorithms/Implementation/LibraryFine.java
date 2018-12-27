package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/library-fine/problem">problem</a>
 * @since 2018-12-27
 */

public class LibraryFine {
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) {
            return 10000;
        } else if (m1 > m2 && y1 == y2) {
            return 500 * (m1 - m2);
        } else if (d1 > d2 && m1 == m2 && y1 == y2) {
            return 15 * (d1 - d2);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Fine :: " + libraryFine(9, 6, 2015, 6, 6, 2015));
    }
}
