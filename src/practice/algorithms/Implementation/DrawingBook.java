package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/drawing-book/problem">problem</a>
 * @since 2018-12-19
 */

public class DrawingBook {
    static int pageCount(int numPages, int pageToOpen) {
        return Math.min(pageToOpen / 2, numPages / 2 - pageToOpen / 2);
    }

    public static void main(String[] args) {
        System.out.println("Minimum possibilities : " + pageCount(6, 2));
        System.out.println("Minimum possibilities : " + pageCount(2059, 117));
    }

}
