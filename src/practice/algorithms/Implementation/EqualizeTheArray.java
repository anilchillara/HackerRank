package practice.algorithms.Implementation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/equality-in-a-array/problem">problem</a>
 * @since 2018-12-25
 */
public class EqualizeTheArray {

    static int equalizeArray(int[] arr) {

        return arr.length -  Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream()
                .sorted(Comparator.reverseOrder()).findFirst().get().intValue();


        /*List<Integer> numLst = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return arr.length - IntStream.rangeClosed(0, arr.length )
                .map(x -> Collections.frequency(numLst, x))
                .max().getAsInt();*/
    }

    public static void main(String[] args) {
        System.out.println(equalizeArray(new int[]{1,1,1,3,2,2,2,1}));
        System.out.println(equalizeArray(new int[]{35,32,32,37,72,72,96,12,32,67,37,57,18,57,78,29,34,67,16,34,78,72,33,96,16,37,32,87,43,29,16,48,49,29,37,32}));
    }
}
