package practice.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
