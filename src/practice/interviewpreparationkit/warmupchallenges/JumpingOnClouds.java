package practice.interviewpreparationkit.warmupchallenges;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem">problem</a>
 * @since 2018-12-20
 */
public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c) {
        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == 0) i++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0,0,0,1,0,0}));
        System.out.println(jumpingOnClouds(new int[]{0,0,1,0,0,1,0}));
        System.out.println(jumpingOnClouds(new int[]{0,0,0,0,1,0}));
    }
}
