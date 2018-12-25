package practice.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/countingsort1/problem">problem</a>
 * @since 2018-12-25
 */
public class CountingSort1 {

    static int[] countingSort(int[] arr) {
        List<Integer> numLst = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return IntStream.rangeClosed(0, 100 )
                .map(x -> Collections.frequency(numLst, x))
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countingSort(new int[]{1,1,3,2,1})));
    }
}
