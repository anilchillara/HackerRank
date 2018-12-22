package practice.algorithms.Implementation;


/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/encryption/problem">problem</a>
 * @since 2018-12-22
 */
public class Encryption {

    static String encryption(String s) {
        s = s.replaceAll(" ", "");
        int n = s.length();
        int col = (int) Math.ceil(Math.sqrt(n));
        int row = (int) Math.floor(Math.sqrt(n));
        if (col * row < n)
            row = col;
        String res = "";

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                int pos = (j * col) + i;
                if (pos < n)
                    res += s.charAt(pos);
            }
            res += " ";
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(encryption("have a nice day"));
        System.out.println(encryption("feedthedog"));
        System.out.println(encryption("chill out"));
        System.out.println(encryption("if man was meant to stay on the ground god would have given us roots"));
    }
}
