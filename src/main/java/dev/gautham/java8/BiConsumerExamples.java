package dev.gautham.java8;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExamples {
    public static void main(String[] args) {
        manipulatingBiConsumers();

        manipulateBiConsumersList();

        manipulateListOfBiConsumersList();
    }

    private static void manipulatingBiConsumers() {
        BiConsumer<String, Integer> userInfo = (k,v) -> System.out.println("Name: " + k +", Age:" + v);
        userInfo.accept("John Doe", 25);
    }

    private static void manipulateBiConsumersList() {
        BiConsumer<String, Integer> userInfo = (k,v) -> System.out.println("Hi " + k +" of age" + v);
        userInfo.accept("John Doe", 25);
    }

    private static void manipulateListOfBiConsumersList() {
        BiConsumer<List<String>, List<String>> equals = (list1, list2) -> {
            if (list1.size() != list2.size()) {
                System.out.println(false);
                return;
            }
            for (int i = 0; i < list1.size(); i++) {
                if(list1.get(i) != list2.get(i)) {
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
        };

        BiConsumer<List<String>, List<String>> display = (list1, list2) -> {
            System.out.print("List 1: ");
            list1.forEach(s -> System.out.print(s + " "));
            System.out.println();
            System.out.print("List 2: ");
            list2.forEach(s -> System.out.print(s + " "));
            System.out.println();
        };

        List<String> list1 = List.of("John", "Steff", "Greg");
        List<String> list2 = List.of("John", "Steff", "Andrews");
        equals.andThen(display).accept(list1, list2);
    }
}
