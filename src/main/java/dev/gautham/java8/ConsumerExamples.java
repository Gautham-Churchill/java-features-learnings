package dev.gautham.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Example of {@link Consumer} class in Java.
 * See <a href="https://www.geeksforgeeks.org/java-8-consumer-interface-in-java-with-examples">Code examples</a>
 */
public class ConsumerExamples {
    public static void main(String[] args) {
        understandingConsumers();

        manipulateStringsUsingConsumers();

        manipulateNumbersUsingConsumers();

        manipulateNumbersByConditionUsingConsumers();

        andThenExampleUsingConsumers();
    }

    private static void understandingConsumers() {
        Consumer<String> name = a -> System.out.println(a);
        name.accept("John");
    }

    private static void manipulateStringsUsingConsumers() {
        // manipulate each string
        Consumer<List<String>> wishNames = list -> list
                .forEach(name1 -> System.out.print("Hi " + name1 + "\t"));
        wishNames.accept(List.of("John", "Doe"));
    }

    private static void manipulateNumbersUsingConsumers() {
        // multiply all given numbers
        Consumer<List<Integer>> doubleTheValue =
                list -> list.forEach(i -> System.out.println(2 * i));
        doubleTheValue.accept(List.of(1,2,3,4,5));
    }

    private static void manipulateNumbersByConditionUsingConsumers() {
        // multiply all odd numbers
        Consumer<List<Integer>> doubleTheEvenValue =
                list -> list.forEach(i -> { if(i % 2 != 0) System.out.println(2 * i); });
        doubleTheEvenValue.accept(List.of(1,2,3,4,5));
    }

    private static void andThenExampleUsingConsumers() {
        System.out.println("******************\nandThenExample\n******************");
        //andThen() Example
        Consumer<List<Integer>> modInt = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, (2 * list.get(i)));
            }
        };
        Consumer<List<Integer>> displayInt = list -> list.forEach(System.out::println);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        modInt.andThen(displayInt).accept(list);
    }
}
