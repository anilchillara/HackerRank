package practice.algorithms.Implementation;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/migratory-birds/problem">problem</a>
 * @since 2018-12-18
 */

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Long> result = new LinkedHashMap<>();
        arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())
        ).entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));

        return result.keySet().stream().findFirst().get();
    }

    public static void main(String[] args) {
        int typeOfBird = migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3));
        System.out.println("Type :: " + typeOfBird);
    }
}
