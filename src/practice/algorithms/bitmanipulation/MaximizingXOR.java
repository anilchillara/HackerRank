package practice.algorithms.bitmanipulation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/maximizing-xor/problem">problem</a>
 * @since 2018-12-25
 */
public class MaximizingXOR {
    static int maximizingXor(int l, int r) {
        return (Integer.highestOneBit(l ^ r) << 1) - 1;
    }

    public static void main(String[] args) {
        System.out.println(maximizingXor(10,15));
        System.out.println(maximizingXor(11,100));
    }
}