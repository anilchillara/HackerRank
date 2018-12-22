package practice.algorithms.Implementation;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/taum-and-bday/problem">problem</a>
 * @since 2018-12-22
 */

public class OrganizingContainersOfBalls {
    static String organizingContainers(int[][] container) {
        int[] horizArrSums = new int[container.length];
        int[] verticalArrSums = new int[container.length];
        for (int i = 0; i < container.length; i++) {
            for (int j = 0; j < container[i].length; j++) {
                horizArrSums[i] += container[i][j];
                verticalArrSums[i] += container[j][i];
            }
        }
        Arrays.sort(horizArrSums);
        Arrays.sort(verticalArrSums);
        return (Arrays.equals(horizArrSums, verticalArrSums)) ? "Possible" : "Impossible";
    }

    public static void main(String[] args) {
        System.out.println(organizingContainers(new int[][]
                {{1, 4},
                        {2, 3}}));
        System.out.println(organizingContainers(new int[][]
                {{1, 1},
                        {1, 1}}));
        System.out.println(organizingContainers(new int[][]
                {{1, 3, 1},
                        {2, 1, 2},
                        {3, 3, 3}}));
        System.out.println(organizingContainers(new int[][]
                {{0, 2, 1},
                        {1, 1, 1},
                        {2, 0, 0}}));
    }
}
