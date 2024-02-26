package dev.gautham.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,6,8,3,7,1,5);

        /* Predicate<Integer> filter = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2 == 1;
            }
        };

        Function<Integer, Integer> apply = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n * 2;
            }
        };

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        BinaryOperator<Integer> reduce = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        }; */

        // the filter, apply and consumer variable shows how the line in 44 is simplified
        // to print all the odd numbers
        //nums.stream().filter(filter).sorted().map(apply).forEach(consumer);
        // th reduce variable shows how the line in 46 is simplified
        // to print all the odd number
        //nums.stream().filter(n -> n%2==1).sorted().map(n -> n*2).reduce(reduce);
        Optional<Integer> result = nums.stream().filter(n -> n%2==1).sorted().map(n -> n*2).reduce((m, n) -> m+n);
        System.out.println(result.orElse(0));
    }
}
