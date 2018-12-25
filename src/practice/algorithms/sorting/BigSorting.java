package practice.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/big-sorting/problem">problem</a>
 * @since 2018-12-25
 */

public class BigSorting {
    static String[] bigSorting(String[] unsorted) {
        return Arrays.stream(unsorted)
                .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo))
                .toArray(String[]::new);
        /*return Arrays.stream(unsorted)
                .map(BigInteger::new)
                .sorted()
                .map(e -> e.toString())
                .toArray(String[]::new);
        */
    }

    static FastReader fr = new FastReader();

    public static void main(String[] args) throws IOException {
        int n = fr.nextInt();

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = fr.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted);

        Arrays.stream(result).forEach(System.out::println);
        //bigSorting(new String[]{"31415926535897932384626433832795", "1", "3", "10", "3", "5"});
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
