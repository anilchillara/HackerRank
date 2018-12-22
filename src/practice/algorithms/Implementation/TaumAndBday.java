package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/taum-and-bday/problem">problem</a>
 * @since 2018-12-22
 */

public class TaumAndBday {
    /**
     * All parameters are long
     *
     * @param b
     * @param w
     * @param bc
     * @param wc
     * @param z
     * @return
     */
    static long taumBday(long b, long w, long bc, long wc, long z) {

        return b * Math.min(bc, wc + z) + w * Math.min(wc, bc + z);
    }


    public static void main(String[] args) {
        System.out.println(taumBday(3, 5, 3, 4, 1));
    }
}


