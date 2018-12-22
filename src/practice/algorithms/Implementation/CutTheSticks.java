package practice.algorithms.Implementation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/cut-the-sticks/problem">problem</a>
 * @since 2018-12-21
 */

public class CutTheSticks {
    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr, 0, arr.length);
        int prev = arr[0];
        int cur;
        List<Integer> out = new ArrayList<>();
        out.add(arr.length);
        for(int i = 1; i<arr.length; i++){
            cur = arr[i];
            if (cur != prev){
                out.add(arr.length - (i));
            }
            prev = cur;
        }
        return out.stream().mapToInt((Integer i) -> i.intValue()).toArray();

    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(cutTheSticks(new int[]{5,4,4,2,2,8}))
        );
    }
}
