package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem">problem</a>
 * @since 2018-12-21
 */

public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {
        if (s.length() + t.length() <= k) {
            return "Yes";
        }
        //Here we start the real logic:
        StringBuilder sb = new StringBuilder(s);
        int remove = findMaximumSimilarity(s, t);
        //delete everything that is needed from s:
        sb.delete(remove, s.length());
        int counter = k - (s.length() - remove);
        //and add everything that is needed to s:
        for (int i = remove; i < t.length() && counter > 0; i++) {
            sb.append(t.charAt(i));
            counter--;
        }
        // Now we need to check if t equals to s, but we also need to put the counter to zero (because we need to use the full k iterations), so we just need to check if k%2 == 0, so we can remove / add the same letter.
        if (counter >= 0 && counter % 2 == 0 && t.equals(sb.toString())) {
            return "Yes";
        }
        return "No";
    }

    private static int findMaximumSimilarity(String s, String t) {
        int i;
        for (i = 0; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("ashley", "ash", 2));
        System.out.println(appendAndDelete("aba", "aba", 7));
    }
}
