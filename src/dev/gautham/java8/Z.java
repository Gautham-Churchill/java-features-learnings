package dev.gautham.java8;

@FunctionalInterface
public interface Z {
    /**
     * Prior to Java 8 we can only declare methods in interface
     */
    void add();

    /**
     * Uncommenting below line will throw compile time error.
     * In Java 8 in an functional interface we can define only one abstract method
     */
    //void subtract();

    /**
     * In Java 8, we can define methods in an interface by providing key 'default'
     *
     */
    default void show() {

    }
}
