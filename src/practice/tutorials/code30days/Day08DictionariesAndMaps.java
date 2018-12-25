package practice.tutorials.code30days;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem">problem</a>
 * @since 2018-12-25
 */

public class Day08DictionariesAndMaps {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), phone;
        Map<String, Integer> phoneMap = new LinkedHashMap<>();
        String name;

        for (int i = 0; i < n; i++) {
            name = in.next();
            phone = in.nextInt();
            // Write code here
            phoneMap.put(name, phone);
        }
        while (in.hasNext()) {
            name = in.next();
            // Write code here
            if (phoneMap.containsKey(name)) {
                System.out.println(name + "=" + phoneMap.get(name));
            } else
                System.out.println("Not found");
        }
        in.close();
    }
}
