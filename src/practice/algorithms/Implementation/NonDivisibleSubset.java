package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/non-divisible-subset/problem">problem</a>
 * @since 2018-12-21
 */

public class NonDivisibleSubset {
    static int nonDivisibleSubset(int k, int[] S) {
        int[] reminders = new int[k];
        int result = 0;
        for (int i = 0; i < S.length; i++) {
            reminders[S[i] % k]++;
        }
        if (reminders[0] > 0)
            result++;

        for (int i = 1, j = reminders.length - i; i < j; i++, j--) {
            result += Math.max(reminders[i], reminders[j]);
        }
        if (reminders.length % 2 == 0 && reminders[reminders.length % 2 + 1] > 0)
            result++;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(4, new int[]{19, 10, 12, 10, 24, 25, 22}));
        int k = 7;
        int[] S = {278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436};
        System.out.println(nonDivisibleSubset(k, S));
    }
}
