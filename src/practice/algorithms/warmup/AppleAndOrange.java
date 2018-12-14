package practice.algorithms.warmup;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @since 2018-12-14
 * @version 1.0
 */
public class AppleAndOrange {
    static void countApplesAndOranges(int houseStart, int houseEnd,
                                      int appleTree, int orangeTree,
                                      int[] apples, int[] oranges) {
        System.out.println(
                Arrays.stream(apples).map(i-> i+=appleTree)
                .filter(i-> i>=houseStart && i<=houseEnd).count());
        System.out.println(
                Arrays.stream(oranges).map(i-> i+=orangeTree)
                .filter(i-> i>=houseStart && i<=houseEnd).count());
    }

    public static void main(String[] args) {
        countApplesAndOranges(7,11, 5,
                15,new int[]{-2,2,1},new int[]{5,-6});
    }
}
