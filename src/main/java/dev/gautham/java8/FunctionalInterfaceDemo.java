package dev.gautham.java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    /**
     * Prior to Java 8 we can only declare abstract methods in interface
     */
    void add();

    /**
     * Uncommenting below line will throw compile time error.
     * In Java 8 in a functional interface we can define only one abstract method.
     * Because we added @FunctionalInterface annotation
     */
    //void subtract();

    /**
     * In Java 8, we can define n number methods in an interface by providing key 'default' and 'static' keywords
     */
    default void show() {

    }
}
