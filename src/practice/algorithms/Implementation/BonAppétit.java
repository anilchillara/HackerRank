package practice.algorithms.Implementation;


import java.util.Arrays;
import java.util.List;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/bon-appetit/problem">problem</a>
 * @since 2018-12-18
 */

public class BonAppétit {
    static void bonAppetit(List<Integer> bill, int rejectItemIndex, int billPaid) {

        int totalBill = bill.stream().reduce((i, j) -> i + j).get();
        int actualBill = totalBill - bill.get(rejectItemIndex);
        int actualShare = actualBill / 2;
        if (actualShare == billPaid)
            System.out.println("Bon Appetit");
        else
            System.out.println(billPaid - actualShare);

    }

    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
    }
}
