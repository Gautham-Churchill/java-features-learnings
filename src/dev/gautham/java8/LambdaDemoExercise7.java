package dev.gautham.java8;

import dev.gautham.java17.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemoExercise7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
          new Person("Sri", "Kumar", 30),
          new Person("Ram", "Ganesh", 27),
          new Person("Manoj", "Kumar", 31),
          new Person("John", "Doe", 26),
          new Person("Vijay", "Sethupathu", 40)
        );

        //Step 1: Sort list by lastName
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        });



        //Step 2: Create a method the prints all elements in the list
        System.out.println("Printing all persons in the list");
        filterPeopleByCondition(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return true;
            }
        });


        //Step 3: Create a method that prints all people that have last name starting with K
        System.out.println("Filtering People by last name");
        filterPeopleByCondition(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.lastName().startsWith("K");
            }
        });
    }

    private static void filterPeopleByCondition(List<Person> people, Condition condition) {
        for (Person p: people) {
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }
}

interface Condition {
    boolean test(Person p);
}