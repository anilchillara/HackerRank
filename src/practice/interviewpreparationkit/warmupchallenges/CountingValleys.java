package practice.interviewpreparationkit.warmupchallenges;


/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/counting-valleys/problem">problem</a>
 * @since 2018-12-19
 */

public class CountingValleys {
    static int countingValleys(int n, String s) {
        int numOfValleys = 0;
        int currentLevel = 0; //0 = sea level

        boolean inValley = false;

        for (int i = 0; i < n; i++) {
            currentLevel += (s.charAt(i) == 'U') ? 1 : -1;
            if (currentLevel == 0)
                inValley = false;
            else if (currentLevel < 0 && !inValley) {
                numOfValleys++;
                inValley = true;
            }
        }

        return numOfValleys;
    }

    public static void main(String[] args) {
        System.out.println("Num Valleys :: " + countingValleys(8, "UDDDUDUU"));
        System.out.println("Num Valleys :: " + countingValleys(12, "DDUUDDUDUUUD"));
        System.out.println("Num Valleys :: " + countingValleys(8, "DDUUUUDD"));

    }
}
