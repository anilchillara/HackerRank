package practice.interviewpreparationkit.arrays;

import java.util.Arrays;
/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem">problem</a>
 * @since 2018-12-22
 */
public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int[] modified = new int[a.length];
        if(d == a.length) return a;
        System.arraycopy(Arrays.copyOfRange(a, d , a.length), 0, modified, 0, a.length-d);
        System.arraycopy(Arrays.copyOfRange(a, 0, d), 0, modified, a.length-d, d);
        return modified;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotLeft(new int[]{1,2,3,4,5}, 2)));
    }
}
