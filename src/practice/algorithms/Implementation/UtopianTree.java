package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/utopian-tree/problem">problem</a>
 * @since 2018-12-19
 */
public class UtopianTree {
    static int utopianTree(int n) {
        Double height = (n % 2 == 0) ? Math.pow(2, ((n / 2) + 1)) - 1 : Math.pow(2, ((n / 2) + 2)) - 2;
        return height.intValue();
    }


    public static void main(String[] args) {
        System.out.println(utopianTree(5));
        System.out.println(utopianTree(3));
    }
}
