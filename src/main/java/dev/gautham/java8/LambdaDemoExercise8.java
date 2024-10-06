package dev.gautham.java8;

import dev.gautham.java17.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaDemoExercise8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sri", "Kumar", 30),
                new Person("Ram", "Ganesh", 27),
                new Person("Manoj", "Kumar", 31),
                new Person("John", "Doe", 26),
                new Person("Vijay", "Sethupathu", 40)
        );

        //Step 1: Sort list by lastName
        people.sort(Comparator.comparing(Person::lastName));
        // above line can be written as -> people.sort(Comparator.comparing(Person::lastName));

        // So easy to compare several values in an object as shown in below code
        //Collections.sort(people, Comparator.comparing(Person::lastName).thenComparing(Person::firstName));

        //Step 2: Create a method the prints all elements in the list
        System.out.println("Printing all persons in the list");
        filterPeopleByCondition(people, p -> true);

        //Step 3: Create a method that prints all people that have last name starting with K
        System.out.println("Filtering People by last name");
        filterPeopleByCondition(people, p -> p.lastName().startsWith("K"));
    }

    private static void filterPeopleByCondition(List<Person> people, Predicate<Person> predicate) {
        people.stream().filter(predicate).forEach(System.out::println);
    }
}
