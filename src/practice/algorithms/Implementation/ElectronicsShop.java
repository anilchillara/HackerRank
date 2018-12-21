package practice.algorithms.Implementation;


/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/electronics-shop/problem">problem</a>
 * @since 2018-12-19
 */

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sum = keyboards[i] + drives[j];
                if (sum <= b)
                    if (sum > max)
                        max = sum;
            }
        }
        return (max > 0) ? max : -1;
    }

    public static void main(String[] args) {
        System.out.println("Money spent :: " + getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
    }
}
