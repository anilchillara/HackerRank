package practice.algorithms.strings;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/palindrome-index/problem">problem</a>
 * @since 2018-12-25
 */
public class PalindromeIndex {
    static int palindromeIndex(String s) {
        String si, sj;
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--)
            if (s.charAt(i) != s.charAt(j)) {
                si = (new StringBuilder(s)).deleteCharAt(i).toString();
                sj = (new StringBuilder(s)).deleteCharAt(j).toString();
                if (isPalindrome(si)) return i;
                else if (isPalindrome(sj)) return j;
                else return -1;
            }
        return -1;
    }

    static boolean isPalindrome(String s) {
        String sr = (new StringBuilder(s)).reverse().toString();
        return s.equals(sr);
    }

    public static void main(String[] args) {
        System.out.println(palindromeIndex("aaab"));
    }
}
