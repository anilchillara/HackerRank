package practice.tutorials.code30days.day1;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/30-operators/problem">problem</a>
 * @since 2018-12-19
 */

public class Operators {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        int total = (int) Math.round(meal_cost + tip + tax);
        System.out.println("Total Cost :: " + total);
    }

    public static void main(String[] args) {
        solve(12.0,20,8);
    }
}
