package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/lisa-workbook/problem">problem</a>
 * @since 2018-12-26
 */

public class LisasWorkbook {
    static int workbook(int n, int k, int[] arr) {
        int specialProb = 0, page = 0;
        for (int i = 0; i < n; i++) {
            page += 1;
            for (int j = 1; j <= arr[i]; j++) {
                if (j == page)
                    specialProb += 1;
                if (j % k == 0 && j != arr[i])
                    page += 1;
//                System.out.println("I:" + i + " J:" + j + " Spe :" + specialProb + " Page : " + page);
            }
        }
        return specialProb;
    }

    public static void main(String[] args) {
        System.out.println(workbook(5,3,new int[]{4,2,6,1,10}));
    }
}
