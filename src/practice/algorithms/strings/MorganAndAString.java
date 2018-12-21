package practice.algorithms.strings;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem">problem</a>
 * @since 2018-12-19
 *
 * Repeated chunks causing timeouts
 * For example, String a = "AAAAAAAABBBBCCCCBBB", String b = "AAAAAAAABBBBCCCCBBBB",
 * We need to compare one char from the repeated chunk
 *
 */

public class MorganAndAString {
    static String morganAndString(String a, String b) {
        // Complete this function
        int lenA = a.length(), lenB = b.length();
        StringBuilder sb = new StringBuilder();
        int pA = 0, pB = 0;
        while (pA < lenA && pB < lenB) {
            if (a.charAt(pA) < b.charAt(pB)) {
                sb.append(a.charAt(pA++));
            } else if (a.charAt(pA) > b.charAt(pB)) {
                sb.append(b.charAt(pB++));
            } else {
                if (compare(a, pA + 1, b, pB + 1)) {
                    sb.append(a.charAt(pA++));
                    while (pA < a.length() && a.charAt(pA) == a.charAt(pA - 1)) {
                        sb.append(a.charAt(pA++));
                    }
                } else {
                    sb.append(b.charAt(pB++));
                    while (pB < b.length() && b.charAt(pB) == b.charAt(pB - 1)) {
                        sb.append(b.charAt(pB++));
                    }
                }
            }
        }

        if (pA < lenA) {
            sb.append(a.substring(pA));
        }

        if (pB < lenB) {
            sb.append(b.substring(pB));
        }

        return sb.toString();
    }

    private static boolean compare(String a, int i, String b, int j) {
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) < b.charAt(j)) return true;
            else if (a.charAt(i) > b.charAt(j)) return false;
            i++;
            j++;
        }

        return i == a.length() ? false : true;
    }

    public static void main(String[] args) {
        System.out.println(morganAndString("ACA", "BCF"));
        System.out.println(morganAndString("ABACABA", "ABACABA"));
        System.out.println(morganAndString("AAAAAAAABBBB", "AAAAAAAACCCC"));
        System.out.println(morganAndString("AAAAAAAABBBBCCCCBBB", "AAAAAAAABBBBCCCCBBBB"));
    }
}