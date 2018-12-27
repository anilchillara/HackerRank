package practice.algorithms.Implementation;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/flatland-space-stations/problem">problem</a>
 * @since 2018-12-27
 *
 * @implNote Three runtime errors on submitting this. 22.5 out of 25.
 */

public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        int currMid = n - c[c.length - 1] - 1;
        int mid = IntStream.range(1, c.length)
                .map(value -> (Math.abs(c[value] - c[value - 1])) / 2)
                .max().getAsInt();
        //return Math.max(currMid,mid);

 /*       if (currMid/2 < mid && mid  > c[0]) {
            System.out.println("111" + mid );
        }  //b/w various cities
        else if (c[0] > currMid) {
            System.out.println("2222" + c[0]);
        }  //from starting city
        else {
            System.out.println("3333" + currMid);
        }  //from last city
*/
        return Math.max(Math.max(currMid,mid),c[0]);
    }

    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(6, new int[]{0, 1, 2, 4, 3, 5}));
        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}));
        System.out.println(flatlandSpaceStations(19, new int[]{68, 81, 46, 54, 30, 11, 19, 23, 22, 12, 38, 91, 48, 75, 26, 86, 29, 83, 62}));
    }
}
