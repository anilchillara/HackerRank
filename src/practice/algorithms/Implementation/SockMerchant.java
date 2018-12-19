package practice.algorithms.Implementation;


import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/sock-merchant/problem">problem</a>
 * @since 2018-12-19
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        return Arrays.stream(ar)
                .boxed()
                .collect(Collectors.groupingBy(e -> e))
                .entrySet()
                .stream()
                .map(e -> e.getValue().size() / 2)
                .mapToInt(x -> x)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Num Pairs : " + sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

}
