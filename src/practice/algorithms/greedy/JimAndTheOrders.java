package practice.algorithms.greedy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/jim-and-the-orders/problem">problem</a>
 * @since 2018-12-24
 */

public class JimAndTheOrders {
    static int[] jimOrders(int[][] orders) {

        Map<Integer, Integer> custMap = new LinkedHashMap<>();
        IntStream.range(0, orders.length)
                .forEachOrdered(value -> {
                    //System.out.println(value + 1 + "  " + Arrays.stream(orders[value]).sum());
                    custMap.put(value, Arrays.stream(orders[value]).sum());
                });
        //System.out.println("Act::" + custMap);
        Map<Integer, Integer> result = custMap.entrySet()
                .stream()
                .sorted((Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //System.out.println("Sorted::" + result);
        return result.keySet().stream().mapToInt(z -> z + 1).toArray();
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(jimOrders(new int[][]{{1, 3}, {2, 3}, {3, 3}})));
        System.out.println(Arrays.toString(jimOrders(new int[][]{{8,1},{4,2},{5,6},{3,1},{4,3}})));

    }
}


