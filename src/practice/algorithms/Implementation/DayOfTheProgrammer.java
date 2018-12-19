package practice.algorithms.Implementation;


/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/divisible-sum-pairs/problem">problem</a>
 * @since 2018-12-18
 */

public class DayOfTheProgrammer {

    static String dayOfProgrammer(int year) {
        if (year == 1918)
            return "26.09.1918";
        else if (((year <= 1917) && (year % 4 == 0)) ||
                ((year > 1918) && (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))))
            return "12.09." + year;
        else
            return "13.09." + year;
    }

    public static void main(String[] args) {
        System.out.println("Date ::: " + dayOfProgrammer(2015));
    }

}
