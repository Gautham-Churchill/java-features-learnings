package dev.gautham.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2,4,6,8,1);

        /**
         * External loops available in Java 7
         */
        /*for(int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        // Enhanced forLoop
        for (int i :values) {
            System.out.println(i);
        }*/

        /**
         * Internal loops available in Java 8
         */
        values.forEach(i -> System.out.println(i)); // Lambda expression // With Consumer interface
        values.forEach(System.out::println);
    }
}
