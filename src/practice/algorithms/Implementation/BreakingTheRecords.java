package practice.algorithms.Implementation;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem">problem</a>
 * @since 2018-12-17
 */
public class BreakingTheRecords {
    static int numOfBestRecord = 0;
    static int numOfWorstRecord = 0;
    static int currentBest = 0;
    static int currentWorse = 0;

    static int[] breakingRecords(int[] scores) {
        //reset counters.
        numOfBestRecord = numOfWorstRecord = 0;
        currentBest = currentWorse = scores[0];
        Arrays.stream(scores).forEach(score -> {
            if (score > currentBest) {
                currentBest = score;
                numOfBestRecord++;
            }
            if (score < currentWorse) {
                currentWorse = score;
                numOfWorstRecord++;
            }
        });
        return new int[]{numOfBestRecord, numOfWorstRecord};
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1})
                )
        );
        System.out.println(
                Arrays.toString(
                        breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42})
                )
        );
    }
}
