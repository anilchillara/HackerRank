package practice.algorithms.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/missing-numbers/problem">problem</a>
 * @since 2018-12-23
 */
public class MissingNumbers {
    static int[] missingNumbers(int[] arr, int[] brr) {
        List<Integer> firstList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(brr).boxed().collect(Collectors.toList());
        List<Integer> ans = new ArrayList<>();
        int i = 0, num;
        while (!secondList.isEmpty()) {
            num = secondList.get(i);
            if (Collections.frequency(firstList, num) != Collections.frequency(secondList, num)) {
                ans.add(num);
            }
            firstList.removeAll(Collections.singleton(num));
            secondList.removeAll(Collections.singleton(num));
        }

        Collections.sort(ans);
        //for (int x : ans) System.out.print(x + " ");
        return ans.stream().mapToInt(e -> e).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(missingNumbers(
                new int[]{203, 204, 205, 206, 207, 208, 203, 204, 205, 206},
                new int[]{203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204}
        )));
    }
}
