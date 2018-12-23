package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/encryption/problem">problem</a>
 * @since 2018-12-22
 */

public class SherlockAndSquares {
    static int squares(int a, int b) {
        /*return (int) IntStream.rangeClosed(a,b)
                .filter(i->Math.pow((int) Math.sqrt(i),2) == i)
                .count();*/
        /*return (int) IntStream.rangeClosed(a,b)
                .filter(i->{
                    double root = Math.sqrt(i);
                    return (root - (int) root == 0);
                })
                .count();*/
        return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
    }

    public static void main(String[] args) {
        System.out.println("num perfect squares :: " + squares(3, 9));
        System.out.println("num perfect squares :: " + squares(17, 24));
    }
}
