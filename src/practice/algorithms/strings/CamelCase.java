package practice.algorithms.strings;

import java.util.Arrays;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/camelcase/problem">problem</a>
 * @since 2018-12-25
 */
public class CamelCase {
    static int camelcase(String s) {
        return (int)s.chars().filter((c)->Character.isUpperCase(c)).count() + 1;
    }

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
