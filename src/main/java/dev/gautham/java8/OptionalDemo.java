package dev.gautham.java8;

import dev.gautham.java17.Cat;

import java.util.Optional;
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findByName("Amber");
        System.out.println(optionalCat.orElse(new Cat("UNKNOW", 0)));
        System.out.println(optionalCat.map(Cat::age).orElse(0));
    }

    private static Optional<Cat> findByName(String name) {
        Cat newCat = new Cat(name, 3);
        return Optional.ofNullable(newCat);
        //return Optional.ofNullable(null);
    }

}
